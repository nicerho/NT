function join() {
	var sid = document.getElementById("sid")
	var name = document.getElementById("sname")
	var pw = document.getElementById("spw")
	var pw2 = document.getElementById("spw2")
	var tel = document.getElementById("shp")
	var email = document.getElementById("smail")


	if (sid.value == "" && name.value == "" && pw.value == "" && pw2.value == "" && tel.value == "" && email.value == "") {
		alert("필수값확인요망")
	} else if (tel.value.lentgh < 10) {
		alert("error tel")
	} else if (isNaN(tel.value) == true) {
		alret("error tel")
	} else if (email.value.indexOf("@") == -1) {
		alert("mail error")
	} else if (pw.value != pw2.value) {
		alert("pw error")
	}
	else {
		f.submit();
	}


}