package com.frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class Dao <O,I>{
	public void close(PreparedStatement st) throws SQLException {
		if(st!=null)
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
	}
	public void close(ResultSet rs) throws SQLException {
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
	}
	public abstract void insert(O o, Connection conn) throws Exception;
	public abstract void delete(I i, Connection conn) throws Exception;
	public abstract void update(O o, Connection conn) throws Exception;
	public abstract O select(I i, Connection conn) throws Exception;
	public abstract ArrayList <O> select(Connection conn) throws Exception;

	
}
