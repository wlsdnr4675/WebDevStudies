import React ,{} from 'react';
import {createSlice} from '@reduxjs/toolkit';
import { Satellite } from '@material-ui/icons';

const initialState = [
    { id: "1", name: "Dave Patrick", email: "dave@gmail.com" },
    { id: "2", name: "Hank Gluhwein", email: "hank@gmail.com" },
]


const addressReducer = createSlice({
    name: "addressReducer",
    initialState,
    reducers: {
        addAddress(state, action) {
            state.push(action.payload)
        },
        updateAddress(state, action) {
            
        },
        readAddress(state, action) {
            
        },
        deleteAddress(state, action) {
            
        }
    }
})
export const {addAddress, updateAddress, readAddress, deleteAddress} = addressReducer.actions;
export default addressReducer.reducer;