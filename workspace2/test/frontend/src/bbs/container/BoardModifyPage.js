const BoardModifyPage = () =>
 (<>
    
    <form >
    <h3>수정 형식</h3>
      <table>
        <tr>
          <td>번호</td>
          <td><input type="text" disabled/></td>
        </tr>
        <tr>
          <td>등록일자</td>
          <td><input type="text" disabled/></td>
        </tr>
        <tr>
          <td>제목</td>
          <td><input type="text"/></td>
        </tr>
        <tr>
          <td>작성자</td>
          <td><input type="text" disabled/></td>
        </tr>
        <tr>
          <td>본문</td>
          <td><textarea rows="5"></textarea></td>
        </tr>
      </table>

      <div>
        <button type="submit">수정</button>
       {/* <Link to={`name: 'BoardListPage' `}>취소</Link> */}
      </div>
    </form>
 </>)

 export default BoardModifyPage;