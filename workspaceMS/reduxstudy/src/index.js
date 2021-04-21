import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {Provider} from 'react-redux';
import {combineReducers, createStore} from 'redux';
import { BrowserRouter } from 'react-router-dom';
import counterReducer from './counter/reducer/Counter.reducer'
import counterSlice from './counter/reducer/counter.slice'
import { configureStore } from '@reduxjs/toolkit';

const rootReducer = combineReducers({counterReducer, counterSlice})
// const store = createStore(rootReducer)
const store = configureStore({reducer: rootReducer})

ReactDOM.render(
  
  <Provider store = {store}>
    <BrowserRouter>
    <App />
    </BrowserRouter>
  </Provider>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
