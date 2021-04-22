import React from 'react';
import ReactDOM from 'react-dom';
import 'index.css';
import App from 'App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter } from 'react-router-dom';
//import store from './app/store'
import { Provider } from 'react-redux'
import {createStore,combineReducers, applyMiddleware}from 'redux';
// import 'counter/reducer/CounterReducer';
import todoReducer from './todo/reducer/todo.reducer'
import addressReducer from './address/reducer/address.reducer'
import {configureStore} from '@reduxjs/toolkit'
import logger from "./lib/logger"

const rootReducer = combineReducers({todoReducer,addressReducer});
const store = configureStore({reducer: rootReducer},applyMiddleware(logger));

ReactDOM.render(
  <Provider store={store}>
  <BrowserRouter>
    <App />,
  </BrowserRouter>,
  </Provider>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
