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
<div class="gossip_editor borderBottom" data-reactid="38">
									<p class="sendFeedTit" data-reactid="38">
																		<img src="<%=path%>/image/sendGossip.png"
																											alt="发布匿名交流" title="发布匿名交流" data-reactid="39">
									</p>
									<!-- 
	    enctype的解释
		application/x-www-form-urlencoded	在发送前编码所有字符（默认）
		multipart/form-data	
		不对字符编码。
		在使用包含文件上传控件的表单时，必须使用该值。
		text/plain	空格转换为 "+" 加号，但不对特殊字符编码。
-->

					<!-- <div class="common_input" data-reactid="40">
														<div
																							style="position: relative; border: 1px solid #e2e2e2; padding: 10px 10px 15px 10px; background: #ededed;"
																							data-reactid="41">
																							<div contenteditable="true"
																																class="inputPanel"
																																style="height: 130px; -webkit-user-select: text; border: 0px; padding: 0px; overflow-y: auto; overflow-x: hidden;"
																																data-reactid="42"></div>
																							<span class="text-muted"
																																style="position: absolute; top: 12px; left: 10px;"
																																data-reactid="43">来匿名发个信息，爆个料吧</span><span
																																class="text-muted small"
																																style="position: absolute; bottom: 4px; right: 10px;"
																																data-reactid="44">
																																react-text: 450/react-text
																																react-text: 46//react-text
																																react-text: 47140/react-text
																							</span>
														</div>
														<div class="disBtn" data-reactid="48"></div>
														<div class="imgBtn" data-reactid="49">
																							<input type="file" accept=".png,.jpg"
																																class="file-input" data-reactid="50">
														</div>
														<div data-reactid="51">
																							<a class="sendBtn btn btn-primary"
																																href="javascript:void(0);"
																																data-reactid="52">发布</a>
														</div>
					</div> -->
<div class="common_input" data-reactid="40">
					<form id="punAmousDy" action="<%=path%>/amousDy/pubAnoDynamic"
														method="post" enctype="multipart/form-data">
														<div>
														<textarea id="dynamicinfoId" name="dynamicinfo"
																							rows="10" cols="100" maxlength="140"
																							placeholder="来匿名发个信息，爆个料吧"></textarea>
													<!-- 	<br /> -->
													</div>
														<!-- multiple="multiple" 支持多文件上传  -->
                                                     <div class="imgBtn">
														<!-- <span class="btn btn-success fileinput-button">
																							<span>上传图片</span> <input id="fileupload"
																							accept="image/png,image/gif,image/jpeg"
																							name="files" type="file" multiple="multiple"
																							class="cursor-pointer" />
														</span> -->
														<input id="fileupload" type="file" name="files" accept=".png,.jpg" class="file-input"  multiple="multiple" />
														</div>
														<!-- <div class="imgBtn">
<input id="fileupload"  accept="image/png,image/gif,image/jpeg" name="files" type="file"  multiple="multiple" class ="cursor-pointer"/> 
</div> -->
																											<div>
																																				<input id="publis" type="button"
																																													onclick="punAmousDy();"
																																													value="发布"
																																													class="cursor-pointer sendBtn btn btn-primary" />
																											</div>
																		</form>
</div>
					<form action="<%=path%>/commentDetail/findComments"
														method="post" id="formTemp" target="_blank">
														<input type="hidden" value="" name="dynamicinfoTemp"
																							id="dynamicinfoTemp"> <input
																							type="hidden" value="" name="dynamicIdTemp"
																							id="dynamicIdTemp"> <input
																							type="hidden" value=""
																							name="dynamicImageTemp" id="dynamicImageTemp">
																							<input
																							type="hidden" value=""
																							name="commentCount" id="commentCount">
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
<script type="text/javascript">
 	var currentPage ;
	var totalCount ;
	var statue ;
   </script>
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
    function getComment(amousId,temp,image,commentCount){
    	debugger;
    	//alert(amousId);
    	var amousInfo = $('#'+temp).text();
    	//window.open("<%=path%>/amousDy/findAnoDynamics");
    	$("#dynamicIdTemp").val(amousId);
    	$("#dynamicinfoTemp").val(amousInfo);
    	$("#dynamicImageTemp").val(image);
    	$("#commentCount").val(commentCount);
    	$("#formTemp").submit();
    }
    //发布
    function punAmousDy(){
    	var dynamicinfo = $("#dynamicinfoId").val();
    	var size = document.querySelector("#fileupload").files.length;
    	//debugger;
    	if(dynamicinfo == ''){
    		$("#warnCont").text('请输入内容');
    		$( "#dialog" ).dialog();
    		return ;
    	}
    	if(dynamicinfo.length > 139){
    		$("#warnCont").text('最多输入140字');
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
   //添加对于火狐浏览器的支持
    var wheelType = "mousewheel";
    if(/firefox/.test(navigator.userAgent.toLowerCase())){
  	  wheelType = "DOMMouseScroll";
    }   
  //滑轮向下滚动刷出新数据，若已显示全部数据，则不再向后台发送请求
  	  $('#amousDyListView').mousewheel(function(event, delta, deltaX, deltaY) {
   			var a = $(event.currentTarget).height();
   			var b = $(event.currentTarget).scrollTop();
   			var c = event.currentTarget.scrollHeight;
   			console.log(a+" "+b+" "+c);
   			var data = {};
   			//debugger;
   			data.currentPage = parseInt(currentPage)+1;
   			if(((a + b >= c-1000) && (delta < 0)) && (delta < 0) && statue){
   				statue = false;
   				$.ajax({
   	      			type : "post",
   	      			url : '<%=path%>/amousDy/findAnoDynamics',
				data : JSON.stringify(data),
				contentType : "application/json;charset=utf-8", //设置请求头信息
				success : function(dates) {
					statue = true;
					$("#amousDyListView").append(dates);//要刷新的div
				},
				error : function() {
					alert("跳转失败，请稍后再试！");
				}
			});
		}
	});
</script>
</html>
