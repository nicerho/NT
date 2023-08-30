package java33;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Java17 {
	
	public static void main(String[] args) {
		
		box7 b = new box7();
		try {
			
			b.dbconnect("hong", "1234", "web");
			b.select("hoho");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

class box7 implements SetDB {
	String user = "";
	String password = "";
	String db = "";
	PreparedStatement ps = null;
	Connection con = null;

	public void dbconnect(String user, String password, String db) throws Exception {
		this.user=user;
		this.password=password;
		this.db=db;
		Connection con = SetDB.info(user, password, db);
	}

	public void select(String table,String dataid) {
	
		try {
			Connection con = SetDB.info("hong", "1234", "web");
			String sql = "select * from "+table+" where sid=?";
			this.ps=this.con.prepareStatement(sql);
			this.ps.setString(1,dataid);
			ResultSet rs = ps.executeQuery();	
			
			while (rs.next()) {
				System.out.println(rs.getString("sname"));	
			}
			
			rs.close();
			ps.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void delete(int idx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(String dataid, int idx) {
		// TODO Auto-generated method stub
		
	}
	public void insert() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insert(String[] a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void select(String userid) {
		// TODO Auto-generated method stub
		
	}

}