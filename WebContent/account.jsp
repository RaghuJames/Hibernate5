<!DOCTYPE html>
<%@ include file="/taglibs.jsp"%>
<style>
	body{
		background-color: #21447c;
	
</style>
<springForm:form name="loginForm" commandName="accountModel" method="post" action="accounts.htm">
	<table>
	<thead>
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
		    <th>Account Code</th>
		    <th><springForm:input path="acctCode" size="15"/> </th>
		  </tr> 
		   <tr>
		    <th>Account Name</th>
		    <th><springForm:input path="acctNo" size="15"/> </th>
		  </tr> 
		   <tr>
		    <th>Account Name</th>
		    <th><springForm:input path="acctName" size="15"/> </th>
		  </tr> 
		 </thead>
		 <tbody>
		 	<c:forEach items="${accountList}" var="page" varStatus="loopStatus">
		 		<tr>
		 		<td>
		 				<springForm:input path="accountList[${loopStatus.index}].acctCode" class="allowAlphsDot" value="${page.acctCode}" maxlength="20" />
		 			</td>
		 			<td>
		 				<springForm:input path="accountList[${loopStatus.index}].acctNo" class="allowAlphsDot" value="${page.acctNo}" maxlength="20" />
		 			</td>
		 			<td>
		 				<springForm:input path="accountList[${loopStatus.index}].acctName" class="allowAlphsDot" value="${page.acctName}" maxlength="20" />
		 			</td>
		 		</tr>
		 	</c:forEach>
		 </tbody>
</table>
<tr>
	<td>
		<button type="submit">Submit</button>
	</td>
</tr>
</springForm:form>