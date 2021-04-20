import React,{ useState } from 'react';
import { useEffect } from 'react';

import { useSelector } from 'react-redux';


const Counter = () => {
    const [count, setCount] = useState(0);
    useEffect(()=>{

    },[])

    return (<>  
  
    <h2>카운터</h2>
    
    <div>
        <div>
            <button 
            aria-label="+"
            onClick={()=>{setCount( count + 1 )}}>
                +
            </button>
            <span>{count}</span>
            <button
            aria-label="-"
            onClick={()=>{setCount( count - 1 )}}>
                -
            </button>
        </div>
    </div>
    </>);
}
 
export default Counter;