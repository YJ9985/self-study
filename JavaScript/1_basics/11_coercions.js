/**
 * 타입 변환
 * Type conversion
 * 
 * 1) 명시적
 * 2) 암묵적
 */
let age = 32

// 명시적 형변환
let stringAge = age.toString()
console.log(typeof stringAge, stringAge)

//암묵적 형변환
let test = age + ''
console.log(typeof test, test)

console.log('98' + 2)

/**
 * 명시적 변환 몇가지 더 배우기
 */

console.log(typeof (99).toString())
console.log(typeof (true).toString())
console.log(typeof (Infinity).toString(), (Infinity).toString())

// 숫자 타입으로 변환
console.log(typeof parseInt('0'))
console.log(typeof parseFloat('0.99'))


// Boolean 타입으로 변환
// * False를 반환하는 경우우
// * -> 아무 글자도 없는 String
// * -> 값이 없는 경우
// * -> 0
// * 
console.log(!'x')
console.log(!!'x')
console.log(!!'')

console.log(!!0)
console.log(!!undefined)
console.log(!!null)

console.log(!!{}) // Object는 무조건 true
console.log(!![]) // Array는 무조건 true