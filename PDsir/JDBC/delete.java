import java.sql.*;
public class delete {
    public static void main(String[] args){
        String sql = "DELETE FROM student WHERE id = ";
        sql += args[0];
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:704/rkmvcc","root","system32");
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.execute();
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}