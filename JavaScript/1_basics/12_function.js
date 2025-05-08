/**
 * function : 함수
 */

/**
 * 만약 2라는 숫자에 * 10 / 2 % 3 한 값을
 * 스트링으로 변환해서 반환받고 싶다면?
 */

console.log((2 * 10 / 2 % 3).toString())

// 함수에서 입력받는 값에 대한 정의를 Parameter (= num)
function calculate(num){
  console.log((num * 10 / 2 % 3).toString())
}

// 실제 입력하는 값은 argument (= 4)
calculate(2)

function multiply(x, y){
  console.log(x * y)
}
multiply(2, 3)

function multiply(x, y=10){
  console.log(x * y)
}
multiply(1)

// 반환 (return) 받기
function multiply(x, y){
  return x * y
}
const result = multiply(2, 4)
console.log(`result = ${result}`)

/**
 * Arrow 함수
 */
const multiply2 = (x, y) => {
  return x ** y
}
console.log(multiply2(3, 4))

const multiply3 = (x, y) => x % y
console.log(multiply3(22, 3))

const multiply4 = x => x * 2
console.log(multiply4(2))

const learnArrow = x => y => z => `x: ${x}, y: ${y}, z: ${z}`
console.log(learnArrow(2)(4)(9))

// 일반 함수로 바꾸었을 때
function learnArrow2(x){
  return function(y){
    return function(z){
      return `x: ${x}, y: ${y}, z: ${z}`
    }
  }
}
console.log(learnArrow2(1)(2)(3))

const multiplyThree = function(x, y, z){
  console.log(arguments)
  return x * y * z
}
console.log(multiplyThree(4, 5, 6));

// immediately invoked function
(function(x, y) {
  console.log(x * y);
})(4, 5);