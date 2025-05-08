/**
 * Loops
 * 
 * 1) for
 * 2) while
 */

for(let i = 0; i < 10; i ++){
  console.log(i)
}

console.log('---------------------------')

for(let i = 10; i > 0; i --){
  console.log(i)
}

console.log('---------------------------')

for(let i = 0; i < 3; i ++){
  for(let j = 3; j > 0; j--){
    console.log(i, j)
  }
}

console.log('---------------------------')
// * 을 이용하여 6x6 의 정사각형을 출력해라

let square = ''
let side = 6

for(let i = 0; i < side; i++){
  for(let j = 0; j < side; j ++){
    square += '*'
  }
  square += '\n'
}

console.log(square)
console.log('---------------------------')

/**
 * for ... in
 */
const yeji = {
  name: '이예지',
  year: 1999,
}

for(let key in yeji){
  console.log(key)
}

const group = ['abc', 'newabc', 'def']
for(let key in group){
  console.log(`${key}: ${group[key]}`)
}
console.log('---------------------------')

// for ... of
for(let value of group){
  console.log(value)
}
console.log('---------------------------')

// while
let num = 0
while(num < 10){
  num ++
  console.log(num)
}
console.log('---------------------------')

// do ... while
num = 0
do{
  num ++
}while(num < 10)

console.log(num)
console.log('---------------------------')

// break
for(let i = 0; i < 10; i++){
  if(i === 5){
    break
  }
  console.log(i)
}
console.log('---------------------------')

// continue : skip기능 -> 현재 진행중인 이 loop만 건너뛰고 나머지 계속 진행해라.
for(let i = 0; i < 10; i++){
  if(i === 5){
    continue
  }
  console.log(i)
}
console.log('---------------------------')

num = 0
while(num < 10){
  num ++
  if(num === 5){
    continue
  }

  console.log(num)
}