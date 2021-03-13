const ArticleAdd = () =>

(<>
<form>
<h3>게시글 등록하기</h3>
    <table>
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
        <td><textarea  rows="5"></textarea></td>
      </tr>
    </table>

    <div>
      <button type="submit">등록</button>
      {/* <Link to={`name: 'BoardListPage' `}>취소</Link> */}
     
    </div>

</form>
</>)

export default ArticleAdd;