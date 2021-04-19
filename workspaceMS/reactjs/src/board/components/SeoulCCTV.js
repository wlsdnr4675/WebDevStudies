import React,{ useState,useEffect } from 'react';
import axios from 'axios'
import 'board/components/styles/SeoulCCTV.css'
const SeoulCCTV = () => {
    
    const [cctvs, setCctvs] = useState([])

    const getAllCctvs =() =>{
        axios.get('/data/SeoulFloatingPopulation.json')
        .then(res=>{
            setCctvs(...cctvs,res.data.DATA)
        })
        .catch(err=>{
                alert(err)
        })
    }

    useEffect(() =>{
        getAllCctvs()
    },[])
    
    return ( <>
    <h2>SEOUL CCTV</h2>

        <table>
            <thead>
        <tr>
            <th>No.</th>
            <th>기준날짜</th>
            <th>카메라코드</th>
            <th>카메라명칭</th>
            <th>설명</th>
        </tr>
        </thead>
        <tbody>
        {cctvs.map((cctv, idx)=>{
            return(
        <tr key= {idx}>
            <td>{idx+1}</td>
            <td>{cctv.starttime}</td>
            <td>{cctv.deviceid}</td>
            <td>{cctv.devicename}</td>
            <td>{cctv.description}</td>
        </tr>)
        })}
        </tbody>
        </table>
        

    </> );
}
 
export default SeoulCCTV;