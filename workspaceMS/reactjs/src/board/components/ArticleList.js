import React from 'react';
import HomeFooter from '../../cmm/components/HomeFooter';
import Navbar from '../../cmm/components/Navbar';
import ArticleListFrom from "./ArticleListForm";

const ArticleList = () => {
    return ( <> 
    <Navbar/>
    <ArticleListFrom/>
    <HomeFooter/>
    </>);
}
 
export default ArticleList;