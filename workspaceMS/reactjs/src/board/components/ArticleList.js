import React from 'react';
import HomeFooter from '../../cmm/components/HomeFooter';
import Navbar from '../../cmm/components/Navbar';
import ArticleListForm from "./ArticleListForm";

const ArticleList = () => {
    return ( <> 
    <Navbar/>
    <ArticleListForm/>
    <HomeFooter/>
    </>);
}
 
export default ArticleList;