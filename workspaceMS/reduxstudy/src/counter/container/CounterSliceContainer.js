
import { useDispatch, useSelector } from 'react-redux'
import CounterSlice from '../components/CounterSlice'
import { increase, decrease } from '../reducer/counter.slice'



const CounterSliceContainer = () => {
    
    const number = useSelector(state => (state.counterSlice.number));

    const dispatch = useDispatch()

    return (<>
        <CounterSlice number={number} 
        onIncrease={() => dispatch(increase(1))} 
        onDecrease={() => dispatch(decrease(1))}/>
    </>)
}

export default CounterSliceContainer