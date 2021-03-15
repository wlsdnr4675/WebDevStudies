const UserDetail = () => 
(<>
<form>
<h3>마이페이지</h3>
    <table>
      <tr>
        <td>아이디</td>
        <td><input type="text"  /></td>
      </tr>
      <tr>
        <td>비밀번호</td>
        <td><input type="password" /></td>
      </tr>
      <tr>
        <td>이름</td>
        <td><input type="text" /></td>
      </tr>
      <tr>
        <td>이메일</td>
        <td><input type="text" /></td>
      </tr>
      <tr>
        <td>자기소개</td>
        <td><textarea rows="5" ></textarea></td>
      </tr>
    </table>

</form>
</>)

export default UserDetail