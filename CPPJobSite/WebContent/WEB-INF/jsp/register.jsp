<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <link href="/CPPJobSite/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/CPPJobSite/css/jumbotron.css" rel="stylesheet">

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
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Cal Poly Pomona Jobs </a>
        </div>
        <div class="navbar-collapse collapse">

        </div><!--/.navbar-collapse -->
      </div>
    </div>


    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-2">
          
        </div>
        <div class="col-md-8">
        <form:form cssClass="form-horizontal" commandName="accountForm">
       
        <fieldset>
          <legend>Registration</legend>
          <div class="control-group">
            <label class="control-label" for="input01">First Name</label>
            <div class="controls">
              <form:input path="firstname" cssClass="input-xlarge"/>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="input01">Last Name</label>
            <div class="controls">
            	<form:input path="lastname" cssClass="input-xlarge"/>
            </div>
          </div>
          
          <div class="control-group">
            <label class="control-label" for="input01">E-mail</label>
            <div class="controls">
              <form:input path="email" cssClass="input-xlarge"/>
            </div>
          </div>
          
          <div class="control-group">
            <label class="control-label" for="input01">Password</label>
            <div class="controls">
              <form:password path="password" cssClass="input-xlarge"/>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="select01">Account Type</label>
            <div class="controls">
              <select id="select01">
                <option>Student</option>
                <option>Company</option>
              </select>
            </div>
          </div>
          <div class="form-actions">
            <button type="submit" class="btn btn-primary">Save changes</button>
            <button class="btn">Cancel</button>
          </div>
        </fieldset>
         </form:form>

          
          
          
       </div>
        <div class="col-md-2">
          
        </div>
      </div>

      <hr>

      <footer>
        <p> California State Polytechnic University Pomona 2014</p>
      </footer>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="/CPPJobSite/js/bootstrap.min.js"></script>
  </body>
</html>
