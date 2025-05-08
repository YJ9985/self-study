/**
 *  연산자
 * 
 */


/**
 * 산술 연산자
 * 
 * 1) 덧셈
 * 2) 뺄셈
 * 3) 곱셈
 * 4) 나눗셈
 * 5) 나머지
 */

console.log(30 % 7)

console.log(10 * (10 + 4))
console.log('--------------')

/**
 * 증가와 감소
 */
let num = 1
num++
console.log(num)

num--
console.log(num)
console.log('--------------')

/**
 * 연산자의 위치
 */
let result = 1
console.log(result)

result = num ++
console.log(result, num)

result = num --
console.log(result, num)

result = ++ num
console.log(result, num)
console.log('--------------')

/** 
 * 숫자 타입이 아닌 타입에 +, - 사용하면 어떻게 될까?
 */
let sample = '99'
console.log(+sample)
console.log(typeof +sample)

console.log(sample)
console.log(typeof sample)

sample = true
console.log(+sample)
console.log(typeof +sample)

sample = false
console.log(+sample)
console.log(typeof +sample)

sample = 'newBee'
console.log(+sample) //NaN : Not a Number

sample = '99'
console.log(-sample)
console.log('--------------')

/**
 * 할당 연산자 (assignment operator)
 */
num = 100
console.log(num)

num += 10
console.log(num)

num /= 10
console.log(num)
console.log('--------------')

/**
 * 비교 연산자
 * 
 * 1) 값의 비교
 * 2) 값과 타입의 비교
 */
// 값 비교
console.log(5 == 5)
console.log(5 == '5')
console.log(0 == '')
console.log(true == 1)
console.log(false == '0')

// 값, 타입 비교
console.log(5 === 5)
console.log(5 === '5')

console.log(5 != 5)
console.log(5 != '5')
console.log(5 !== '5')
console.log('--------------')

/**
 * 대소 관계 비교 연산자
 */
console.log(100 > 1)
console.log(100 < 1)
console.log('--------------')

/**
 * 삼항 조건 연산자 (ternary operator)
 */
console.log(10 > 0 ? '10이 0보다 크다' : '10이 0보다 작다')
console.log('--------------')

/**
 * 논리 연산자
 * 
 * 1) &&
 * 2) ||
 */
// && 조건은 모두 true여야 true 반환
console.log(true && true) 
console.log(false && true)

// || 조건은 하나만 true여도 true 반환
console.log(true || true)
console.log(true || false)
console.log(false || false)

console.log(10 > 1 && 20 > 2)
console.log('--------------')

/**
 * 단축 평가 (short circuit evaluation)
 * 
 * && 를 사용했을 때 좌측이 true면 우측값 반환
 * && 를 사용했을 때 좌측이 flase면 좌측값 반환
 * ||를 사용했을 때 좌측이 true면 좌측 값 반환
 * ||를 사용했을 때 좌측이 false면 우측 값 반환 
 */
console.log(true || 'Yeji')
console.log(false || 'Yeji')

console.log(true && 'Yeji')
console.log(false && 'Yeji')
console.log('--------------')

/**
 * 지수 연산자
 */
console.log(2 ** 2)

/** 
 * null 연산자
 */
let name 
console.log(name)

name = name ?? 'JavaScript' // 좌측 값이 null 이거나 undefined 일 때, 우측값 반환
console.log(name)

name = name ?? 'New??'
console.log(name)

let name2
name ??= 'NewName'
console.log(name2)