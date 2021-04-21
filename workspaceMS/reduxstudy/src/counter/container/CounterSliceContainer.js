
import { useCallback } from 'react';
import { useDispatch, useSelector } from 'react-redux'
import CounterSlice from '../components/CounterSlice'
import { increase, decrease } from '../reducer/counter.slice'



const CounterSliceContainer = () => {
    
    const number = useSelector(state => (state.counterSlice.number));

    const dispatch = useDispatch()

    const onIncrease = useCallback(()=>dispatch(increase(1)));
    const onDecrease = useCallback(()=>dispatch(decrease(1)));

    return (<>
        <CounterSlice number={number} 
        onIncrease={onIncrease} 
        onDecrease={onDecrease}/>
    </>)
}

export default CounterSliceContainer