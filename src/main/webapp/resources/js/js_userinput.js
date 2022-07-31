$(function(){
	$('.tab_btn').click(function(){

		
		$.ajax({
			type : 'post',
			url : 'gonziList.do',
			data: {table : $(this).attr('id')},
			success : function(result){
				var objList = JSON.parse(result)					
				$('dd > ul').empty();
				for(obj of objList){					
					var litag = $('<li/>');
					litag.text(obj['gonziName']);
					$('dd > ul').append(litag);					
				}		
			},error : function(err){
				alert('ajax 통신 실패'+ err); //err이거는 주소값만 떠서 콘솔로 봐야됨
				console.log(err);
				}										
		});		
						
	});			
	
});




