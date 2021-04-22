import React, {useState} from 'react'
const AddAddress = () => {
    return (<>
      <form ><label htmlFor="new-task">할일 추가</label>
        <input id="new-task" type="text" style={{width:500}}/>
        <button style={{width:100, backgroundColor:'green'}} type={"submit"} >Add</button></form>
    </> );
}
 
export default AddAddress;