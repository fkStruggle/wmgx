<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp"%>
<%
	String path = request.getContextPath();
%>
<%-- <c:if test="${res.data!=null && fn:length(res.data)>=1 }">
<div class="discuzTit">全部评论</div>
</c:if> --%>
<div>
<c:forEach items="${res.data }" var="commentData">
	<hr /> 
<%-- <div id ="${commentData.acommentid }" >
	<div id ="${commentData.acommentid }" class ="borderBottom PCGossipContainer" >
		<p>${commentData.cconten }</p>
		<!-- <div class =".m-b"> -->
		<div>
		<p><span>      ${commentData.cconten }</span></p>
		<!-- </div> -->
		</div>
		
	</div>  --%>
    <li class="list-group-item"><div class="media list-group-item-heading list-group-item-text">
    <div class="media-left"><img class="" src="../image/anony_avatar/avatar_kaifa.png" style="width: 30px; height: 30px; margin-top: 3px;"></div><div class="media-body m-r-md">
    <div class="text-gossip-muted" style="padding-bottom: 4px; font-size: 16px;"><!-- react-text: 124 -->${commentData.amousName }<!-- /react-text --><!-- react-text: 125 --> <!-- /react-text --></div><!-- react-text: 126 --><!-- /react-text --><div class="cursor-pointer" style="font-size: 16px;"><div><p><span class="">
    <!-- react-text: 131 -->${commentData.cconten }<!-- /react-text --></span>
    </p></div></div></div></div></li></c:forEach>
</div>
 <script type="text/javascript">
 	 currentPage = '${page.currentPage }';
	 totalCount = '${page.totalCount }';
	 statue = (currentPage * '${ page.everyPage}' < totalCount);
   </script> 
