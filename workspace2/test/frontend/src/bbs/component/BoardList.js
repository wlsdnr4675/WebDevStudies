import Router, { useState } from 'react';

const BoardList = () => {

  return(<>
  <div>
    <h3>게시판</h3>
    <table border="1">
      <tr>
        <th align="center" width="80">번호</th>
        <th align="center" width="320">제목</th>
        <th align="center" width="100">작성자</th>
        <th align="center" width="180">등록일자</th>
      </tr>
      <tr>
        <td colspan="4">
          List is empty
        </td>
      </tr>

      
      <tr>
        <td align="center"></td>
        <td align="left">
        {/* <Link to={`name: 'BoardListPage' `}>취소</Link> */}
        </td>
        <td align="right"></td>
        <td align="center"></td>
      </tr>
    </table>
  </div>
  </>)
}

export default BoardList;

