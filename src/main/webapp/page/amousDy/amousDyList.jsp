<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/common/common.jsp" %>
<% String path = request.getContextPath(); %>
<c:forEach items="${res.data }" var ="aMousDyData">
    <div>
        <p>${aMousDyData.dynamicinfo }</p>
        <c:forEach items="${aMousDyData.imageNames }" var ="imageName">
        <img alt="" src="/upload/${imageName}">
        </c:forEach>
        <%-- <textarea >${var.dynamicinfo }</textarea> --%>
    </div>
</c:forEach>
