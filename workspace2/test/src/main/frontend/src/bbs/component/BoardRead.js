import Router, { useState } from "react"

const BoardRead = () => {
  return (<>
  <h3>게시글 보기</h3>
    <table>
      <tr>
        <td>번호</td>
        <td><input type="text" /></td>
      </tr>
      <tr>
        <td>등록일자</td>
        <td><input type="text" /></td>
      </tr>
      <tr>
        <td>제목</td>
        <td><input type="text" /></td>
      </tr>
      <tr>
        <td>작성자</td>
        <td><input type="text" /></td>
      </tr>
      <tr>
        <td>본문</td>
        <td><textarea rows="5" ></textarea></td>
      </tr>
    </table>
  </>)
}
export default BoardRead;
