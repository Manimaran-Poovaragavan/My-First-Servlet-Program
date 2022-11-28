<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>my first project</title>
</head>
<body>
	<h1>Application Form</h1>

	<div>
         <form action="UserSubmit" method="post">
		<div>
			First name : <input type="text" name="firstname" id="firatname">
		</div> <br/><br/>
		
		<div>
			Father name : <input type="text" name="fathername" id="fathername">
		</div> <br/><br/>

		
		<div>
			DOB : <input type="text" name="dob" id="dob">
		</div> <br/><br/>
		<div>
			Mobile no : <input type="text" name="mobileno" id="mobileno">
		</div> <br/><br/>
		<div>
			Email : <input type="text" name="email" id="email">
		</div> <br/><br/>
		<div>
			Qualification : <input type="text" name="qualification" id="qualification">
		</div> <br/><br/>
		
		<div>
		   <button type="submit">SUBMIT</button>
		</div>
		</form>
	</div>
</body>
</html>