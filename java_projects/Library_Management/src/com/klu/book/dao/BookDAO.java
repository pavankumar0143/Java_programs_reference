package com.klu.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.klu.book.bean.BookBean;
import com.klu.book.util.DBUtil;

public class BookDAO {
	public BookBean fetchBook(String isbn) {
		PreparedStatement ps=null;
		BookBean bB=new BookBean();
		AuthorDAO A_Dao=new AuthorDAO();
		Connection con=DBUtil.getDBConnection("bece4309","bece4309");
		if(con==null) {
			bB=null;
		}
		else {
			try {
				ps=con.prepareStatement("select * from book_tbl where isbn=?");
				ps.setString(1, isbn);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
				bB.setIsbn(rs.getString(1));
				bB.setBookName(rs.getString(2));
				bB.setBookType(rs.getString(3).charAt(0));
				bB.setAuthor(A_Dao.getAuthor(rs.getInt(4)));
				bB.setCost(rs.getFloat(5));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				bB=null;
			}
		}
		return bB;
	}
	
	public int createBook(BookBean bookBean) {
		PreparedStatement ps=null;
		int ret=0;
		Connection con=DBUtil.getDBConnection("bece4309","bece4309");
		if(con==null) {
			ret=0;
		}
		else {
			try {
				ps=con.prepareStatement("select * from book_tbl where isbn=?");
				ps.setString(1,bookBean.getIsbn());
				ps.setString(2,bookBean.getBookName());
				ps.setString(3, String.valueOf(bookBean.getBookType()));
				ps.setInt(4,bookBean.getAuthor().getAuthorCode());
				ps.setFloat(5, bookBean.getCost());
				ret=ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				ret=0;
			}
		}
		return ret;
	}
}
