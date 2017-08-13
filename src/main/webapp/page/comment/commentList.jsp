<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp"%>
<%
	String path = request.getContextPath();
%>
<%-- <c:if test="${res.data!=null && fn:length(res.data)>=1 }">
<div class="discuzTit">全部评论</div>
</c:if> --%>
<c:forEach items="${res.data }" var="commentData">
	<hr /> 
<div id ="${commentData.acommentid }" >
	<%-- <div id ="${commentData.acommentid }" class ="borderBottom PCGossipContainer" > --%>
		<%-- <p>${commentData.cconten }</p> --%>
		<!-- <div class =".m-b"> -->
		<div>
		<p><span>      ${commentData.cconten }</span></p>
		<!-- </div> -->
		</div>
		
	</div> 
 
</c:forEach>
 <script type="text/javascript">
 	 currentPage = '${page.currentPage }';
	 totalCount = '${page.totalCount }';
	 statue = (currentPage * '${ page.everyPage}' < totalCount);
   </script> 
