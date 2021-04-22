import { UsbOutlined } from '@material-ui/icons'
import { createSlice } from '@reduxjs/toolkit'
import uuid from 'uuid/v4'

const initialState = [
        {id: 1, text: '리액트 학습', done: true},
        {id: 2, text: '리덕스 학습', done: true},
    ]
// 기능: addTodo, todos, findTodo, delTodo, editTodo
const todoReducer = createSlice({
    name: 'todos',
    initialState,
    reducers: {
        addTodo(state, action){
           state.push({id:uuid(), text: action.payload, done: false })
        },
       
        delTodo(state, action){
            return state.filter((todo) => todo.id !== action.payload.id)
        }
    }
})


export const {addTodo, delTodo} = todoReducer.actions
export default todoReducer.reducer