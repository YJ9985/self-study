/**
 * Super and Override
 */

class location{
  year;
  address;

  constructor(year, address){
    this.year = year;
    this.address = address;
  }

  saylocation(){
    return `${this.year}의 주소는 ${this.address}입니다.`
  }
}

class moveLocation extends location{
  isMove;

  constructor(year, address, isMove){
    super(year, address);
    this.isMove = isMove;
  }

  saylocation(){
    // return `${this.year}는 ${this.address}로 이사를 갔습니다.`
    return `${super.saylocation()} 이사를 갔습니다.`
  }
}

const birthLocation = new location(1999, '군포시', false);
console.log(birthLocation);
console.log(birthLocation.saylocation());

const firstMove = new moveLocation(2024, '중랑구', true)
console.log(firstMove);
console.log(firstMove.saylocation());