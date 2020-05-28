import java.sql.*;

public class main extends Access{

    private void outputSQL(){
        Connection con = null;
        con = createConnection();
        
        String query = "SELECT * FROM HUMAN_INF";
        try{
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getString("ID"));
            }
            stmt.close();
            con = null;
        }catch(SQLException e){
            System.out.println("DB not found");
        }
       
    }
    public static void main(String[] args){
        main a = new main();
        a.outputSQL();
    }
        
}