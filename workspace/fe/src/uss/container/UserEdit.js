const UserEdit = () => 
(<>
    <form>
    <h3>정보 수정</h3>
      <table>
        <tr>
          <td>아이디</td>
          <td><input type="text"/></td>
        </tr>
        <tr>
          <td>비밀번호</td>
          <td><input type="text" /></td>
        </tr>
        <tr>
          <td>이름</td>
          <td><input type="text" /></td>
        </tr>
        <tr>
          <td>이메일</td>
          <td><input type="text"/></td>
        </tr>
      </table>

      <div>
        <button type="submit">수정</button>
      </div>
    </form>
</>)
export default UserEdit;