import java.sql.*;
import java.io.*;

public class test {
   public static void main(String[] args){
    String DRIVER_URL = "jdbc:h2:~/h2/test";
    String DRIVER_NAME = "org.h2.Driver";

    String userName = "sa";
    String password = "root";

    try{
        Class.forName(DRIVER_NAME);
    }catch(Exception e){
        System.out.println("classforNameのエラー");
    }
try (Connection connection = DriverManager.getConnection(DRIVER_URL, userName, password);
    PreparedStatement ps = connection.prepareStatement("SELECT * FROM HUMAN_INF")) {
try (ResultSet rs = ps.executeQuery()) {
    while (rs.next()) {
        System.out.println(rs.getString("NAME"));
    }
} catch (Exception e) {
    e.printStackTrace();
}
} catch (Exception e) {
e.printStackTrace();
}

   } 
}