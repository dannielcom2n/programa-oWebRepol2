package br.senai.sc.TI20141n1daniel.bi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Dao {
	private java.sql.Connection conn;

	public Connection getConnection() {
		if (conn == null) {
			try {
				conn = DriverManager
						.getConnection("jbc;mysql://localhost/bi_db","root" ,"root");
				System.out.println("conectou");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return conn;
	}

}
