/**
 * this
 * 
 * JS는 Lexical Scope를 사용하기 때문에
 * 함수의 상위 스코프가 정의 지섬에 평가된다.
 * 
 * 하지만 this 키워드는 바인딩이 객체가 생성되는 시점에 결정된다
 */

const testFunction = function(){
  return this
}

console.log(testFunction())
console.log(testFunction() === global)

const yeJi = {
  name: '예지',
  year: 1999,
  sayHello: function(){
    return `안녕하세요. 저는 ${this.name}입니다.`
  }
}

console.log(yeJi.sayHello())

function Person(name, year){
  this.name = name;
  this.year = year;

  this.sayHello = function(){
    return `안녕하세요. 저는 ${this.name}입니다.`
  }
}

const yeJi2 = new Person('예지', 1999)
console.log(yeJi2.sayHello())

Person.prototype.dance = function(){
  function dance2(){
    return `${this.name} 춤을 춥니다.`
  }
  return dance2()
}
console.log(yeJi2.dance())

/**
 * this 키워드가 어떤걸 가리키냐는 세가지만 기억하면 된다
 * 
 * 1) 일반 함수 호출할 땐 this가 최상위 객체 (global 또는 window)를 가리킨다
 * 2) 메서드로 호출을 할 땐 호출된 객체를 가리킨다
 * 3) new 키워드를 사용해서 객체를 생성했을 땐 객체를 가리킨다
 */

/**
 * this 바인딩 방법 세가지
 * 
 * 1) apply()
 * 2) call()
 * 3) bind()
 */

function returnName(){
  return this.name;
}
console.log(returnName()) // undefined

const yeJi3 = {
  name: '예지'
}
// call: , 기반으로 아규먼트를 순서대로 넘겨줌
console.log(returnName.call(yeJi3))
// apply: 아규먼트를 리스트로 입력해야 한다
console.log(returnName.apply(yeJi3))

function multiply(x, y, z){
  return `${this.name} / 결과값 : ${x * y * z}`
}
console.log(multiply.call(yeJi3, 1, 2, 3))
console.log(multiply.apply(yeJi3, [1,3,6]))

// bind: 함수가 반환됨
const laterFunc = multiply.bind(yeJi3, 3, 4, 5)
console.log(laterFunc)
console.log(laterFunc())