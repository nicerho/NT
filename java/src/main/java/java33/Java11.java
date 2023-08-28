package java33;

// extends 
public class Java11 {
	public static void main(String[] args) {

	}
}

class login_ex {
	public void aa() {
		System.out.println("login");
	}
}

class logout_ex extends login_ex {

	@Override
	public void aa() {
		// TODO Auto-generated method stub
		super.aa();
	}

	public void bb() {
		System.out.println("logout");
	}
}

class bt extends logout_ex {
	@Override
	public void aa() {
		// TODO Auto-generated method stub
		super.aa();
	}

	@Override
	public void bb() {
		// TODO Auto-generated method stub
		super.bb();
	}
}
