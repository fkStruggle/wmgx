<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<link type="text/css" rel="stylesheet" href="<%=path%>/css/common.css" />
<link rel="stylesheet"
	href="<%=path%>/js/importJs/jquery-ui-1.12.1.custom/jquery-ui.min.css">
<link rel="stylesheet" href="<%=path%>/bootstrap/css/bootstrap.css">
<%-- <link rel="stylesheet" href="<%=path %>/bootstrap/css/bootstrap-theme.css"> --%>
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
	<form id="punAmousDy" action="<%=path%>/amousDy/pubAnoDynamic"
		method="post" enctype="multipart/form-data">
		<textarea id="dynamicinfoId" name="dynamicinfo" rows="10" cols="100"
			maxlength="140" placeholder="来匿名发个信息，爆个料吧"></textarea>
		<br />
		<!-- multiple="multiple" 支持多文件上传  -->

		<span class="btn btn-success fileinput-button"> <span>上传图片</span>
			<input id="fileupload" accept="image/png,image/gif,image/jpeg"
			name="files" type="file" multiple="multiple" class="cursor-pointer" />
		</span>
		<!-- <div class="imgBtn">
		<input id="fileupload"  accept="image/png,image/gif,image/jpeg" name="files" type="file"  multiple="multiple" class ="cursor-pointer"/> 
		</div> -->
		<input id="publis" type="button" onclick="punAmousDy();" value="发布"
			class="cursor-pointer" />
	</form>

	<form action="<%=path%>/commentDetail/findComments" method="post"
		id="formTemp" target="_blank">
		<input type="hidden" value="" name="dynamicinfoTemp"
			id="dynamicinfoTemp"> <input type="hidden" value=""
			name="dynamicIdTemp" id="dynamicIdTemp"> <input type="hidden"
			value="" name="dynamicImageTemp" id="dynamicImageTemp">
	</form>
</div>
<!-- 数据 -->
<div id="amousDyListView">
	<jsp:include page="amousDyList.jsp"></jsp:include>
</div>
<div id="dialog" style="display: none">
	<p style="color: red" id="warnCont">请输入内容</p>
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
	src="<%=path%>/js/importJs/jquery-ui-1.12.1.custom/jquery-ui.js"></script>
<script type="text/javascript"
	src="<%=path%>/js/importJs/jquery.mousewheel.js"></script>
<script src="<%=path%>/bootstrap/js/bootstrap.js"></script>
<!-- <script type="text/javascript">
 	var currentPage = '${page.currentPage }';
	var totalCount = '${page.totalCount }';
	var statue = (currentPage * '${ page.everyPage}' < totalCount);
   </script> -->
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
    function getComment(amousId,amousInfo,image){
    	debugger;
    	//alert(amousId);
    	//window.open("<%=path%>/amousDy/findAnoDynamics");
    	$("#dynamicIdTemp").val(amousId);
    	$("#dynamicinfoTemp").val(amousInfo);
    	$("#dynamicImageTemp").val(image);
    	$("#formTemp").submit();
    }
    //发布
    function punAmousDy(){
    	var dynamicinfo = $("#dynamicinfoId").val();
    	var size = document.querySelector("#fileupload").files.length;
    	debugger;
    	if(dynamicinfo == ''){
    		$("#warnCont").text('请输入内容');
    		$( "#dialog" ).dialog();
    		return ;
    	}
    	if(size>10){
    		$("#warnCont").text('一次最多上传10张图片');
    		$( "#dialog" ).dialog();
    		return ;
    	}
    	$("#punAmousDy").submit();
    }
  <%-- //添加对于火狐浏览器的支持
    var wheelType = "mousewheel";
    if(/firefox/.test(navigator.userAgent.toLowerCase())){
  	  wheelType = "DOMMouseScroll";
    }   
  //滑轮向下滚动刷出新数据，若已显示全部数据，则不再向后台发送请求
    $("#amousDyListView").delegate(".fixed-table-body",wheelType,function(){
  	  $(this).mousewheel(function(event, delta, deltaX, deltaY) {
   			var a = $(event.currentTarget).height();
   			var b = $(event.currentTarget).scrollTop();
   			var c = event.currentTarget.scrollHeight;
   			console.log(a+" "+b+" "+c);
   			if(((a + b >= c-1000) && (delta < 0)) && (delta < 0) && statue){
   				statue = false;
   				$.ajax({
   	      			type : "post",
   	      			url : "<%=path%>/businessSystem/getOtherAcBusinessSystemList?page.currentPage="+currentPage,
   	      			data :  $("#searchForm").serialize(),
   	      			success:function(dates){
   	      				statue = true;
   	      				$("#businessSystemTable").append(dates);//要刷新的div
   	      				$("#businessSystemMainTable").bootstrapTable("resetView");
   	      			},
   	      			error: function() {
   	      	           alert("跳转失败，请稍后再试！");
   	      	        }
   	      		});
   			}
   	   });
    }); --%>
</script>
</html>
