/**
 * copy by value 값에 의한 전달
 * copy by reference 참조에 의한 전달
 * 
 * 1) 기본적으로 모든 primitive 값은 copy by value다
 * 2) 객체는 copy by reference다
 */

let original = '안녕하세요';
let clone = original;

console.log(original);
console.log(clone);
console.log('---------------------')

clone += 'Hello!';
console.log(original)
console.log(clone)
console.log('---------------------')

let originalObj = {
  name : 'Lucy',
  address : 'Seoul',
}
let cloneObj = originalObj

console.log(originalObj)
console.log(cloneObj)
console.log('---------------------')

originalObj['address'] = 'Where?';
console.log(originalObj);
console.log(cloneObj);

console.log(originalObj === cloneObj)
console.log(original === clone);
console.log('---------------------')

const student1 = {
  name: 'Yeji',
  address: ' 사당',
}
const student2 = student1;
const student3 = {
  name: 'Yeji',
  address: '사당',
}

console.log(student1 === student2); // true
console.log(student1 === student3); // false
console.log(student2 === student3); // false
console.log('---------------------')

// spread operator
const student4 = {
  ...student1,
};
console.log(student4);

console.log(student1 === student4);