<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../assets/ico/favicon.ico">

    <title>Cal Poly Pomona Jobs Site</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value='/css/bootstrap.min.css'/>" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value='/css/jumbotron.css'/>" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">

          <a class="navbar-brand" href="#">Cal Poly Pomona Jobs </a>
        </div>
        
       <p class="navbar-text pull-right">
        	<sec:authentication property="principal.username"/> <a class="btn btn-xs btn-default" href="<c:url value="/j_spring_security_logout"/>">Logout</a>
        </p>
        
        
      </div>
    </div>
	

	
	
    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h2 class="sub-header">Jobs List</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Job #</th>
                  <th>Title</th>
                  <th>Description</th>
                  <th>City</th>
                  <th>State</th>
                </tr>
              </thead>
              <tbody>
		      	<c:forEach items="${jobs}" var="element"> 
		  		<tr>
		  			<td>${element.jobid}</td>
		    		<td>${element.title}</td>
		    		<td>${element.description}</td>
		    		<td>${element.city}</td>
		    		<td>${element.state}</td>
		  		</tr>
				</c:forEach>        

              </tbody>
            </table>
          </div>
      </div>
    </div>

    <div class="container">


      <hr>

      <footer>
        <p>California State Polytechnic University Pomona 2014</p>
      </footer>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="<c:url value='/js/bootstrap.min.js'/>"></script>
  </body>
</html>
