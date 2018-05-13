/*
 * Created on Jan 22, 2018
 */
package Lab9.facade;


public interface IConnection {

    public void execute(String sql, String sqlCall);

    public void executeSql(String sql);

    public void executeCall(String sql);

}
