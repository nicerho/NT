function create() {
	var t = CKEDITOR.instances.texts.getData();
	console.log(t)
	
	
	if (f.subject.value == "") {
		alert("제목입력필수")
		return false;
	} else if (f.writer.value == "") {
		alert("글쓴이 입력")
		return false;
	} else if (f.password.value == "") {
		alert("pw 입력")
		return false;
	} else if (t.value == "") {
		alert("글 내용 입력")
	} else {
		f.submit();
	}
}