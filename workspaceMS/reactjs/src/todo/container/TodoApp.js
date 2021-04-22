import React from 'react'
import 'todo/styles/todoCss.css'
import { AddTodo, Todos, CompletedTodos } from 'todo/index'
import {addTodo, todos} from 'todo/reducer/todo.reducer'
import { useSelector } from 'react-redux'
const TodoApp = () => {
    
    const todos = useSelector(state => (state.todoReducer))
  

    return (<div >
        <div style={{marginTop:100}}>
   <AddTodo addTodo={addTodo} />
    <Todos todos={todos}/>
    </div>
</div>)
}
export default TodoApp;