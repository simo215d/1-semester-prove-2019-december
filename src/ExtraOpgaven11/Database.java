package ExtraOpgaven11;

import java.sql.*;

public class Database {
    private Database(){}
    private static final Database theDatabase = new Database();
    public static Database getDBFacade() {
        return theDatabase;
    }

    public int guess(String answer, int index) throws SQLException {
        System.out.println("im the database and im guessing with string: "+answer.toLowerCase());
        int result = -1;
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/Quiz?serverTimezone=UTC",
                "root", "qtj38gve");
        String sqlQuery = "select correctIndex from fruitquiz where correctIndex ="+index+";";
        System.out.println("the query: "+sqlQuery);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        while (rs.next()){
            result=rs.getInt("correctIndex");
        }
        System.out.println("we fonud correct index: "+result);
        connection.close();
        return result;
    }
}
