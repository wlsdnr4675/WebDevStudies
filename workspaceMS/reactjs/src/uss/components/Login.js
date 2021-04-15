import HomeFooter from "../../cmm/components/HomeFooter"
import Navbar from "../../cmm/components/Navbar"
import LoginForm from "./LoginForm"

const Login = () => {
    return (<> 
        <Navbar></Navbar>
        <LoginForm></LoginForm>
        <HomeFooter></HomeFooter>
    </> );
}
 
export default Login;