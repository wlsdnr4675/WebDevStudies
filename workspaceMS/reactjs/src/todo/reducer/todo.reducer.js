import { createSlice } from '@reduxjs/toolkit'

const initialState = {
    input :'',
    todos: [
        {id: 1, text: '리액트 연습', done: true},
        {id: 2, text: '리액트 연습', done: true}
    ],
}

const todoReducer = createSlice=({
    name: 'todos',
    initialState,
    reducers: {
        updateInput(state, action) {
            state.input = input
        },
        input(){
            (state, action) => {
                const {id, text} = action.message
                state.todos.push({id, text, done: false});
            }
        },
        toggle(){
            (state, action) =>{
                const todo = state.find(todo=>todo.id === action.payload)
                if(todo) {
                    todo.done = !todo.done;
                } 
            }
        },
        remove(){
            (state, action) =>{
                const {id} = action.payload
                const i = state.todos.findIndex(todo => todo.id === id)
                state.todo.splice(i,1)
            }
        }
    }
})

export const {updateInput, input, toggle, remove} = todoReducer.actions;
export default todoReducer.reducer;