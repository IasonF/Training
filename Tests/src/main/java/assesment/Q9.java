package assesment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q9 {
    public void stmt(Connection conn, int a) throws SQLException {
        Statement stmt = conn.createStatement(a, ResultSet.CONCUR_READ_ONLY);
        Statement stmt2 = conn.createStatement(a, ResultSet.CONCUR_UPDATABLE);
        Statement stmt3 = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, a);
        Statement stmt4 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, a);
        Statement stmt5 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, a);
    }
}
