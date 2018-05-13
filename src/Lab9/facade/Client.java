/*
 * Created on Jan 22, 2018
 */
package Lab9.facade;


public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String sql = "SELECT * FROM <table> WHERE <column name> = ?";
        String sqlCall = "{call <stored procedure>( ?, ? )}";
        IConnection connection = new JDBCConnection();
        connection.execute(sql, sqlCall);

    }

}
