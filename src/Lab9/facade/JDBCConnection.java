/*
 * Created on Jan 22, 2018
 */
package Lab9.facade;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection implements IConnection {

    @Override
    public void execute(String sql, String sqlcall) {
        Connection conn = null;
        PreparedStatement prep = null;
        CallableStatement call = null;
        ResultSet rset = null;
        try {
            Class.forName("<driver>").newInstance();
            conn = DriverManager.getConnection("<database>");
            prep = conn.prepareStatement(sql);
            prep.setString(1, "<column value>");
            rset = prep.executeQuery();
            if (rset.next()) {
                System.out.println(rset.getString("<column name"));
            }
            call = conn.prepareCall(sqlcall);
            call.setInt(1, 1972);
            call.registerOutParameter(2, java.sql.Types.INTEGER);
            call.execute();
            System.out.println(call.getInt(2));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            if (rset != null) {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (prep != null) {
                try {
                    prep.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (call != null) {
                try {
                    call.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    @Override
    public void executeSql(String sql) {
        // TODO Auto-generated method stub

    }

    @Override
    public void executeCall(String sql) {
        // TODO Auto-generated method stub

    }
}
