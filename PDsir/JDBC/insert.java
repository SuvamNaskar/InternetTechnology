import java.sql.*;
public class insert {
    public static void main(String[] args){
        String sql = "INSERT INTO student VALUES(";
        sql += args[0] + ",'";
        sql += args[1] + "',";
        sql += args[2] + ")";
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