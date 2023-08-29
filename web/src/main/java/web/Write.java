package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@MultipartConfig(
		fileSizeThreshold = 1024 * 1024 * 1,
		maxFileSize = 1024 * 1024 * 10,
		maxRequestSize = 1024 * 1024 * 100
		)

public class Write extends HttpServlet {
	DbConfig dc = null;
	PreparedStatement ps = null;
	private static final long serialVersionUID = 1L;

	public Write() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String bsubject = request.getParameter("subject").intern();
		String bwriter = request.getParameter("writer").intern();
		String bpassword = request.getParameter("password").intern();
		//String bdir = request.getParameter("file").intern();
		Part bdir = request.getPart("file");
		String bdir2 = bdir.getSubmittedFileName();
		String btext = request.getParameter("text").intern();
		PrintWriter pw = response.getWriter();
		if (bsubject == "" || bwriter == "" || bpassword == "" || btext == "") {
			pw.write("<script>alter('Invalid Information'); history.go(-1);</Script>");
		} else {
			try {
				this.dc = new DbConfig();
				Connection con = this.dc.dbinfo();
				String sql = "insert into board values('0',?,?,password(?),?,?,0,now());";
				this.ps = con.prepareStatement(sql);
				this.ps.setString(1, bsubject);
				this.ps.setString(2, bwriter);
				this.ps.setString(3, bpassword);
				this.ps.setString(4, bdir2);
				this.ps.setString(5, btext);
				int call = this.ps.executeUpdate();
				String msg = "";
				if (call > 0) {
					msg = "Ok";
					this.ps.close();
					con.close();

				} else {
					msg = "SQL Error";
				}
				pw.write("<script>alert('" + msg + "'); location.href='./list.html';</script>");
				pw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
