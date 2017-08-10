<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<c:forEach items="${res.data }" var="aMousDyData">
	<div id="${aMousDyData.dynamicid }">
		<p>${aMousDyData.dynamicinfo }</p>
		<c:if
			test="${aMousDyData.imageNames != null || fn:length(aMousDyData.imageNames) > 0}">
			<%-- <c:if test="${aMousDyData.imageNames }"> --%>
			<c:forEach items="${aMousDyData.imageNames }" var="imageName">
				<img alt="" src="/upload/${imageName}">
			</c:forEach>
		</c:if>
		<%-- <textarea >${var.dynamicinfo }</textarea> --%>
		<ul>
			<li><span>赞</span></li>
			<li style="width: 60px;"><span
				onclick="getComment(${aMousDyData.dynamicid });">评论</span></li>
		</ul>
	</div>
	<hr />
</c:forEach>
<!-- 评论数据 -->
<div id="commentListView">
	<jsp:include page="commentList.jsp"></jsp:include>
</div>
</html>