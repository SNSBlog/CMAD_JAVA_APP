///$(document).ready( function(){$("#addblog").hide();});
//parent.window.location.reload(true);

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
		var isbn1 = $('#name1').val();
		alert(isbn1);
		var title1 = $('#password1').val();
		alert(title1);
		//var id1= 3;
		
	//	var book ={ "Username":"John", "Personid":30, "Password":"New York"};
		var user1 = {
			username : isbn1,
			password : title1
		};
		$.ajax({
			url : 'rest/User/',
			type : 'post',
			dataType : 'text',
			contentType: "application/json; charset=utf-8",
			 beforeSend: function() {
		            alert('sending data');
		            
		        },
		        data : JSON.stringify(user1),
		        success: function() {
		          //  callback(data); // return data in callback
		        document.write("User "+ data+ " is added");
		        },
			error: function(){
				document.write("Can't add user!");
			}
		        
			
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
			username : name,
			password : password
		};
	
	//
	$.ajax({
	   url : 'rest/User/',
		//url : 'rest/User?username='+name+'&password='+password,
		type : 'GET',
		dataType : 'text',
		contentType: "application/json ; charset=utf-8",
		success : function(data) {
			
			alert(' success result');
			//document.write(data);
			//alert(name+ data.postid[0] );
			var receive_data = JSON.parse(data);
			$.each(receive_data, function(idx,obj){
			alert(obj.posttitle);
			$('.change1').text(obj.posttitle);
		});
			
			
			$('#addUser').hide();
			$('#login').hide();
		$('#deleteuser').hide();
		//	$('#blogtabs').show();
			$("#loginresult").html("<h1>Welcome " +name + "</h1>");
			$("#addblog").show();
			
							
			
		},
		 error: function(jqXHR, textstatus,errorThrown){
			    //alert(' error result');
			 document.write("There is an error in find user");
			 alert("status: "+ textstatus); alert("Error: "+ errorThrown);
			  },
		//data : name+"/"+password
			//  data : name+"/"+password
		data: logindata
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