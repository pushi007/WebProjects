package com.crossover.ota.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crossover.ota.constants.OTAConstants;

public class ConnectionUtil {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName(OTAConstants.DRIVER_NAME);
		con = DriverManager.getConnection(OTAConstants.URL, OTAConstants.USERNAME, OTAConstants.PASSWORD);
		return con;

	}

	public static void closePreparedStatement(PreparedStatement ps) throws SQLException {
		if (ps != null)
			ps.close();
	}

	public static void closeConnection(Connection con) throws SQLException {

		if (con != null)
			con.close();

	}

}
