import React, { useState  } from 'react';

const Counter = () => {
  const [count, setCount] = useState(0)
  const [count2, setCount2] = useState(0)
  const onIncrease = () => {setCount (count + 1)}
  const onDecrease = () => setCount2 (count2 - 1)
  
  return (<>
      <h1>홈페이지</h1>
      <button>회원가입</button>
      <button>로그인</button><br/>
      <h1>카운터 : {count} </h1>
      <h1>마이너스 카운터 : {count2} </h1>
      <button onClick={onIncrease}>증가</button>
      <button onClick={onDecrease}>감소</button>

      </>)
}
export default Counter;

