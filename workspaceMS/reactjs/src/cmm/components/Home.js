import React from 'react';
import 'cmm/cmmCss/Home.css'
import 'cmm/cmmCss/CmmCss.css';
import WhereToFindMe from 'cmm/components/WhereToFindMe';
import WhatAmI from 'cmm/components/WhatAmI';
import WhoAmI from 'cmm/components/WhoAmI';


const Home = () => {


    return (<>
     
        <WhoAmI/>
        <WhatAmI/>
        <WhereToFindMe/>
       
     </>);
    
}
 
export default Home;

