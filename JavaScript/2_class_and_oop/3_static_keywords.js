/**
 * Static Keyword
 */

class location{
  address;
  year;
  static whenMove = 2024;

  constructor(address, year){
    this.address = address;
    this.year = year;
  }
  static returnAdress(){
    return 'secrete';
  }
}

const birthLocation = new location('군포시', 1999);
console.log(birthLocation);

console.log(location.whenMove);
console.log(location.returnAdress());
console.log('----------------------------------')

class breakfastModel{
  food;
  day;

  constructor(food, day){
    this.food = food;
    this.day = day;
  }

  static fromObject(object){
    return new breakfastModel(
      object.food,
      object.day,
    );
  }

  static fromList(list){
    return new breakfastModel(
      list[0],
      list[1],
    )
  }
}

const today = breakfastModel.fromObject({
  food : '두유', 
  day : '05/08',
})

const yesterday = breakfastModel.fromList(
  [
    '삼겹살',
    '05/07',
  ]
)

console.log(today)
console.log(yesterday)