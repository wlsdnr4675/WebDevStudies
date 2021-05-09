import React, {useState, useEffect} from 'react';

const Counter = () => {
    const [count, setCount] = useState(0);

    const increase = () =>{
        const add = count + 1;

        setCount(add)
    }
    const decrease = () =>{
        const minus = count - 1;

        setCount(minus)
    }
    
    
    return (<> 
    <h2>카운터</h2>
    
    <div>
        <div>
            <button 
            aria-label="+"
            onClick={()=>increase()}>
                +
            </button>
            <span>{count}</span>
            <button
            aria-label="-"
            onClick={()=>decrease()}>
                -
            </button>
        </div>
    </div>
     </>);
}
 
export default Counter;