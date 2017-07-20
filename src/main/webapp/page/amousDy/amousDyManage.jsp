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
	<form action="<%=path %>/amousDy/pubAnoDynamic" method="post" enctype="multipart/form-data">
	<textarea name="dynamicinfo"  rows="3" cols="5" maxlength="140"
										placeholder="来匿名发个信息，爆个料吧"></textarea>
    <input name ="files" type="file" value=""/>

    <input id="publis" type="submit" value="发布" />
    </form>
</div>
<div>
    
</div>
<script type="text/javascript" src="<%=path%>/js/importJs/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
    function publis(){
    	
    } 
</script>
</html>
