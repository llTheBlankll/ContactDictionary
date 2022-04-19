package com.asharia.contactdictionary;

import java.sql.*;

public class Connect {

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String mysql_username = "Nytri";
        String mysql_password = "$Shana143$";
        String mysql_host = "localhost";
        String mysql_database = "contactdictionary";
        Connection con  = DriverManager.getConnection(String.format("jdbc:mysql://%s:%s/%s", mysql_host, 3306, mysql_database), mysql_username, mysql_password);
        return con.isValid(60) ? con : null;
    }
}
