
import Counter from './counter/components/Counter';
import { Link, Route } from 'react-router-dom';
// import ReduxCounter from './counter/components/ReduxCounter';
import CounterContainer from './counter/container/CounterContainer'

const App = () => {
  return (
    <>
    <div className="App">
    <Route exact path="/counter/counter-container" component={CounterContainer}></Route>
    </div>
    </>
  );
}

export default App;
