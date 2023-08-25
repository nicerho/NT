package java33;

public class Work2 {
	public static void main(String[] args) {
		new hw2().abc();
	}
}

class hw2 {
	void abc() {
		for(int x=7;x<10;x++) {
			for(int y=1;y<6;y++) {
				System.out.println(x+"*"+y+"="+(x*y));
			}
		}
	}
}
