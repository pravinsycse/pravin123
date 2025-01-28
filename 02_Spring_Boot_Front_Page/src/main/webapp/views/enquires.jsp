<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"></link>
</head>
<body bgcolor="#3cb371">
    <h4 style='text-align:center;color:yellow;'>
         ${title}
    </h4>
    
    
    <br/>
	<table align="center" border="2" style="width:90%" class="table table-striped">
        <thead>
           <tr><th>S.No</th><th>Enquiry Name</th><th>EmailId</th><th>ContactNo</th><th>Course</th><th>Operations</th></tr>
        </thead>
        <tbody>
		    <c:forEach var="enquiry" items="${enquires}" varStatus="count">
		       <tr>
		          <td>${count.index + 1}</td>
		          <td>${enquiry.enquiryName}</td>
		          <td>${enquiry.emailId}</td>
		       	  <td>${enquiry.contactNo}</td>	
		       	  <td>${enquiry.course}</td>
		       	  <td>
		       	    <a href="editEnquiry/${enquiry.enquiryId}">|Edit|</a>
		       	    <a href="deleteEnquiry/${enquiry.enquiryId}" onclick="return confirm('Do you want To Delete Enquiry Information?')">|Delete|</a>
		       	  </td>
		       </tr>    
		    </c:forEach>
	    </tbody>
    </table>
    
    <div style='text-align:center;'>
      <a href="${pageContext.request.contextPath}/"> |Home Page|</a>
    </div>
</body>
</html>