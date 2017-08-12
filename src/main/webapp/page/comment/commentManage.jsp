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
<div id="${dynamicIdTemp }">
	<p>${dynamicinfoTemp }</p>
	<c:if test="${dynamicImageTemp != null || dynamicImageTemp != ''}">
		<%-- <c:if test="${aMousDyData.imageNames }"> --%>
		<%-- <c:if test="${list== null || fn:length(list) == 0}"></c:if> --%>
		<c:forEach items="${dynamicImageTemp }" var="imageName">
			<img alt="" src="/upload/${imageName}">
		</c:forEach>
	</c:if>
	<ul>
		<li><span>赞</span></li>
		<li style="width: 60px;"><span onclick="addComment()">评论</span></li>
	</ul>
	<textarea id="cconten" name="cconten" rows="10" cols="100"
		maxlength="140" placeholder="吐槽吧....."></textarea>
	<input type="hidden" id="dynamicid" name="dynamicid"
		value="${dynamicIdTemp }">
</div>
<hr />
<!-- 评论数据 -->
<div id="commentListView">
	<jsp:include page="commentList.jsp"></jsp:include>
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
<script type="text/javascript"
	src="<%=path%>/js/importJs/jquery-ui-1.12.1.custom/jquery-ui.js"></script>
<script type="text/javascript"
	src="<%=path%>/js/importJs/jquery.mousewheel.js"></script>
<script src="<%=path%>/bootstrap/js/bootstrap.js"></script>
 <script type="text/javascript">
 	var currentPage;
	var totalCount;
	var statue;
   </script> 
<script type="text/javascript">
//评论
    function addComment(){
    	debugger;
    	var dynamicid  = $("#dynamicid").val();
    	var cconten  = $("#cconten").val();
    	if(cconten =='' ){
    		$("#warnCont").text('请输入内容');
    		$( "#dialog" ).dialog();
    		return;
    	}
    	var data = {};
    	data.dynamicid = dynamicid;
    	data.cconten = cconten;
    	$.ajax({
    		url:'<%=path%>/commentDetail/addComment',
			type : 'post',
			data : data,
			dataType : 'json',
			success : function(data) {
				if(data.code =='0000'){
					setTimeout(function(){
						findCommets();
					},2000);
				}

			},
    		error:function(data){
               if(data.code =='1111'){
            	   $("#warnCont").text('评论失败');
           		$( "#dialog" ).dialog();
				}
    		}
		});

	}
	//查看列表
	function findCommets(){
    	debugger;
    	var dynamicid  = $("#dynamicid").val();
    	var data = {};
    	data.dynamicid = dynamicid;
    	$.ajax({
    		url:'<%=path%>/commentDetail/findComentLists',
			type : 'post',
			data : data,
			dataType : 'html',
			success : function(data) {
               $("#commentListView").html(data);
			},
    		error:function(data){
            	$("#warnCont").text('获取评论列表失败');
           		$( "#dialog" ).dialog();

    		}
		});

	}
	
	//添加对于火狐浏览器的支持
    var wheelType = "mousewheel";
    if(/firefox/.test(navigator.userAgent.toLowerCase())){
  	  wheelType = "DOMMouseScroll";
    }   
  //滑轮向下滚动刷出新数据，若已显示全部数据，则不再向后台发送请求
  	  $("#commentListView").mousewheel(function(event, delta, deltaX, deltaY) {
  		  debugger;
   			var a = $(event.currentTarget).height();
   			var b = $(event.currentTarget).scrollTop();
   			var c = event.currentTarget.scrollHeight;
   			console.log(a+" "+b+" "+c);
   			var dynamicid  = $("#dynamicid").val();
   	    	var data = {};
   	    	data.dynamicid = dynamicid;
   	    	data.currentPage=parseInt(currentPage)+1;
   			if(((a + b >= c-1000) && (delta < 0)) && (delta < 0) && statue){
   				statue = false;
   				$.ajax({
   	      			type : "post",
   	      			url : '<%=path%>/commentDetail/findComentLists',
   	      			data :  data,
   	      			success:function(dates){
   	      				statue = true;
   	      				$("#commentListView").append(dates);//要刷新的div
   	      			},
   	      			error: function() {
   	      	           alert("跳转失败，请稍后再试！");
   	      	        }
   	      		});
   			}
   	   });
</script>
</html>