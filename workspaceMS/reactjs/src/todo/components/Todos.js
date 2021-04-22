import React from 'react'
import { Todo } from 'todo/index'


const Todos = ({todos}) => {
    console.log(todos)
    return (<>
    <h3>할일 목록</h3>
    <div>
        {todos.map(todo => (<Todo key={todo.id} todo={todo}/>))}
    </div>
    </>)
}
export default Todos;