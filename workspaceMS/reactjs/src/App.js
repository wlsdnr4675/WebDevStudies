import { Route } from 'react-router-dom'
import './App.css'
import ArticleDetail from './board/components/ArticleDetail';
import ArticleList from './board/components/ArticleList';
import ArticleWrite from './board/components/ArticleWrite';
import Home from './cmm/components/Home';
import Login from './uss/components/Login';
import SignUp from './uss/components/SignUp';

const App = () => {
  return (
    <div className="App">
      <Route exact path='/board/article-list' component={ArticleList}></Route>
      <Route exact path='/board/article-detail' component={ArticleDetail}></Route>
      <Route exact path='/board/article-write' component={ArticleWrite}></Route>
      <Route exact path='/login' component={Login}></Route>
      <Route exact path='/sign-up' component={SignUp}></Route>
      <Route exact path='/home' component={Home}></Route>
    </div>
  );
}

export default App;
