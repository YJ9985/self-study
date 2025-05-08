/**
 * Array Functions
 */
let child = [
  'Adam',
  'Brian',
  'Charlie',
]

console.log(child);
console.log('---------------------')

// push() : 마지막에 item 추가 -> return 값(새로운 Array의 길이)
console.log(child.push('Dany'));
console.log(child);
console.log('---------------------')

// pop()
console.log(child.pop());
console.log(child);
console.log('---------------------')

//shift(): 첫 번째 값 삭제
console.log(child.shift());
console.log(child);

// unshift() : 첫 번째 값 추가
console.log(child.unshift('Alice'));
console.log(child);
console.log('---------------------')

// splice(start, num): 시작부터 몇 개의 아이템을 삭제할것인지
console.log(child.shift(0, 1));
console.log(child);
console.log('---------------------')

// concat() : 원래 Array 변경 없이 새로운 메모리에 데이터 추가
console.log(child.concat('Dan'));
console.log(child)
console.log('---------------------')

// slice(start, index) : start부터 index - 1 까지 잘라서 반환
console.log(child.slice(1, 2));
console.log('---------------------')

// spread operator
const child2 = [
  ...child,
];
console.log(child2);

// spread 하지 않으면 리스트 안에 리스트 형태로 삽입됨
const child3 = [
  child,
]
console.log(child3);

const child4 = child;
console.log(child4);
console.log('---------------------')

console.log(child === child4);
console.log('---------------------')

// spread operator 사용하면 다른 값이 된다.
console.log(child === child2);
console.log('---------------------')

// join()
console.log(child.join());
console.log(child.join('/'))
console.log(child.join(', '))

// sort()
child.sort();
console.log(child);

child.reverse();
console.log(child);

const nums = [
  1,
  9,
  7,
  5,
  3,
]
console.log(nums)

/**
 * a, b를 비교했을 때
 * 1) a를 b보다 나중에 정렬하려면 (뒤에두려면) 0보다 큰 숫자를 반환
 * 2) a를 b보다 먼저 정렬하려면 (앞에두려면) 0보다 작은 숫자를 반환
 * 3) 원래 순서를 그대로 두려면 0을 반환
 */
nums.sort((a, b) => {
  return a > b ? 1: -1;
});
console.log(nums)
console.log('---------------------')

// map()
console.log(child.map((x) => x))
console.log(child.map((x) => `child: ${x}`));

console.log(child.map((x) => {
  if (x === 'Charlie'){
    return `FIRST CHILD: ${x}`;
  } else{
    return x;
  }
}));

// filter() : 조건에 맞는 모든 값 반환
const numbers = [1, 8, 7, 6, 4];

console.log(numbers.filter((x) => x % 2 === 0));

// find() : 조건에 맞는 가장 첫 번째 값 반환
console.log(numbers.find((x) => x % 2 === 0));
console.log(numbers.findIndex((x) => x % 2 === 0));

// reduce(callback function, start) : (콜백함수, 초기값) 을 파라미터로 받음
// 초기값이 콜백함수 인자 (p) 에 입력됨
// Array의 첫 번째 값인 1이 n에 입력된다
// p+n 반환값 1이 p에 입력된다
// Array 두 번째 값인 8이 n에 입력된다 ... 
// 결과적으로 모든 값을 더한 25가 반환된다
console.log(numbers.reduce((p, n) => p + n, 0));