/**
 * Inheritance 상속
 */

class mealModel{
  food;
  day;

  constructor(food, day){
    this.food = food;
    this.day = day;
  }
}

class breakfastModel extends mealModel {
  eatOrNot(){
    return `밥을 먹었을까요?`;
  }
}

class dinnerModel extends mealModel {
  getout(){
    return `오늘 저녁은 외식!`;
  }
}

const May8 = new breakfastModel('두유', '0508');
console.log(May8);
console.log(May8.eatOrNot());

const May10 = new dinnerModel('아구찜', '0510');
console.log(May10);
console.log(May10.getout());

const May11 = new mealModel('아직모름', '0511');
console.log(May11);
// console.log(May11.eatOrNot());

console.log(May8 instanceof mealModel);
console.log(May8 instanceof breakfastModel);
console.log(May8 instanceof dinnerModel);

