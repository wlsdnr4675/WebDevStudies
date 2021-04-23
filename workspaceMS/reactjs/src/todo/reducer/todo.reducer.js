import { UsbOutlined } from '@material-ui/icons'
import { createSlice } from '@reduxjs/toolkit'
import uuid from 'uuid/v4'

const initialState = [
        {id: 1, text: '리액트 학습', done: true},
        {id: 2, text: '리덕스 학습', done: true},
        {id: 3, text: 'THUNK 학습', done: false},
    ]
// 기능: addTodo, todos, findTodo, delTodo, editTodo
const todoSlice = createSlice({
    name: 'todo',
    initialState,
    reducers: {
        addTodo(state, action){
           state.push({id:uuid(), text: action.payload, done: false })
        },
       
        delTodo(state, {payload}){
            return state.filter((todo) => todo.id !== payload)
           // return state.findIndex(todo => todo.id !== payload.id)
           // state.splice(state.findIndex(j => j.id === payload))
        },
        toggleTodo(state, {payload}) {
            const todo = state.find((todo) => todo.id === payload)
            todo ? (todo.done = !todo.done) : (todo.done = todo.done)
        }
    }
})


export const {addTodo, delTodo, toggleTodo} = todoSlice.actions
export default todoSlice.reducer