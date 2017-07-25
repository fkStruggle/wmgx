<%@ page language="java" contentType="text/html; charset=UTF-8"
									pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp"%>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<div>
	发布匿名交流:
	<!-- 
	    enctype的解释
		application/x-www-form-urlencoded	在发送前编码所有字符（默认）
		multipart/form-data	
		不对字符编码。
		在使用包含文件上传控件的表单时，必须使用该值。
		text/plain	空格转换为 "+" 加号，但不对特殊字符编码。
	 -->
	<form action="<%=path %>/amousDy/pubAnoDynamic" method="post" enctype="multipart/form-data">
	<textarea name="dynamicinfo"  rows="10" cols="100" maxlength="140"
										placeholder="来匿名发个信息，爆个料吧"></textarea>
    <input name ="files" type="file" value=""/>

    <input id="publis" type="submit" value="发布" />
    </form>
</div>
<!-- 数据 -->
<div id="amousDyListView">
    <jsp:include page="amousDyList.jsp"></jsp:include>
</div>
<script type="text/javascript" src="<%=path%>/js/importJs/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
    $(function(){
    	var dataStr ='{"currentPage":1}';
        $.ajax({
        	url:"<%=path%>/amousDy/findAnoDynamics",
        	type:"post",
        	data:dataStr,
        	dataType:"html",
        	contentType : "application/json;charset=utf-8", //设置请求头信息
        	success:function(data){
        		$("#amousDyListView").html(data);
        	}
        });
    });
</script>
</html>
