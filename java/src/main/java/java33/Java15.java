package java33;

//클안클
public class Java15 {
	static mom.child c = new mom.child();

	public static void main(String[] args) {
		c.multiple();
	}

	static class mom {
		int x = 30;
		int y = 50;

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		static class child {
			mom m = new mom();

			public void multiple() {
				int x = m.getX();
				int y = m.getY();
				System.out.println(x * y);
			}
		}
	}
}