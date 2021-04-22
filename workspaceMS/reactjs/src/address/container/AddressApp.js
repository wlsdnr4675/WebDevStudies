
import AddAddress from 'address/components/AddAddress';
import ListAddress from 'address/components/ListAddress';
import React, { useState } from 'react';
import { useSelector } from 'react-redux';


const AddressApp = () => {
    const addresses = useSelector(state => (state.addressReducer))
    return (<>  
    <AddAddress></AddAddress>
    <ListAddress addresses= {addresses}></ListAddress>
    </>);
}
 
export default AddressApp;
