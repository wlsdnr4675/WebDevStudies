import logo from './logo.svg';
import Home from './cmm/components/Home';
import ArticleList from './board/components/ArticleList';
import Login from './uss/components/Login';
import SignUpForm from './uss/components/SignUpForm';

function App() {
  return (
    <div className="App">
      <ArticleList/>
      <Login></Login>
      <SignUpForm></SignUpForm>
    </div>
  );
}

export default App;
