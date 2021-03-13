import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import Login from './cmm/component/Login'
import SignUp from "./uss/component/SignUp";
import reportWebVitals from './reportWebVitals'; 
import UserDetail from './uss/component/UserDetail'
import UserList from './uss/component/UserList'
import UserEdit from './uss/component/UserEdit'
import ArticleAdd from './bbs/component/ArticleAdd'
import ArticleDetail from './bbs/component/ArticleAdd'
import ArticleEdit from './bbs/component/ArticleAdd'
import ArticleList from './bbs/component/ArticleAdd'
ReactDOM.render(
  <React.StrictMode>
    <ArticleDetail/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
