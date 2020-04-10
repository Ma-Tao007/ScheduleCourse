<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh-CN" xmlns:th="http://www.w3.org/1999/xhtml">

<head>
<meta charset="utf-8">
    <title>校园招聘平台</title>
<link rel="stylesheet" th:href="@{/css/style.css}">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</head>

<body>
    <div class="content">
        <div class="form sign-in">
       		<form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/login" id="from1" onsubmit="login()" method="post">
	            <h2>欢迎回来</h2>
	            <label>
	                <span>用户名/学号</span>
	                <input class='input' type="text" id="username" name='username' />
	            </label>
	            <label>
	                <span>密码</span>
	                <input class='input' type="password" id="password" name='password' />
	            </label>
	           <!-- 	<div style='width:50%;height:20px;line-height:74px;text-align:center;margin:auto'>
	             <input type="radio" name='role' value='2' checked/>用户  
	             <input type="radio" name='role' value='0'/>管理员
	            </div> -->
	            <button type="submit" class="submit" >登 录</button>
            </form>
        </div>
        <div class="sub-cont">
            <div class="img">
                <div class="img__text m--up">
                    <h2>高校排课系统</h2>
                    <p>欢迎您</p>
                </div>
                <div class="img__text m--in">
                    <h2>已有帐号？</h2>
                    <p>有帐号就登录吧，好久不见了！</p>
                </div>
                <%--<div class="img__btn">--%>
                    <%--<span class="m--up">注 册</span>--%>
                    <%--<span class="m--in">登 录</span>--%>
                <%--</div>--%>
            </div>
            <div class="form sign-up">
                <h2>立即注册</h2>
                <label>
                    <span>用户名</span>
                    <input class='input' type="text" id="rgusername" />
                </label>
                <label>
                    <span>密码</span>
                    <input class='input' type="password" id="rgpassword" />
                </label>
                <button type="button" class="submit" onclick="rigst()">注 册</button>
            </div>
        </div>
        <input hidden id='contextPath' value='${pageContext.request.contextPath}'>
    </div>
</body>
<SCRIPT>
document.querySelector('.img__btn').addEventListener('click', function() {
    document.querySelector('.content').classList.toggle('s--signup')
})
    var contextPath = $("#contextPath").attr("src")
    //頁面回车事件
    // document.onkeyup = function (e) {
    //     if (window.event)//如果window.event对象存在，就以此事件对象为准
    //         e = window.event;
    //     var code = e.charCode || e.keyCode;
    //     if (code == 13) {
    //         //此处编写用户敲回车后的代码
    //         login()
    //     }
    // }
    function rigst(){
        if($("#rgusername").val()=='' || $("#rgpassword").val()==''){
            setTips(false,"请输入用户名和密码",function(){

            },800)
            return
        }
        $.ajax({
            url:contextPath+"login/rigst",
            method:'post',
            data:{'username':$("#rgusername").val(),'password':$("#rgpassword").val()},
            success:function(res){
                if(res.success){
                    setTips(true,"注册成功",function(){
                        $(".m--in").click()
                    },800)

                }else{
                    layer.msg(res.msg,{icon:2})
                }
            },
            error:function (err) {
                console.log(err)
            }
        })

    }
    function login(){
        if($("#username").val()=='' || $("#password").val()==''){
           alert("请输入用户名和密码")
            return
        }
      /*  var role = $("input[name='role']:checked").val() 
       location.href=$("#contextPath").val()+'/login?username='+$("#username").val()+"&password="+$("#password").val() */
       /*  $.ajax({
            url:$("#contextPath").val()+"/login",
            method:'post',
            data:{'username':$("#username").val(),'password':$("#password").val(),'role':role},
            success:function(res){
                 if(res.success){
                    setTips(true,"验证成功",function(){
                        window.location.href = "index"
                    },800)

                }else{
                    layer.msg(res.msg,{icon:2})
                } 
                console.log(res)
            },
            error:function (err) {
                console.log(err)
            }
        })  
        */
    }
</SCRIPT>
</html>


<%-- <!DOCTYPE html>
<html>
<head>
	<title></title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<style type="text/css">
	body{
	   background: url("${pageContext.request.contextPath}/images/a.jpg")repeat;
	}
	#login-box {
		/*border:1px solid #F00;*/
		padding: 35px;
		border-radius:15px;
		background: #56666B;
		color: #fff;
	}

	</style>
</head>
<body>
	<div class="container" id="top">
		<div class="row" style="margin-top: 280px; ">
			<div class="col-md-4"></div>
			<div class="col-md-4" id="login-box">
				<form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/login" id="from1" method="post">
				  <div class="form-group">
				    <label for="firstname" class="col-sm-3 control-label">用户id</label>
				    <div class="col-sm-9">
				      <input type="text" class="form-control" id="userID" placeholder="请输入名字" name="username">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="lastname" class="col-sm-3 control-label">密码</label>
				    <div class="col-sm-9">
				      <input type="password" class="form-control" id="password" placeholder="请输入密码" name="password">
				    </div>
				  </div>
				  <div class="form-group">
				    <div class="col-sm-offset-2 col-sm-10">
				      <div class="checkbox">
				        <label class="checkbox-inline">
							<input type="radio" name="role" value="1" checked>管理员
						</label>
						<label class="checkbox-inline">
							<input type="radio" name="role" value="2">老师
						</label>
						<label class="checkbox-inline">
							<input type="radio" name="role" value="3">学生
						</label>
				      </div>
				    </div>
				  </div>
				  <div class="form-group pull-right" style="margin-right: 15px;">
				    <div class="col-sm-offset-2 col-sm-10">
				      <button type="submit" class="btn btn-default btn-info">登录</button>
				    </div>
				  </div>
				</form>
			</div>
			<div class="col-md-4"></div>
		</div>		
	</div>
</body>
</html> --%>