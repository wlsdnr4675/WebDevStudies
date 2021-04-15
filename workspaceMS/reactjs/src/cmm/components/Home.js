import React from 'react';
import './Home.css'
import '../cmmCss/CmmCss.css';
import Navbar from './Navbar';
import HomeFooter from './HomeFooter';
import WhereToFindMe from './WhereToFindMe';
import WhatAmI from './WhatAmI';
import WhoAmI from './WhoAmI';


const Home = () => {


    return (<>

        <Navbar/>
        <WhoAmI/>
        <WhatAmI/>
        <WhereToFindMe/>
        <HomeFooter/>


     </>);
    
}
 
export default Home;

