<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp"%>
<%
	String path = request.getContextPath();
%>
<c:forEach items="${res.data }" var="aMousDyData">
	<%-- <div id ="${aMousDyData.dynamicid }" style="cursor: pointer;" onclick="getComment(${aMousDyData.dynamicid });"> --%>
 	<div id ="${aMousDyData.dynamicid }" class ="borderBottom PCGossipContainer cursor-pointer" onclick="getComment('${aMousDyData.dynamicid }','aMous${aMousDyData.dynamicid }','${aMousDyData.imageNames }','${aMousDyData.commentCount }');">
	<%-- <div id ="${aMousDyData.dynamicid }" class ="cursor-pointer" onclick="getComment(${aMousDyData.dynamicid },${aMousDyData.dynamicinfo });"> --%>
		<div class =".m-b">
		<div>
		<p><span class id = 'aMous${aMousDyData.dynamicid }'>${aMousDyData.dynamicinfo }</span></p>
		</div>
		</div>
		<c:if test="${aMousDyData.imageNames !=null && fn:length(aMousDyData.imageNames) == 1}">
		<c:forEach items="${aMousDyData.imageNames }" var="imageName">
		<div class="clearfix" style="position: relative;">
		<div>
		<img class="singleImg" src="/upload/${imageName}" style="cursor: pointer; width: 202px; height: 240px; margin-left: 229px;">
		</div>
		</div>
			<%-- <img alt="" src="/upload/${imageName}"> --%>
		</c:forEach>
		</c:if>
		<c:if test="${aMousDyData.imageNames !=null && fn:length(aMousDyData.imageNames) > 1}">
		<div class="clearfix" style="position: relative;">
		<c:forEach items="${aMousDyData.imageNames }" var="imageName">
		    <img src="/upload/${imageName}"
		 style="cursor: pointer; float: left; margin-right: 5px; margin-top: 5px; 
		 margin-bottom: 5px; width: 215px; height: 215px;">
		</c:forEach>
		</div>
		</c:if>
		<%-- <textarea >${var.dynamicinfo }</textarea> --%>
		<div class="clearfix">
		<ul class="PCzkp text-muted float-r">
			<!-- <li><span>赞</span></li> -->
			<li style="width: 60px;"><span class="PCpingIcon"><c:if test="${aMousDyData.commentCount>0 }">${aMousDyData.commentCount }</c:if> <c:if test="${aMousDyData.commentCount==0 }">评论</c:if></span></li>
		</ul>
		</div>
	</div> 
	<!-- <hr /> -->
</c:forEach>
 <script type="text/javascript">
 	 currentPage = '${page.currentPage }';
	 totalCount = '${page.totalCount }';
	 statue = (currentPage * '${ page.everyPage}' < totalCount);
   </script> 
