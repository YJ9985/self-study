/**
 * Scope
 */
// 1
var numberOne = 20

function levelOne(){
  numberOne = 40

  console.log(`1: ${numberOne}`)
}

levelOne()

// 2
var numberTwo = 20
function levelTwo(){
  var numberTwo = 40

  console.log(`2.1: ${numberTwo}`)
}

levelTwo()


console.log(`2.2: ${numberTwo}`)

// 3 
function levelThree(){
 var numberThree = 40

 function levelFour(){
  var numberFour = 99

  console.log(`levelFour numberThree : ${numberThree}`)
  console.log(`levelFour numberFour : ${numberFour}`)
 }

 levelFour()
 console.log(`levelThree numberThree: ${numberThree}`)
}

levelThree()
console.log(numberOne)
// console.log(numberFour) // error

/** 
 * JS -> Lexical Scope
 * 선언된 위치가 상위 스코프를 정한다
 * 
 * <-> Dynamic Scope
 * 실행한 위치가 상위 스코프를 정한다
 */
var numberFive = 5

function functionOne(){
  var numberFive = 100

  functionTwo()
}

function functionTwo(){
  console.log(`number Five : ${numberFive}`)
}

functionOne()

/**
 * var: 함수 레벨 스코프만 만들어낸다
 * let, const: 함수 레벨 스코프와 블록 레벨 스코프를 만들어낸다. 
 */
var i = 999

for(var i = 0; i < 10; i++){
  console.log(i)
}
console.log(`i in global scope: ${i}`) // i 값이 10으로 변경

i = 999
for(let i = 0; i < 10; i++){
  console.log(i)
}
console.log(`i in global scope: ${i}`) // i값이 999로 여전전