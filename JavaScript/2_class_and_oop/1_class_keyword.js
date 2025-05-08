/**
 * Class Keyword
 * 
 * property 정의는 optional이다.
 * 그러나 소통을 위해서는 정의하는것이 좋다.
 */
class location{
  // year;
  // address;

  constructor(year, address){
    this.year = year;
    this.address = address;
  }

  // 메소드 정의
  sayAddress(){
    return `${this.address}로 이사를 갔습니다.`
  }
}

// constructor - 생성자
const childHood = new location(1999, '군포시');
console.log(childHood);

const adultHood = new location(2024, '중랑구');
console.log(adultHood)

const moveout = new location(2025, '동작구');
console.log(moveout);

console.log(childHood.year);
console.log(childHood.address);

console.log(moveout.sayAddress());

console.log(typeof location);
console.log(typeof childHood);