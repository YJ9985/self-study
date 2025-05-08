/** Variable 선언하기
 * 1) var -  더 이상 쓰지 않는다
 * 2) let
 * 3) const
 */

var name = '이예지';
console.log(name);

var age = 20;
console.log(age);

// let과 var로 선언하면 값을 추후에 변경할 수 있다
age = 27;
console.log(age);

const address = '동작구';
console.log(address);

// const로 선언하면 값을 추후에 변경할 수 없다
// const address = '서초구';
// console.log(address);

/** 선언과 할당
 * 1) 선언은 변수를 선언하는 것 ex) var name
 * 2) 할당은 변수에 값을 넣어주는 것 ex) name = '이예지'
 * 
 * var, let 키워드는 기본적으로 undefined 라는 값을 할당받는다.
 */

let boyFriend;
console.log(boyFriend); // undefined