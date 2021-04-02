import {BrowserRouter as Router, Route} from "react-router-dom";
import {Navbar} from "react-bootstrap";
import './App.css';
import BoardListPage from './bbs/container/BoardListPage'
import BoardModifyPage from './bbs/container/BoardModifyPage'
import BoardReadPage from './bbs/container/BoardReadPage'
import BoardRegisterPage from './bbs/container/BoardRegisterPage'


function App() {
  return (<>
  <Router>
  <Navbar style={{backgroundColor:"gray"}} >
                    <Navbar.Brand href="/">
                        Home
                    </Navbar.Brand>
                    <Navbar.Brand href="/BoardListPage">
                        게시판
                    </Navbar.Brand>
                </Navbar>
  <Route path="/BoardListPage" component={BoardListPage}></Route>
  <Route path="/BoardModifyPage" component={BoardModifyPage}></Route>
  <Route path="/BoardReadPage" component={BoardReadPage}></Route>
  <Route path="/BoardRegisterPage" component={BoardRegisterPage}></Route>
  </Router>
  </>)
}

export default App;
