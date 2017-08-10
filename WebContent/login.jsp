<!DOCTYPE html>
<%@ include file="/taglibs.jsp"%>
<style>
	body{
		background-color: #21447c;
	
</style>
<springForm:form name="loginForm" commandName="user" method="post" action="login.htm">
	<table>
	<tr>
    <th>UserCode</th>
    <th><springForm:input path="userId" size="15"/> </th>
  </tr>
  <tr>
    <th>UserName</th>
    <th><springForm:input path="userName" size="15"/> </th>
  </tr>
   <tr>
    <th>Password</th>
    <th><springForm:password path="password" size="15"/> </th>
  </tr>
  <tr>
   <td><input type="submit"> </td>
  </tr>
</table>

</springForm:form>