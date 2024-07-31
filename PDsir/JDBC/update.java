import java.sql.*;
public class update{
    public static void main(String[] args){
        String sql = "UPDATE student SET ROLL = ";
        sql += args[0]+" WHERE ID = "+args[1]+"";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:704/rkmvcc","root","system32");
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}