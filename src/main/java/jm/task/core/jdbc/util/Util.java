package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
  private static final String URL = "jdbc:mysql://localhost:3306/test";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "Rootroot123!";
  static Connection connection = null;
    public static Connection getConnection () {
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

      } catch (ClassNotFoundException | SQLException e) {
          e.printStackTrace();
      }
      return  connection;
  }
  public static void closeConnection () {
      if (connection != null) {
          try {
              connection.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
  }
}
