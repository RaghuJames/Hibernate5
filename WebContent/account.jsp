<!DOCTYPE html>
<%@ include file="/taglibs.jsp"%>
<style>
	body{
		background-color: #21447c;
	
</style>
<springForm:form name="loginForm" commandName="accountModel" method="post" action="accounts.htm">
	<table>
	 <tr>
    <th>BranchCode</th>
    <th><springForm:input path="commonModel.branchCode" size="15"/> </th>
  </tr>
  <tr>
    <th>Audit Date</th>
    <fmt:formatDate var="fmtDate" value="${commonModel.auditDate}" pattern="dd/MM/yyyy"/>
    <th><springForm:input type="Date"  path="commonModel.auditDate" value="${fmtDate}" size="15"/> </th>
  </tr>
   <tr>
    <th>Module Id</th>
    <th><springForm:input path="commonModel.moduleId" size="15"/> </th>
  </tr> 
   <tr>
    <th>AccountCode</th>
    <th><springForm:input path="acctCode" size="15"/> </th>
  </tr>
  <tr>
    <th>AccountName</th>
    <th><springForm:input path="acctName" size="15"/> </th>
  </tr>
  <tr>
    <th>AccountNo</th>
    <th><springForm:input path="acctNo" size="15"/> </th>
  </tr>
  <tr>
   <td><input type="submit"> </td>
  </tr>
</table>

</springForm:form>