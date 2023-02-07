<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<title>X-Workz</title>
</head>
<body>
	<div>
		<nav class="navbar navbar-green bg-dark">
			<div class="container-fluid">
				<img
					src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
					class="img-fluid"  hight="90px" width="90px">	
		</nav>
		</div>
		
		<h1>Anusha's Information</h1>
		<form action="email">
		<h6>Display Email : ${myemail}</h6>
		<input type="submit" value="Show Email"/>
		</form>
		
		<form action="mobile">
		<h6>Display myMobile : ${myMobile}</h6>
		<input type="submit" value="Show Mobile"/>
		</form>
		
		<form action="aadhar">
		<h6>Display myAadhar : ${myAadhar}</h6>
		<input type="submit" value="Show aadhar"/>
		</form>
		
		<form action="age">
		<h6>Display myAge : ${myAge}</h6>
		<input type="submit" value="Show Age"/>
		</form>
		
		<form action="dob">
		<h6>Display myBirthday : ${Birthdate}</h6>
		<input type="submit" value="Show dob"/>
		</form>
		
		<form action="salary">
		<h6>Display salary : ${mySalary}</h6>
		<input type="submit" value="Show salary"/>
		</form>
		
		<form action="friendslist">
		<h6>Display Friends List:</h6>
		<input type="submit" value="Show friends list"/>
		<ul>
		<c:forEach items="${friends}"  var="i">
		<li>${i}</li>
		
		</c:forEach>
		
		</ul>
		</form>
		
		<form action="places">
		<h6>Display visited place List:</h6>
		<input type="submit" value="Show place list"/>
		<ul>
		<c:forEach items="${places}"  var="i">
		<li>${i}</li>
		
		</c:forEach>
		
		</ul>
		</form>
		
		<form action="skill">
		<h6>Display skill set List:</h6>
		<input type="submit" value="Show skill set list"/>
		<ul>
		<c:forEach items="${skills}"  var="i">
		<li>${i}</li>
		
		</c:forEach>
		
		</ul>
		</form>
		
		<form action="edu">
		<h6>
		Display EducationDto:
		<input type="submit" value="Show education list"/>
		</h6>
		<lable>:${education.prePrimary}</lable><br>
		<lable>:${education.secondary}</lable><br>
		<lable>:${education.preUniversity}</lable><br>
		<lable>:${education.university}</lable><br>
		<lable>:${education.prePrimaryPercentage}</lable><br>
		<lable>:${education.primaryPercentage}</lable><br>
		<lable>:${education.secondaryPercentage}</lable><br>
		<lable>:${education.preUniversityPercentage}</lable><br>
		<lable>:${education.universityPercentage}</lable><br>
		
		</form>
		
		<br>
	<form action="family">
		<h3>Display Family</h3>
		<input type="submit" value="Family" /> <br> <label>familyName:${family.familyName}</label>
		</br> <label>location:${family.location}</label></br> <label>
			grandFather:${family.grandFather}</label></br> <label>grandMother:${family.grandMother}</label></br>
		<label>fatheName:${family.fatheName}</label></br> <label>motherName:${family.motherName}</label></br>
		<label>famMembers:${family.famMembers}</label></br> <label>noOfSiblings:${family.noOfSiblings}</label></br>
		<label>fatherProfession:${family.fatherProfession}</label></br> <label>jointFamily:${family.jointFamily}</label></br>
	</form>
	<br>
	<form action="mobilePhone">
		<h3>Display Mobile</h3>
		<input type="submit" value="Mobile" /> <br> <label>
			Mobile Brand:${mobile.brand}</label></br> <label> Mobile
			Model:${mobile.model}</label></br> <label> Mobile Color:${mobile.color}</label></br> <label>
			Mobile Operating System:${mobile.operatingSystem}</label></br> <label>
			Mobile Price:${mobile.price}</label></br>
	</form>
	<br>
	<form action="masala ">
		<h3>Display ChatDTO</h3>
		<input type="submit" value="show chat" /><br>
		<lable>Name:${spicy.chatName}</lable>
		<br>
		<lable>Price:${spicy.chatPrice}</lable>
		<br>
		<lable>Plates:${spicy.noOfPlates}</lable>
		<br>
		<lable>Owner Name:${spicy.ownerName}</lable>
		<br>
		<lable>Id:${spicy.id}</lable>
		<br>
		<lable>Shop name:${spicy.chatShopName}</lable>
		<br>
		<lable>Shop phone :${spicy.chatShopPH}</lable>
		<br>
		<lable>No of Employee:${spicy.noOfEmployee}</lable>
		<br>
		<lable>GST:${spicy.chatGSTNo}</lable>
		<br>
		<lable>Location:${spicy.chatShopLocation}</lable>
	</form>
	<br>
	<form action="beverage">
		<H3>Display BeverageDTO</H3>
		<input type="submit" value="Beverages" /><br>
		<lable>BeverageDTO:${ juice.getBeverageName()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getNoOfbeverage()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getBeveragePrice()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getOwnerName()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getBeverageId()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getBeverageShopName()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getBeverageShopPH()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getBeverageShopLocation()}</lable>
		<br>

	</form>
		
		
</body>
</html>