import { createSlice } from '@reduxjs/toolkit';


const counterSlice = createSlice({
    name: 'counterSlice',
    initialState: [{number: 0}],
    reducers: {
        increase(state, action) {
            return({
                ...state, number: state.number + action.payload
            })
            
        },
        decrease(state,action) {

            return({
                ...state, number: state.number - action.payload
            })
        }
        
    }
    
})

export const {increase, decrease} = counterSlice.actions;

export default counterSlice.reducer;
