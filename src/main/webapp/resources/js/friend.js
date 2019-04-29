

//查询个人主页 /homepage?id=3
function getHomepage(id) {
	window.location.href = "/homepage?id=" + id;
}


//查询用户所有好友
$.post("findFriendAll", {}, function (data) {

	//判断是否登入
	if (data != "登入失败") {

		//获取返回数据
		var findFriend = JSON.parse(data);

		/**
		 <TH>UserName(31)</TH>
		 */
		//添加好友数量
		var followerCount = findFriend["followerCount"];
		$("#followerCount").html("<TH>UserName(" + followerCount + ")</TH>");

		/**
		 <TR Data-index="30" data-id="20011" data-key="唐宏禹1">
		 <TD Data-name="userName">唐宏禹1</TD></TR>
		 */
		//添加好友名字与id
		var followersArray = findFriend["followers"];
		var tr = "";
		for (var i = 0; i < followersArray.length; i++) {
			//获取每一个对象
			var followers = followersArray[i]["relatingUser"];
			//好友名字
			var name = followers["nickname"];
			//好友id
			var followersId = followers["id"];
			tr += "<TR  Data-index=" + i + " data-id=" + followersId + " data-key=" + name + " onclick=\"aitFriend(this)\">\n\
				<TD Data-name=\"userName\">" + name + "</TD></TR>";
		}

		$("#followers").html(tr);
	}
});

//弹出复制框
function copyBox() {
	//初始化模态框
	$("#mymodal").modal({
		//点击背景不关闭
		backdrop: "static",
		//触发键盘esc事件时不关闭
		keyboard: false
	});
	//设置模态框隐藏事件
	var textValue = $("input#foo").val();
	var clipboard = new ClipboardJS('.btn', {
		text: function () {
			return textValue;
		}});
	$('#mymodal').on('hide.bs.modal', function () {

		//实例化插件 返回的值

		clipboard.on('success', function (e) {//复制成功时候
			//alert("复制" + e.text);
			console.info('Action:', e.action); //触发复制行为
			console.info('Text:', e.text);
			console.info('Trigger:', e.trigger);
			e.clearSelection();
		});
		clipboard.on('error', function (e) {//复制失败
			console.error('Action:', e.action);
			console.error('Trigger:', e.trigger);
			//alert('请选择“拷贝”进行复制!');
		});
	});
}

//添加选中好友
function aitFriend(value) {

	//获取已添加的值
	var friendVal = $("#modalTest_input").val();
	var friendId = $("#modalTest_input").attr("data-id");

	//拼接要添加的值data-id
	//name
	var name = $(value).attr("data-key");
	friendVal += "@" + name;
	//id
	var id = $(value).attr("data-id");
	friendId += id;

	//重新添加
	$("#modalTest_input").val(friendVal);
	$("#modalTest_input").attr("alt", friendVal);
	$("#modalTest_input").attr("data-id", friendId);

}

//确定添加
function addInputBox() {
	var friendVal = $("#modalTest_input").val();
	var friendId = $("#modalTest_input").attr("data-id");

	//添加到输入框
	var textarea = $("TEXTAREA").val();
	textarea += friendVal;
	$("TEXTAREA").val(textarea);

	$("#modalTest_input").attr("data-id", "");
	$("#modalTest_input").val("");
}
