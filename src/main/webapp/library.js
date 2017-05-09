///$(document).ready( function(){$("#addblog").hide();});


$(document).ready(function() {
	$("#addUser").click(function(e) {
		$("#addForm").show(); 
		$("#loginForm").hide(); 
		$("#findResult").hide();
		$("#DeleteForm").hide();
		$("#addresult").hide();
		$("#blogtabs").hide();
		$("#mainSearchForm").show();
	});
	$("#addBtn").click(function() {
		$("#addForm").hide();
		var isbn = $('#name1').val();
		alert(isbn);
		var title = $('#password1').val();
		alert(title);
		var id1= 3;
		
	//	var book ={ "Username":"John", "Personid":30, "Password":"New York"};
		var user = {
			username : isbn,
			password : title
		};
		$.ajax({
			url : 'rest/User',
			type : 'post',
			dataType : 'text',
			contentType: "application/json; charset=utf-8",
			 beforeSend: function() {
		            alert('sending data');
		            
		        },
		        success: function() {
		          //  callback(data); // return data in callback
		        document.write("User "+ data+ " is added");
		        },
			error: function(){
				document.write("Can't add user!");
			},
		        
			data : JSON.stringify(user)
		});
	});

});

$(document).ready(function(){
	$("#login").click(function(){$("#addForm").hide(); $("#loginForm").show(); $("#DeleteForm").hide(); });

$("#loginButton").click(function(){
	$("#loginForm").hide();
	var name = $('#name3').val();
	alert(name);
	var password = $('#password3').val();
	alert(password);
	var logindata = 
		{
			Username : name,
			Password : password
		};
	$.ajax({
		url : 'rest/User/FindUser',
		type : 'post',
		dataType : 'text',
		contentType: "application/json; charset=utf-8",
		success : function(data) {
			alert(name+ data );
			$('#addUser').hide();
			$('#login').hide();
			$('#deleteuser').hide();
			$('#blogtabs').show();
			$("#loginresult").html("<h1>Welcome " +name + "</h1>");
			$("#addblog").show();
			$("#addcomment").show();
			//$("#loginresult").append.text(name);
			//.load('login1.html');
							
			//alert(' success result')
		},
		 error: function(){
			    alert(' error result');
			  },
		data : JSON.stringify(logindata)
	});

		
});

});


$(document).ready(function(){
	$("#deleteuser").click(function(){$("#addForm").hide(); $("#loginForm").hide(); $("#DeleteForm").show();$("#findResult").hide();});

$("#DeleteButton").click(function(){
	//$("#findResult").show();

	var user1 = $("#name2").val();
	//alert(user1);
	if(user1.toLowerCase()=="admin") {
		//return Browser.msgBox("can't delete Admin User");
		//alert("can't use Admin");
	//document.write('<a href="#"  onclick="(deleteuser).click();">back</a>');
		document.write("Deleting Admin User is not Allowed");
		//<a href="#" onClick="window.alert(document.myImage.width)">Width</a><br>
		return ;}
	$.ajax({
		url : 'rest/User/{user1}',
		type : 'post',
		dataType : 'text',
		contentType: "text/plain; charset=utf-8",
		success : 
			function(data) {
			alert(data);
		//	$("#addResult").show();
		//	$('.result').html(data);
		},
		data : user1
		
	});
});

});


//function(data) {
//	$("#addResult").show();
	//$('.result').html(data);
//	document.write(data);
//},