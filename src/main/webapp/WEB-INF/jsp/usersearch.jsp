<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<html>
<head>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<title>Search for a User</title>
</head>

<div class="container h-40" align='center'>
	<article class="card-body">
		<h4 class="card-title text-center mb-4 mt-1">Search for user</h4>
		<hr>
		<p class="text-success text-center">Please provide info</p>
		<form action='' method='POST'>
			<div class="form-group">
				<div class="input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-user"></i>
						</span>
					</div>
					<input name="lastName" class="form-control" placeholder="lastName"
						type="text">
				</div>
				<!-- input-group.// -->
			</div>
			<!-- form-group// -->
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">
					Search</button>
			</div>
		</form>
		<div>${search}</div>
	</article>
</div>
<!-- card.// -->
</html>