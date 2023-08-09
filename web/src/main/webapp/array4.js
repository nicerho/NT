function idck() {
	if (f.mid.value == "") {
		alert("아이디를 입력하시오");
	} else {
		ajax(f.mid.value);
	}
}
let apost;
let bdata;
function ajax(data) {
	var ajax_data = "mid=" + data;
	function aaa() {
		if (window.XMLHttpRequest) {
			return new XMLHttpRequest();
		}
	}
	function bbb() {
		if (apost.readyState == XMLHttpRequest.DONE && apost.status == 200) {
			bdata = this.response;
			return_resp(bdata) // 리턴 메세지를 별도로 핸들링 하는 함수로 전달

		}
	}
	apost = aaa();
	apost.onreadystatechange = bbb;
	apost.open("POST", "http://192.168.110.223:8081/web/login_idck.jsp", true);
	apost.setRequestHeader("content-type", "application/x-www-form-urlencoded");
	apost.send(ajax_data);
}
function return_resp(rp) {
	console.log(rp);
	if (rp == "no") {
		alert("생성불가")
	} else if (rp == "error") {
		alert("올바른 접근방식X")
	}
	else {
		alert("OK")
	}

}