package com.javaex.jdbc.oracle;

import java.sql.*;

public class HREmpList {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBconfig.getConnection();
			
			String sql = "SELECT first_name || ' ' || last_name as employee_name," 
						+ " first_name as manager_name"
						+ " FROM employees emp, employees man"
						+ " WHERE emp.manager_id = man.employee_id"
			
			
		}

	}

}
