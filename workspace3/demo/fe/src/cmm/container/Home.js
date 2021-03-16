import React, {useState} from 'react';
import { Link } from "react-router-dom";


const Home = () => {

    return (<>
    <div style={{width: "200px", margin: "0 auto"}}>
    <h1>Home</h1>
    <Link to={"Counter"} >Counter</Link>
    <Link to={"SignUp"}>SignUp</Link>
    <Link to={"Login"}>Login</Link>
    </div>
   </> )
}

export default Home