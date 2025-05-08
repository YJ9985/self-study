/**
 * Getter and Setter
 * 
 * 1. Getter
 * - 데이터를 가공해서 새로운 데이터를 반환할 때
 * - private한 값을 반환할 때
 */

class locationModel{
  year;
  address;

  constructor(year, address){
    this.year = year;
    this.address = address;
  }

  get yearAndAddress(){
    return `${this.year}-${this.address}`;
  }

  set setAddress(address){
    this.address = address;
  }
}

const birthLocation = new locationModel(1999, '군포시');
console.log(birthLocation);
console.log(birthLocation.yearAndAddress);

birthLocation.setAddress = '동작구';
console.log(birthLocation);

class breakfastModel{
  #food;
  day;

  constructor(food, day){
    this.#food = food;
    this.day = day;
  }

  get food(){
    return this.#food
  }

  set food(food){
    this.#food = food;
  }
}

const today = new breakfastModel('두유', '5/8');
console.log(today);
console.log(today.food);

today.food = '삼겹살';
console.log(today.food);