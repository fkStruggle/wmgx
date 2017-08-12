<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp"%>
<%
	String path = request.getContextPath();
%>
<c:forEach items="${res.data }" var="commentData">
	<div id ="${commentData.acommentid }" class ="cursor-pointer" >
		<p>${commentData.cconten }</p>
		
	</div> 
	<hr />
</c:forEach>
 <script type="text/javascript">
 	 currentPage = '${page.currentPage }';
	 totalCount = '${page.totalCount }';
	 statue = (currentPage * '${ page.everyPage}' < totalCount);
   </script> 
