<%@ page language="java" contentType="text/html; charset=UTF-8"
									pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp"%>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<link type="text/css" rel="stylesheet" href="<%=path%>/css/common.css" />
<link rel="stylesheet" href="<%=path%>/js/importJs/jquery-ui-1.9.2.custom/css/base/jquery-ui-1.9.2.custom.min.css">

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
	<form id ="punAmousDy" action="<%=path%>/amousDy/pubAnoDynamic" method="post"
										enctype="multipart/form-data" >
		<textarea id="dynamicinfoId" name="dynamicinfo" rows="10" cols="100"
											maxlength="140" placeholder="来匿名发个信息，爆个料吧"></textarea>
											<br/>
		<!-- multiple="multiple" 支持多文件上传  -->
		<input value="请选择图片" id="fileupload" name="files" type="file"  multiple="multiple" class ="cursor-pointer"/> 
		<input id="publis" type="button" onclick="punAmousDy();" value="发布" class ="cursor-pointer"/>
	</form>
</div>
<!-- 数据 -->
<div id="amousDyListView" >
		<jsp:include page="amousDyList.jsp"></jsp:include>
</div>
<div id="dialog" style="display: none" >
  <p>请输入内容</p>
</div>
<script type="text/javascript"
									src="<%=path%>/js/importJs/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
									src="<%=path%>/fileupload/js/vendor/jquery.ui.widget.js"></script>
<script type="text/javascript"
									src="<%=path%>/fileupload/js/jquery.iframe-transport.js"></script>
<script type="text/javascript"
									src="<%=path%>/fileupload/js/jquery.fileupload.js"></script>
									<%-- <script type="text/javascript"
									src="<%=path%>/js/importJs/jquery-ui-1.9.2.custom/js/jquery-ui-1.9.2.custom.min.js"></script> --%>
									<!-- <script type="text/javascript"
									src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script> -->
									<script type="text/javascript"
									src="<%=path%>/js/importJs/jquery-ui-1.9.2.custom/development-bundle/ui/jquery-ui.custom.js"></script>
									

<script type="text/javascript">
    $(function(){
    	var dataStr ='{"currentPage":1}';
    	//var dataStr ='{"currentPage":1,"totalCount":100}';
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
        
      /*    $('#fileupload').fileupload({
        	dataType: 'json',
        	// 上传完成后的执行逻辑
        	done: function (e, data) {
        	$.each(data.result.files, function (index, file) {
        		debugger;
        	$('<p/>').text(file.name).appendTo(document.body);
        	});
        	},
     
		});  */
	});
    //跳转到评论页面
    function getComment(amousId){
    	alert(amousId);
    }
    //发布
    function punAmousDy(){
    	var dynamicinfo = $("#dynamicinfoId").val();
    	debugger;
    	if(dynamicinfo == ''){
    		$( "#dialog" ).dialog();
    		return ;
    	}
    	$("#punAmousDy").submit();
    }
</script>
</html>
