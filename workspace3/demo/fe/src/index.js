import React from 'react';
import ReactDOM from 'react-dom';
import {  BrowserRouter } from 'react-router-dom'
import './index.css';
import App from './App';
import Login from './sec/container/Login'
import SignUp from "./uss/container/SignUp";
import reportWebVitals from './reportWebVitals'; 
import UserDetail from './uss/container/UserDetail'
import UserList from './uss/container/UserList'
import UserEdit from './uss/container/UserEdit'
import ArticleAdd from './bbs/component/ArticleAdd'
import ArticleDetail from './bbs/component/ArticleDetail'
import ArticleEdit from './bbs/component/ArticleEdit'
import ArticleList from './bbs/component/ArticleList'
import Counter from './cmm/container/Counter'
ReactDOM.render(
  <React.StrictMode>
    <BrowserRouter>
      <App/>
    </BrowserRouter>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
