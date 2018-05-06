package com.klu.car.dao;

import java.sql.*;
import java.util.ArrayList;

import com.klu.car.bean.CarBean;
import com.klu.car.util.DBUtil;

public class CarDAO {
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;int key=0;
	
	public String addCarBean(CarBean carBean) throws SQLException, ClassNotFoundException{
		
		String s="";
		PreparedStatement ps = null;
		
		try{
			con=DBUtil.getDBConn();
			ps=con.prepareStatement(
					"insert into car_tbl values ?,?,?,?,?");
			con.setAutoCommit(false);
			ps.setString(1, carBean.getCarid());
			ps.setString(2, carBean.getName());
			ps.setInt(3, carBean.getPrice());
			ps.setString(4, carBean.getCategory());
			ps.setInt(5, carBean.getAirbagsNo());
			int ret=ps.executeUpdate();
			con.commit();
			if(ret==1){
				s="SUCCESS";
			}
			else
				s="FAIL";
		}
		catch(SQLException e){
			s="FAIL";
		}
		finally{
			con.close();
			ps.close();
		}
		return s;
	}
	public ArrayList<CarBean> setVal(ResultSet rs){
	CarBean cr=new CarBean();
	ArrayList<CarBean> al=new ArrayList<CarBean>();
	try{
	while(rs.next()){
		cr.setCarid(rs.getString(1));
		cr.setName(rs.getString(2));
		cr.setPrice(rs.getInt(3));
		cr.setCategory(rs.getString(4));
		cr.setAirbagsNo(rs.getInt(4));
		al.add(cr);
		}
		return al;
	}
	catch(SQLException e){
		return null;
	}
	}
	
	public ArrayList<CarBean>getByResult(String criteria) throws SQLException{
		
		try{
			 con=DBUtil.getDBConn();
			if(criteria.equalsIgnoreCase("PREMIUM")){
				ps=con.prepareStatement("select * from Car_tbl where price>=600000");
				rs=ps.executeQuery();
				return setVal(rs);
				}
			else if(criteria.equalsIgnoreCase("ordinary")){
				ps=con.prepareStatement("select * from Car_tbl where price<600000");
				rs=ps.executeQuery();
				return setVal(rs);
			}
			else if(criteria.equalsIgnoreCase("all")){
				ps=con.prepareStatement("select * from Car_tbl");
				rs=ps.executeQuery();
				return setVal(rs);
			}
			else 
				return null;
		}
		catch(SQLException | ClassNotFoundException e){
			return null;
		}
		finally {
			con.close();
			ps.close();
			rs.close();
			
		}
	}
	
	public String generateCarId (String name) throws ClassNotFoundException, SQLException{
		
		try{
			con=DBUtil.getDBConn();
			ps = con.prepareStatement("select car_seq.currval from dual");
			rs=ps.executeQuery();
			key=rs.getInt(1);
			
			return name.substring(0,2).toUpperCase()+key;
		}
		catch(SQLException | ClassNotFoundException e){
			return null;
		}
		finally {
			con.close();
			ps.close();
			rs.close();
			
		}
		
	}
	
}
