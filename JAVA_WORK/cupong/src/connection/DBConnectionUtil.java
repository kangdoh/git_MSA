package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static connection.ConnectionConst.*;

public class DBConnectionUtil {
    //커넥션을 여기서 생성해두고 전달
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
