<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	function loadXMLDoc()
	{
		if (window.XMLHttpRequest)
  		{// code for IE7+, Firefox, Chrome, Opera, Safari
  			xmlhttp=new XMLHttpRequest();
  		}
		else
  		{// code for IE6, IE5
  			xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  		}
		xmlhttp.onreadystatechange=function()
  		{
  			if (xmlhttp.readyState==4 && xmlhttp.status==200)
   			{
    		document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
    		}
  		}
		xmlhttp.open("GET","txt/Demo.txt",true);
		xmlhttp.send();
}
</script>
</head>
<body>
<h2>Hello World!</h2>
<form action="user/showUser?id=1" method="post">
<h1>这是一个查询Demo</h1>
<input type="submit" value="select by id">
<div id="myDiv"><h3>Let AJAX change this text</h3></div>
<button type="button" onclick="loadXMLDoc()">Change Content</button>
</form>
</body>
</html>
