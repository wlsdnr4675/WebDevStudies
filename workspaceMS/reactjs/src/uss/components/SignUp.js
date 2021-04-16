import React from 'react';
import HomeFooter from '../../cmm/components/HomeFooter';
import Navbar from '../../cmm/components/Navbar';
import SignUpForm from './SignUpForm';


const SignUp = () => {
    return (<> 
    <Navbar></Navbar>
    <SignUpForm></SignUpForm>
    <HomeFooter></HomeFooter>
    </> );
}
 
export default SignUp;