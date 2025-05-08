/**
 * Hoisting
 */
console.log('Hello')
console.log('World')

/**
 * Hoisting은 무엇인가?
 * 모든 변수 선언문이 코드의 최상단으로 이동되는 것처럼 느껴지는 현상을 이야기한다.
 * var, let, const 모두 가능하다
 * 그러나 let, const는 호이스팅을 막아줄 수 있다.
 */
console.log(name)
var name = '이예지'
console.log(name)