
/* 登录 */
function showloginBoxBS(){
	$("#modal-login").modal('show');
}

//获取当前根目录
function getRootPath_dc() {
	var pathName = window.location.pathname.substring(1);
	var webName = pathName == '' ? '' : pathName.substring(0, pathName.indexOf('/'));
	if (webName == "") {
		return window.location.protocol + '//' + window.location.host;
	}
	else {
		return window.location.protocol + '//' + window.location.host + '/' + webName;
	}
}

var ctx = getRootPath_dc();

$(function () {
	$('')


	$('[data-toggle="tooltip"]').tooltip();
});