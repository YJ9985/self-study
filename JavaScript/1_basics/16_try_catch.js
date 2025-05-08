/**
 * try...catch
 * 
 * 1) 발생시킬 때 -> 던진다고 한다 (throw)
 * 2) 명시적으로 인지할 때 -> 잡는다고 한다 (catch)
 * 3) 무슨일이 있어도 실행되는 부분 -> finally
 */

function runner(){
  try{
    console.log('Hello');

    throw new Error('Huge Error exists.');

    // 에러가 나지 않으면 출력되는 부분
    console.log('no error!!!!!!')

  } catch(e){
    console.log('---catch---');
    // console.log(e)
  } finally {
    console.log('My name is?')
  }
}
runner();