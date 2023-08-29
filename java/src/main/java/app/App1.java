package app;
//자바테스트 패키지 java9연계
public class App1 extends app1_box{
	public static void main(String[] args) {
	new App1().abc();
		
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		super.abc();
	}
}
class app1_box{
	String test = "";
	public void abc() {
		if (test instanceof String) {
			String new_name = (String) test;
			System.out.println(new_name);
		}
		//접근제한자 public(공개) default(해당 파일에서 활용하는 변수선언) protected(동 패키지) private(동 클래스)
		
	}
}