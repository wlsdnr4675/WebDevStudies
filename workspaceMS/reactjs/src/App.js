import { Route } from 'react-router-dom'
import 'App.css'
import {ArticleDetail, ArticleList, ArticleWrite, ArticleUpdate} from 'article/index';
import {SeoulCCTV, News} from 'board/index';
import {Counter, ReduxCounter} from 'counter/index';
import {Home, HomeFooter, Navbar} from 'cmm/index';
import {Login, SignUp, UserDetail} from 'uss/index';
import{TodoApp} from 'todo/index';

import {AddressApp, AddAddress} from 'address/index';

const App = () => {
  return (
    <div className="App">
      <Navbar></Navbar>

      <Route exact path='/address/address-app' component={AddressApp}></Route>
      <Route exact path='/address/add-address' component={AddAddress}></Route>

      <Route exact path='/article/article-list' component={ArticleList}></Route>
      <Route exact path='/article/article-detail' component={ArticleDetail}></Route>
      <Route exact path='/article/article-write' component={ArticleWrite}></Route>
      <Route exact path='/article/article-update' component={ArticleUpdate}></Route>
     
      <Route exact path='/login' component={Login}></Route>
      <Route exact path='/sign-up' component={SignUp}></Route>
      <Route exact path='/' component={Home}></Route>
      <Route exact path='/user-detail' component={UserDetail}></Route>

      
      <Route exact path='/board/news' component={News}></Route>
      <Route exact path='/board/seoul-cctv' component={SeoulCCTV}></Route>
      <Route exact path='/counter/counter' component={Counter}></Route>
      <Route exact path='/counter/redux-counter' component={ ReduxCounter } />

      <Route exact path='/todo/todo-app' component={TodoApp}></Route>


     


      <HomeFooter></HomeFooter>
    </div>
  );
}

export default App;
