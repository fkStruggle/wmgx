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
<%-- <div id="${dynamicIdTemp }">
	<p>${dynamicinfoTemp }</p>
	<c:if test="${dynamicImageTemp != null || dynamicImageTemp != ''}">
		<c:if test="${dynamicImageTemp }">
		<c:if test="${list== null || fn:length(list) == 0}"></c:if>
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
</div> --%>
<div>
<div class="SpreadLayerContainer">
<div class="borderBottom p-l-md p-r-md p-t p-b" style="position: relative;">
<!-- react-text: 5 -->发表评论<!-- /react-text -->
<!-- <img class="cursor-pointer" src="../image/closed.png" style="position: absolute; top: 17px; right: 15px; width: 15px; height: 15px;"> -->
</div>
<div class="p-l-md p-r-md p-t p-b"><img src="../image/gossip_avatar.png" style="width: 32px; height: 32px; border-radius: 2px; margin-right: 10px;">
<span class="text-muted">匿名交流:</span>
<span class="">${dynamicinfoTemp }</span>
</div>

<c:if test="${dynamicImageTemp !=null && fn:length(dynamicImageTemp) == 1}">
		<c:forEach items="${dynamicImageTemp }" var="imageName">
		<div class="clearfix" style="position: relative;">
		<div>
		<img class="singleImg" src="/upload/${imageName}" style="cursor: pointer; width: 202px; height: 240px; margin-left: 229px;">
		</div>
		</div>
			<%-- <img alt="" src="/upload/${imageName}"> --%>
		</c:forEach>
		</c:if>
		<c:if test="${dynamicImageTemp !=null && fn:length(dynamicImageTemp) > 1}">
		<div class="clearfix" style="position: relative;">
		<c:forEach items="${dynamicImageTemp }" var="imageName">
		    <img src="/upload/${imageName}"
		 style="cursor: pointer; float: left; margin-right: 5px; margin-top: 5px; 
		 margin-bottom: 5px; width: 215px; height: 215px;">
		</c:forEach>
		</div>
		</c:if>
<div><div>
<!-- <div class="p-l-md p-r-md" style="padding-bottom: 30px;"><div class="common_input">
<div style="position: relative; border: 1px solid rgb(226, 226, 226); padding: 10px 9px 37px;"> -->
<!-- <div contenteditable="true" class="inputPanel" style="height: 80px; user-select: text; border: 0px; padding: 0px; overflow-y: auto; overflow-x: hidden;">
</div>
<span class="text-muted" style="position: absolute; top: 12px; left: 10px;">匿名评论
</span><span class="text-muted small" style="position: absolute; bottom: 4px; right: 10px;">
react-text: 180/react-text --><!-- react-text: 19//react-text --><!-- react-text: 20250/react-text
</span> -->
   <textarea id="cconten" name="cconten" rows="10" cols="100"
		maxlength="140" placeholder="匿名评论"></textarea>
	<input type="hidden" id="dynamicid" name="dynamicid"
		value="${dynamicIdTemp }">
</div>
<div class="disBtn"></div>
<div>
<span class="comSendBtn btn btn-primary" onclick="addComment()">发表</span>
<!-- <a class="sendBtn btn btn-primary" href="addComment()">发表</a> -->
</div></div></div>




<!-- <hr/>  -->

<!-- 评论数据 -->
<div id="commentListView">
<c:if test="${commentCount!=0}">
    <div class="discuzTit">全部评论</div>
    </c:if>
	<jsp:include page="commentList.jsp"></jsp:include>
</div>
</div>
<div id="dialog" style="display: none">
	<p style="color: red" id="warnCont">请输入内容</p>
</div>


<!-- <div class="PCGossipContainer cursor-pointer borderBottom" data-reactid="37"><div class="text-gossip-muted clearfix m-y" style="position:relative;" data-reactid="38"><span class="float-l" style="font-size:16px;" data-reactid="39">匿名发布:任我行</span><span class="float-r" style="font-size:12px;" data-reactid="40">1天内</span></div><div class="m-b" style="font-size:16px;" data-reactid="41"><div data-reactid="42"><p data-reactid="43"><span class="" data-reactid="44">react-text: 45唉，南开硕士，被一个阿里面试秒成渣了，你们工作都在考试吗？？？/react-text</span></p><p data-reactid="46"><span class="" data-reactid="47">react-text: 48在校的科研项目好几个我是负责人，你一个面试的格局能大点吗？/react-text</span></p><p data-reactid="49"><span class="" data-reactid="50">react-text: 51我有点替阿里丢人。/react-text</span></p></div></div><div class="clearfix" data-reactid="52"><div class="float-l small text-muted" style="line-height:50px;text-align:center;" data-reactid="53">好友的好友</div><ul class="PCzkp text-muted float-r" data-reactid="54"><li style="width:60px;" data-reactid="55"><span class="PCpingIcon" data-reactid="56">38</span></li><li data-reactid="57"><span class="PCkuoIcon" data-reactid="58">5</span></li><li data-reactid="59"><span class="PCzanIcon" data-reactid="60">2</span></li></ul></div></div>
 -->
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
					},1000);
				}

			},
    		error:function(data){
               if(data.code =='1111'){
            	   $("#warnCont").text('评论失败');
           		$( "#dialog" ).dialog();
				}
    		}
		});
    	$("#cconten").val('');
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
               $("#commentListView").html('<div class="discuzTit">全部评论</div>'+data);
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