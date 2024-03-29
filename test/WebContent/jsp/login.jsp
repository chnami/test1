<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <style>
    .container{width:50%;border:1px solid lightgray;
               padding:20px;margin-top:20px}
  </style>
</head>
<body>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
$(function(){
	var id='<%=request.getAttribute("id")%>';
	if(id){
		$("input:checkbox").prop('checked',true);
		$("#id").val(id);
	}
	$("button:eq(1)").click(function(){
		location.href="join";
	})
})
</script>
 <div class="container">

    <form action="login_ok_cookie">
       <div class="form-group">
          <label for="id">Id</label>
          <input type="text" class="form-control" 
               id="id" placeholder="Enter id" 
               name="id">
       </div>
       <div class="form-group">
           <label for="pwd">Password</label>
           <input type="password" class="form-control" id="pwd" 
                  placeholder="Enter password" name="pswd">
       </div>
       <div class="form-group form-check">
          <label class="form-check-label">
          <input class="form-check-input" type="checkbox" 
                 name="remember"> Remember me
          </label>
       </div>
          <button type="submit" class="btn btn-primary">로그인</button>
          <button type="button" class="btn btn-info">회원가입</button>
     </form>
  </div>
</body>
</html>