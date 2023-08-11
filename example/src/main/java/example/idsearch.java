package example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class idsearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public idsearch() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username").intern();
		String mail = request.getParameter("useremail").intern();
		System.out.println(name+""+mail);
		
		
	}

}
