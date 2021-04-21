import { createAction, handleActions } from 'redux-actions'

const INCREASE = 'counter/INCREASE'
const DECREASE = 'counter/DECREASE'

export const increase = createAction(INCREASE)
//const increase = () => ({type: INCREASE})
export const decrease = createAction(DECREASE)


const initialState = { number: 1 }

const counterReducer = handleActions({
    [INCREASE] : (state, action) => ({ ...state, number : state.number + 1}),
    [DECREASE] : (state, action) => ({ ...state, number : state.number - 1})
}, initialState)


export default counterReducer

