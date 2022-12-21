
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>

<head>



<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" 
integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

	<title>Save Employee</title>




</head>


<body>

<div class="container">
	
		<h3>Employee Directory</h3>
		<hr>
		
		<p class="h4 mb-4">Save Employee</p>
		
		<form:form action="save"  modelAttribute="employee" method="post">
		 <form:hidden path="id"/>
		
		
		
		
		<label>First Name</label>
   <form:input   path="firstname"  class="form-control mb-4 col-4" />
   
   <label>Last Name</label>
   <form:input path="lastname" class="form-control mb-4 col-4"/>
   
   
   <label>Email</label>
   <form:input path="email" class="form-control mb-4 col-4"/>
   
   
   <input type="submit" value="Save" class="btn btn-info col-2" />   
		
		</form:form>
		
		  <div style="clear; both;"></div>
		
		
		
		
		
		
		<a href="${pageContext.request.contextPath}/api/show">Back To List</a>
		
		</div>






</body>



</html>
