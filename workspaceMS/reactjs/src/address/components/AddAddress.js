import { ListAddress } from 'address/index';
import { addAddress } from 'address/reducer/address.reducer';
import React, {useState} from 'react'
import { useCallback } from 'react';
import { useSelector, useDispatch } from 'react-redux';
const AddAddress = () => {
    const dispatch = useDispatch();
    const [address, setAddress] =useState("");
    const {id, name, email} = address
    const addressAmount = useSelector(state => state.addressReducer.length)

    const handleChange = useCallback(e => {
        e.preventDefault();
        const {name, value} = e.target;
        setAddress(
            {...address, [name] : value}
        )
    },[address])

    const handleClick = useCallback(e =>{
        e.preventDefault();
        dispatch(addAddress({
            id: addressAmount + 1,
            name,
            email
        }))
        console.log("어드레스", JSON.stringify(address))
        
    },[id,address])
    return (<>
      <form onSubmit={handleClick} >
      <label>Title</label>
            <input className="u-full-width" type="text" name="name" value={name} onChange={handleChange}/>
            <label>hashTag</label>
            <input className="u-full-width" type="text" name="email" value={email} onChange={handleChange} />
        <button style={{width:100, backgroundColor:'green'}} type={"submit"} onClick={handleClick}>Add</button>
        </form>
        
    </> );
}
 
export default AddAddress;