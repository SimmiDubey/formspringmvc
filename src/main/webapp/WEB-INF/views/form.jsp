<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@page isELIgnored="false" %>
<%@include file="./base.jsp"%>
</head>
<body>

	
		<div class="container mt-3">
			<div class="col-md-6 offset-md-3">
			<div style="background-image: url('/images/form.jpg'); background-size: cover; background-position: center; padding: 30px; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);">
				
				<h1 class="text-center mb-3">Fill The Form</h1>


				<form action="${pageContext.request.contextPath}/handle-form" method="post">
					<div class="form-group">
						<label for="exampleInputName">Name</label> <input type="text"
							class="form-control" id="name" name="name" placeholder="Enter Name">
					</div>

					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> <input
							type="email" class="form-control" id="email" name="email"
							aria-describedby="emailHelp" placeholder="Enter email"> <small
							id="emailHelp" class="form-text text-muted">We'll never
							share your email with anyone else.</small>
					</div>
					<div class="row">
						<div class="form-group">
							<label for="exampleInputMobile">Mobile NO</label>
						<div class="row">
							<div class="col-md-6">
								<input	type="text" class="form-control" id="primaryNo" name="primaryNo"
								placeholder="primary">
							</div>
							<div class="col-md-6">
								<input	type="text" class="form-control" id="alternativeNo" name="alternativeNo"
								placeholder="alternative">
							</div>
							 </div>
						</div>
					</div>

				 	<!--  <div class="form-group">
						<label for="exampleFormControlFile1">Image File</label>
						 <input type="file" name="image" id="image" class="form-control-file" accept="image/*">
					</div>
                             -->   
		


					<button type="submit" class="btn btn-primary">Submit</button>
				</form>

			</div>
			</div>
		</div>
</body>
</html>