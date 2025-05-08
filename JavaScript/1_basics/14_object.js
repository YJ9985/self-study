/**
 * Object 객체
 * 
 * 특징 
 * 1) const로 선언할 경우 객체 자체를 변경할 수는 없다.
 * 2) 객체 안의 프로퍼티나 메서드는 변경할 수 없다.
 */

let student = {
  name: '이예지',
  address: '동작구',
  study : function(){
    return `${this.name}가 공부를 합니다.`
  }
};

console.log(student);
console.log(student.name);
console.log(student['name'])

const key = 'address';
console.log(student[key]);

console.log(student.study());
console.log('---------------------')

const nameKey = 'name';
const nameValue = 'YEJI';

const addressKey = 'address';
const addressValue = '동작구';

const student2 = {
  [nameKey]: nameValue,
  [addressKey]: addressValue,
  study : function(){
    return `${this.name}가 공부를 합니다.`;
  }
};
console.log(student2)
console.log(student2.study());

student2['address'] = '사당동';
console.log(student2)

student2['englishName'] = 'LUCY';
console.log(student2);

delete student2['englishName'];
console.log(student2);
console.log('---------------------')

// 모든 키값 다 가져오기
console.log(Object.keys(student))

// 모든 value값 다 가져오기
console.log(Object.values(student));

const name = '이예지';

const student3 = {
  name,
};
console.log(student3);