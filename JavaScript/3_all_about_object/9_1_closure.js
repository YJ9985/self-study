/**
 * Closure
 * 
 * 클로저는 어떤 함수와 해당 함수가 선언된 렉시컬 환경의 조합이다
 * 상위 함수보다 하위 함수가 더 오래 살아있는 경우를 Closure 라고 한다
 */

function getNumber(){
  var num = 5

  function innerGetNumber(){
    return num;
  }

  return innerGetNumber()
}

// console.log(num) // error

console.log(getNumber())

function getNumber(){
  var num = 5

  function innerGetNumber(){
    return num
  }

  return innerGetNumber
}

const runner = getNumber()
console.log(runner)

// 1) 데이터 캐싱
function cacheFunction(newNum){
  // 아래 계산이 매우 오래걸린다는 가정을 했을 때
  var num = 10 * 10

  function innerCacheFuntion(newNum){
    return num * newNum
  }

  return innerCacheFuntion

}
const runner2 = cacheFunction()
console.log(runner2(19))
console.log(runner2(21))

function cacheFunction2(){
  var num = 99

  function increment(){
    num ++
    return num
  }

  return increment
}

const runner3 = cacheFunction2()
console.log(runner3())

// 3) 정보 은닉
function Person(name, year){
  this.name = name

  var _year = year;

  this.sayNameAndYear = function(){
    return `안녕하세요. 저는 ${this.name} 입니다. ${_year}에 태어났습니다.`
  }

}

const yeJi = new Person('예지', 1999)
console.log(yeJi.sayNameAndYear())