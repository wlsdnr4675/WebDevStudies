import React, {  } from 'react';
import 'todo/styles/todoCss.css';
import {AddTodo, CompletedTodos, Todos} from 'todo/index';
const TodoApp = () => {
    //Problem: user interaction doesn't provide desired results
//Solution: add interactivity so the user can manage daily tasks.

var taskInput = document.getElementById("new-task"); // new-task
var addButton = document.getElementsByTagName("button")[0];//first button
var incompleteTasksHolder = document.getElementById("incomplete-tasks"); //incomplete-tasks
var completedTasksHolder = document.getElementById("completed-tasks"); //completed-tasks

//New Task List item

  const createNewTaskElement = (taskString) => {
	// create List Item
  const listItem = document.createElement("li");
  // input checkbox
  const checkBox = document.createElement("input");
  // label
  const label = document.createElement("label");
  // input (text)
  const editInput = document.createElement("input");
  // button.edit
  const editButton = document.createElement("button");
  // button.delete
  const deleteButton = document.createElement("button");
  
  //Each element needs modified 
  
  checkBox.type = "checkBox";
  editInput.type = "text";
  
  editButton.innerText = "Edit";
  editButton.className = "edit";
  deleteButton.innerText = "Delete";
  deleteButton.className = "delete";
  
  label.innerText = taskString;
  
  // Each element needs appending
  listItem.appendChild(checkBox);
  listItem.appendChild(label);
  listItem.appendChild(editInput);
  listItem.appendChild(editButton);
  listItem.appendChild(deleteButton);

	return listItem;
}


//Add a new task
const addTask = () => {
  console.log("Add Task...");
  //Create a new list item with the text from the #new-task:
  const listItem = createNewTaskElement(taskInput.value);
  //Append listItem to incompleteTaskHolder
  incompleteTasksHolder.appendChild(listItem);
  bindTaskEvents(listItem, taskCompleted);
  taskInput.value = "";
}

//Edit an existing task
const editTask = () => {
    console.log("Edit Task...");
  
const listItem = this.parentNode;
  
const editInput = listItem.querySelector("input[type=text]");
const label = listItem.querySelector("label");
  
const containsClass = listItem.classList.contains("editMode");
  
  
  // if class of the parent is .editMode
  if (containsClass) {
      //Switch from .editMode
      //label text become the input's value
      label.innerText = editInput.value;
  } else {
      //Switch to .editMode
      //input value becomes the labels text
     	editInput.value = label.innerText;
  }
  //Toggle .editMode on the parent 
  listItem.classList.toggle("editMode");
}

//Delete an existing task
const deleteTask = () => {
    console.log("Delete Task...");
		//Remove the parent list item from the ul
  	const listItem = this.parentNode;
  	const ul = listItem.parentNode;
  
  	ul.removeChild(listItem);
}

//Mark a task as complete
const taskCompleted = () => {
   console.log("Task Complete...");
  //When the Checkbox is checked 
  //Append the task list item to the #completed-tasks ul
   const listItem = this.parentNode;
   completedTasksHolder.appendChild(listItem);
   bindTaskEvents(listItem, taskIncomplete);
}


//Mark a task as incomplete
const taskIncomplete = () => {
  console.log("Task Incomplete...");
 	//When the checkbox is unchecked appendTo #incomplete-tasks
  const listItem = this.parentNode;
  incompleteTasksHolder.appendChild(listItem);
  bindTaskEvents(listItem, taskCompleted);
}

const addButtonListener = () => {
//Set the click handler to the addTask function
addButton.addEventListener("click", addTask); 
}



const bindTaskEvents = (taskListItem, checkBoxEventHandler) => {
  	console.log("Bind List item events");
  	// select listitems chidlren
  	const checkBox = taskListItem.querySelector('input[type="checkbox"]');
    const editButton = taskListItem.querySelector("button.edit");
    const deleteButton = taskListItem.querySelector("button.delete");
		//bind editTask to edit button
  	editButton.onclick = editTask;
		//bind deleteTask to delete button
 		deleteButton.onclick = deleteTask;
		//bind checkBoxEventHandler to checkbox
  	checkBox.onchange = checkBoxEventHandler;
  
}
const incompleteTasksHolderLoop = () => {
    let i= 0;
    //cycle over incompleteTaskHolder ul list items
    for (; i < incompleteTasksHolder.children.length; i ++) {
    //bind events to list item's children (taskCompleted)	
    bindTaskEvents(incompleteTasksHolder.children[i], taskCompleted);
  }
}
const completedTasksHolderLoop = () =>{
    let i= 0;
 //cycle over completedTaskHolder ul list items
     for (; i < completedTasksHolder.children.length; i ++) {
    //bind events to list item's children (taskCompleted)	
    bindTaskEvents(completedTasksHolder.children[i], taskIncomplete);
  }
}
  
 



    return (<> 
        <div className="container-todo todo">
        <AddTodo></AddTodo>
        <Todos></Todos>
        <CompletedTodos></CompletedTodos>

    </div>
    </>);
}
 
export default TodoApp;