$(function(){
	
	$('#btn').click(function(){
		var url = "sys/login05";
		$.ajax({
			url:url,
			type:"GET",
			dataType:"text",
			async:true,
			data:{loginName:"abc",password:"123456"},
			success:function(data){
				alert(data);
			}
		});
	});
	
	$('#btn02').click(function(){
		var url = "sys/1/xiaoma/123456";
		$.ajax({
			url:url,
			type:"GET",
			dataType:"text",
			async:true,
//			data:{loginName:"abc",password:"123456"},
			success:function(data){
				alert(data);
			}
		});
	});
	
	
	
	
	
	
});