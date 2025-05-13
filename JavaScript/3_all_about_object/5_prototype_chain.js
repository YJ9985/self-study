function person(year, name){
  this.year = year;
  this.name = name;

  this.sayHello = function(){
    return `${this.name}가 인사를 합니다.`
  }
}

const yeJi = new person(1999, '이예지')
console.log(yeJi.sayHello())

function person2(year, name){
  this.year = year;
  this.name = name;
}

person2.prototype.sayHello = function(){
  return `${this.name}가 인사를 합니다.`
}

const yeJi2 = new person2(1999, '이예지')
const yeWon = new person2(2002, '이예원')
console.log(yeJi2.sayHello())

console.log(yeJi2.sayHello === yeWon.sayHello) // true
console.log(yeJi2.hasOwnProperty('sayHello')) // false -> 상속받은 함수라는 뜻

person2.sayStaticHello = function(){
  return '이것은 static method 입니다.'
}

console.log(person2.sayStaticHello())

// Overriding
function person3(year, name){
  this.year = year;
  this.name = name;

  this.sayHello = function(){
    return '안녕하세요. 저는 instance method 입니다.'
  }
}

person3.prototype.sayHello = function(){
  return '안녕하세요. 저는 prototype method 입니다.'
}

const yeJi3 = new person3(1999, '이예지')
console.log(yeJi3.sayHello())

/**
 * getPrototypeOf, setPrototypeOf
 * 
 * 인스턴스의 __proto__ 변경 vs 함수의 prototype 변경
 */
function Person(year, name){
  this.name = name;
  this.year = year;
}

Person.prototype.sayHello = function(){
  return `${this.name} 인사를 합니다.`
}

function FemalePerson(name, year){
  this.name = name;
  this.year = year;

  this.dance = function(){
    return `${this.name}이 춤을 춥니다.`
  }
}

const yeJi11 = new Person(1999, '예지')
const yeWon11 = new FemalePerson('예원', 2002)

console.log(yeJi11.__proto__)
console.log(yeJi11.__proto__ === Person.prototype)
console.log(Object.getPrototypeOf(yeJi11) === Person.prototype)

console.log(yeJi11.sayHello())
console.log(yeWon11.dance())

Object.setPrototypeOf(yeWon11, Person.prototype)
console.log(yeWon11.sayHello())

FemalePerson.prototype = Person.prototype
const mom = new FemalePerson('혜영', 1971)
console.log(Object.getPrototypeOf(mom) === FemalePerson.prototype)