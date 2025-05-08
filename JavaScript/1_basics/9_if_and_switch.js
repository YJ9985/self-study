/**
 * If and Switch
 */
let number = 5;

if (number % 2 === 0){
  console.log('number is even')
} else {
  console.log('number is odd')
}


const num = 30

if (num % 2 === 0){
  console.log('2의 배수입니다')
} else if (num % 3 === 0){
  console.log('3의 배수입니다.')
} else {
  console.log('어느 수의 배수도 아닙니다.')
}

const englishDay = 'monday'
let koreanDay;

switch(englishDay){
  case 'monday':
    koreanDay = '월요일';
    break;
  case 'tuesday':
    koreanDay = '화요일';
    break;
  case 'wednesday':
    koreanDay = '수요일'
    break;
  case 'thursday':
    koreanDay = '목요일일'
    break;
  case 'friday':
    koreanDay = '금요일'
    break;
  default:
    koreanDay = '주말'
}

console.log(koreanDay)
