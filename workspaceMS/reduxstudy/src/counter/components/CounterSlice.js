import React, { useEffect } from 'react'  

const CounterSlice = React.memo(({ number, onIncrease, onDecrease}) =>{
    
    console.log("n",number);
    console.log("i",onIncrease);
    console.log("d",onDecrease);
    return (<>
    <h2 style={{ color : 'black'}}>리덕스 슬라이스 카운터</h2>
    <div>
        <div>
            <button aria-label="+" onClick={onIncrease}>
                +
            </button>
            <span  style={{ color : 'black', width: 100}}>{number}</span>
            <button aria-label="-" onClick={onDecrease}>
                -
            </button>
        </div>
    </div>
    </>)
    
})

export default CounterSlice