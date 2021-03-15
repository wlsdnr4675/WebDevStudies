import React, { useState } from 'react';
import {Route} from 'react-router-dom'
import Counter from "./cmm/container/Counter";
import Login from "./sec/container/Login";
import SignUp from "./uss/container/SignUp";
import Home from "./cmm/container/Home";




import './App.css';

const App = () => {

  return (<>
  
  
  <Route path ="/" component={Home} exact></Route>
  <Route path="/Counter" component={Counter}></Route>
  <Route path="/Login" component={Login}></Route>
  <Route path="/SignUp" component={SignUp}></Route>

  </>)
}

  
    
    
  


export default App;
