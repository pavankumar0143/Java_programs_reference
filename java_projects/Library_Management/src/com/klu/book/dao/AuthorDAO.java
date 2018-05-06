package com.klu.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.klu.book.bean.AuthorBean;
import com.klu.book.util.DBUtil;

public class AuthorDAO {
	
	public AuthorBean getAuthor(int authorCode) {
		PreparedStatement ps=null;
		AuthorBean aB=new AuthorBean();
		Connection con=DBUtil.getDBConnection("bece4309","bece4309");
		if(con==null) {
			aB=null;
		}
		else {
			try {
				ps=con.prepareStatement("select * from author_tbl where author_code=?");
				ps.setInt(1, authorCode);
				ResultSet rs=ps.executeQuery();
				
				aB.setAuthorCode(rs.getInt(1));
				aB.setAuthorName(rs.getString(2));
				aB.setContactNo(rs.getLong(3));
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				aB=null;
			}
		}
		return aB;
	}

	public AuthorBean getAuthor(String authorName) {
		PreparedStatement ps=null;
		AuthorBean aB=new AuthorBean();
		Connection con=DBUtil.getDBConnection("bece4309","bece4309");
		if(con==null) {

		}
		else {
			try {
				ps=con.prepareStatement("select * from author_tbl where author_name=?");
				ps.setString(1, authorName);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
				aB.setAuthorCode(rs.getInt(1));
				aB.setAuthorName(rs.getString(2));
				aB.setContactNo(rs.getLong(3));
				}
				else 
					aB=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				aB=null;
			}
		}
		return aB;
	}
}
