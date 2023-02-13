<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Pizza Order Form</title>
<link rel="stylesheet" href="./quizcss.css">
</head>
<body>

	<div id="frame">
		<form action="./Order Summary.jsp" method="POST">
			<h1 id="title">Pizza Order Form</h1>
			
			<div id="container1">
				<h3 class="subtitle">Delivery Information</h3>
					<label for="name" class="info">Name</label>
					<input type="text" name="name" class="long"> <br>
					<label for="street-address" class="info">Street Address</label>
					<input type="text" name="street-address" class="long"> <br>
					<label for="city" class="info">City</label>
					<input type="text" name="city"> <br>
					<label for="email" class="info">Email</label>
					<input type="text" name="email" class="long"> <br>
					<label for="phone" class="info">Phone</label>
					<input type="text" name="phone">
			</div>
			<div id="container2">
				<h3 class="subtitle">Order</h3>
				<div id="crust">
					<span class="category">Crust</span><br>
					<input type="radio" name="crust" id="thin-crust" value="Thin Crust" checked>
					<label for="thin-crust">Thin Crust</label>
					<input type="radio" name="crust" id="deep-dish" value="Deep Dish">
					<label for="deep-dish">Deep Dish</label>
				</div>
				<div>
					<span class="category">Size</span><br>
					<select name="size">
						<option value="small">Small</option>
						<option value="medium">Medium</option>
						<option value="large">Large</option>
					</select>
				</div>
				<div id="toppings">
					<span class="category">Topping(s)</span><br>
					<input type="checkbox" name="toppings" id="pepperoni" value="Pepperoni">
					<label for="pepperoni">Pepperoni</label>
					<input type="checkbox" name="toppings" id="sausage" value="Sausage">
					<label for="sausage">Sausage</label>
					<input type="checkbox" name="toppings" id="green-peppers" value="Green Peppers">
					<label for="green-peppers">Green Peppers</label>
					<input type="checkbox" name="toppings" id="onions" value="Onions">
					<label for="onions">Onions</label>
					<br>
					<input type="checkbox" name="toppings" id="extra-cheese" value="Extra Cheese">
					<label for="extra-cheese">Extra Cheese</label>
				</div>
				<div>
					<span class="category">Special Instructions</span><br>
					<textarea placeholder="Input some text." cols="55" rows="3" name="instructions"></textarea>
				</div>
			</div>
			<div id="post"><input type="submit" value="Preview Order"></div>
		</form>
	</div>
</body>
</html>