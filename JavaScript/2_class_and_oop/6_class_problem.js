/**
 * Class problem set
 */

class Person{
  name;
  age;

  constructor(name, age){
    this.name = name;
    this.age = age;
  }

  introduce(){
    return `Hello. My name is ${this.name} and I am ${this.age} years old.`
  }
}

const person1 = new Person('James', 25)
console.log(person1.introduce());

class Student extends Person{
  school;
  grade;

  constructor(name, age, school, grade){
    super(name, age);
    this.school = school;
    this.grade = grade;
  }

  introduce(){
    return `${super.introduce()} I'm in ${this.school}, ${this.grade} grade.`
  }
}

const student2 = new Student('Luise', 26, 'Seoul National University', 3);
// console.log(student2);
console.log(student2.introduce());

const students = [
  new Student('Anna', 20, 'Harvard', 2),
  new Student('Tom', 22, 'MIT', 3),
  new Student('Lisa', 19, 'Stanford', 1),
]

const introductions = students.map(student => student.introduce());
console.log(introductions.join('\n'));