import java.util.Date;

import java.sql.*;

public class Access{

    private final String DRIVER_URL = "jdbc:h2:~/h2/test";
    private final String DRIVER_NAME = "org.h2.Driver";

    private final String userName = "sa";
    private final String password = "root";

    public Connection createConnection(){
        //try{
            System.out.println(DRIVER_URL);
            Connection con = DriverManager.getConnection(DRIVER_URL,userName,password);
            System.out.println("con完了");
            return con;
        /*}catch(Exception e){
            System.out.println("DB could not access");
        }
        return null;*/
    }
    public void closeConnection(Connection con){
        try{
            con.close();
        }catch(Exception ex){}
    }
}