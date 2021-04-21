
import { Link, Route } from 'react-router-dom';
// import ReduxCounter from './counter/components/ReduxCounter';
import CounterContainer from './counter/container/CounterContainer'
import CounterSliceContainer from './counter/container/CounterSliceContainer'

const App = () => {
  return (
    <>
    <div className="App">
    <Route exact path="/counter/counter-container" component={CounterContainer}></Route>
    <Route exact path="/counter/counter-slice-container" component={CounterSliceContainer}></Route>
    <Link to={"/counter/counter-container"}>REDUXCOUNTER</Link><br/>
    <Link to={"/counter/counter-slice-container"}>RTKCOUNTER</Link>
    </div>
    </>
  );
}

export default App;
