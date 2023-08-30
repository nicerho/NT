package java33;

public interface Inter1 {
	public static final String name = "";
	String userid = "hong";
	public void a1();
	default void aa1() { //디폴트 메서드는 오버라이드가 필수가 아니고 필요할때만 가져다쓰기가능
		System.out.println(userid);
	}
}
