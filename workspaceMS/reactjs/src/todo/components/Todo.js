import { Box } from '@material-ui/core';
import React from 'react'
import { useState } from 'react';
import { useDispatch } from 'react-redux';
import { delTodo, toggleTodo } from 'todo/reducer/todo.reducer';


const Todo = ({todo}) => {
    const dispatch = useDispatch();


    const handleClick =() =>{
        dispatch(delTodo(
            todo.id
        ))
        alert(JSON.stringify(todo.id))

    }
    const clickToggle = () =>{
        dispatch(toggleTodo(
         todo.id,
        ))
        todo.done ? alert("완료를 취소합니다") : alert("완료를 하였습니다")
    }
    
    
    return (
    
    <div style={{width:600}}>
        <input type="checkbox" style={{width:100}} onClick ={clickToggle}/>
        {todo.done 
        ? ( 
        <span style={{width:400}}><del>{todo.text}</del></span>
        ) : (
        <span style={{width:400}}> {todo.text} </span>
        )}
        <button style={{width:100, backgroundColor:'red'}} onClick={handleClick}>삭제</button>
    </div>
    )
}
export default Todo;