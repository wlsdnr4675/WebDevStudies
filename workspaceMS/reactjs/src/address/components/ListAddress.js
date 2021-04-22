import React, {useState} from 'react'
import {Link} from 'react-router-dom'
const ListAddress = ({addresses}) => {
    return (<> 
    <h2>ADDRESS</h2>
    <div>
        {addresses.map(address => 
                <tr key = {address.id}>
                    <td>{address.id}</td>
                    <td>{address.name}</td>
                    <td>{address.email}</td>
                </tr>
            )}
            <button><Link to={'/address/add-address'}>ADDADDRESS</Link></button>
    </div>
    
    </>);
}
 
export default ListAddress;