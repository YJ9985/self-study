/**
 * Data Types
 * 
 * 여섯개의 Primitive Type과 한 개의 Object Type이 있다.
 * 
 * 1) Number (숫자)
 * 2) String (문자열)
 * 3) Boolean 
 * 4) undefined
 * 5) Null
 * 6) Symbol 
 * 7) Object (객체) -> Object Type
 */

// 1. Number
const age = 27;
const temperature = -10;
const pi = 3.14;
const infinity = Infinity; // 무한대
const nInfinity = -Infinity; // - 무한대

console.log(typeof age);
console.log(typeof infinity);
console.log(infinity);

// 2. String
const name = '이예지';
console.log(typeof name)

const idole = "'ive' 'g-idle'"
console.log(idole)

/** 
 * Template Literal
 * 
 * 1) newline -> \n
 * 2) tab -> \t
 * 3) 백슬래시를 스트링으로 표현하고 싶다면 두 번 입력하면 된다
 */
const engName = `Lucy 
and '''"'
Chloe`
console.log(engName)
console.log(`${engName} + 이예지`)

// 3. Boolean
const isTrue = true;
const isFalse = false;
console.log(typeof isTrue)

// 4. undefined : 사용자가 직접 값을 초기화하지 않았을 때 지정되는 값. 직접 undefined로 값을 초기화 하는 것은 지양
let noInit
console.log(typeof noInit)

// 5. null: 개발자가 명시적으로 없는 값으로 초기화할 때 사용하는 값
let init = null;
console.log(null)
console.log(typeof init)

/**
 * symbol
 * 
 * 유일무이한 값을 생성할 때 사용
 * 다른 프리미티브 값들과 다르게 Symbol 함수를 호출해서 사용
 */
const test1 = '1';
const test2 = '1';
console.log(test1 === test2)

const symbol1 = Symbol('1')
const symbol2 = Symbol('1')

console.log(symbol1 === symbol2)

/**
 * Object
 * 
 * Map 과 비슷
 * Key와 Value 쌍으로 이루어져 있다.
 */

const dictionary = {
  red: '빨강',
  orange: '주황',
  yellow: '노랑',
}

console.log(dictionary)
console.log(dictionary['red'])

/**
 * Array -> Object Type
 * 
 * 값을 리스트로 나열할 수 있는 타입
 */
const childArray = [
  'Jiu',
  'Fin',
  'Isu',
]
console.log(childArray)
console.log(childArray[0])
console.log(typeof childArray)

/**
 * static typing : 변수를 선언할 떄 어떤 타입의 변수를 선언할지 명시를 한다
 * dynamic typing : 변수를 선언할 때 변수의 타입을 명시적으로 선언하지 않고 값에 의해 타입을 추론한다.
 */