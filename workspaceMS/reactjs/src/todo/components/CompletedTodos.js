import React, {  } from 'react';

const CompletedTodos = () => {
    return ( <> 
    <h3>Completed</h3>
      <ul id="completed-tasks">
        <li>
          <input type="checkbox" checked=""/>
          <label>See the Doctor</label>
          <input type="text"/>
          <button className="edit">Edit</button>
          <button className="delete">Delete</button>
        </li>
      </ul></>);
}
 
export default CompletedTodos;