

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
  <title>Employee Directory</title>
  
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" 
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>





<body>
 
 
 <div class="container">
 <h3>Employee Directory</h3>
	<hr>

    <input type="button" value="add Customer" onclick="window.location.href='add'; return false ; "
		
		   class="btn btn-primary btn-sm mb-3"/>
		   
		    <form:form action="search" method="GET">
                Search customer: <input type="text" name="name"  class="form-control  ml-5 mr-sm-2 mb-3"/>
                
                <input type="submit" value="Search" class="btn btn-success mb-3" />
            </form:form>
     
     
			<table class="table table-bordered table-striped">
			<thead class="thead-dark">
			<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
				
				
				<!-- loop over and print our customers -->
				<c:forEach var="Employee" items="${Employees}">
				
				<c:url var="updatelink" value="/api/update">
				 
				 <c:param name="employeeId" value="${Employee.id}"/>
				
				</c:url>
				<c:url var="deletelink" value="/api/delete">
				 
				 <c:param name="employeeId" value="${Employee.id}"/>
				
				</c:url>
				   
				
				
				
					<tr>
						<td> ${Employee.firstname} </td>
						<td> ${Employee.lastname} </td>
						<td> ${Employee.email} </td>
						<td>   
						<a href="${updatelink}" class="btn btn-info btn-sm">Update</a>
						|
						<a href="${deletelink}" class="btn btn-danger btn-sm" 
						onclick="if(!(confirm('Are You want To delete this employee ?'))) return false "
						>Delete</a>
						
						</td> 
					     
					   
				
						
						
				
						
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		
	
 
     </div>
    
    
    
    
    
    
    
     
</body>
    
    
    
    
    
    
    
    
    </html>