function login() {
	return true
}

//storage : local,session 웹 브라우저에 작은 메모리를 활용하여 해당 정보를 기억시켜놓는 공간 단점은 브라우저 종류가 다를 경우 스토리지값이 유/무로 나뉜다
//window.localStorage.getItem("별명",값 또는 변수명) : storage에 저장;
//window.localStorage.getItem("별명") : storage에 있는 별명명칭 값을 가져올때;
//local은 브라우저 종료 하더라도 값 유지, session은 브라우저 종료시 값 삭제
//window.localStorage.removeItem("별명") 로컬이던 세션이던 스토리지 삭제를 원한다면 이렇게
var storage = window.localStorage.getItem("userid");
f.uid.value = storage;
function id_save() {
	var ck = document.getElementById("saveid")

	if (f.uid.value == "") {
		ck.checked = false;
		alert("error")
	} else {
		if (ck.checked == true) {
			window.localStorage.setItem("userid", f.uid.value)
		}
		else {
			window.localStorage.setItem("userid", "")
		}
	}

}