import java.sql.*;
import java.util.*;

public class crud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sql = "";
        Connection con = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:704/rkmvcc","root","system32");
            stmt = con.createStatement();
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
        System.out.println("CRUD Operations:");
        System.out.print("1. Create  2. Retrive  3. Update  4. Delete\n> ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Roll No: ");
                int rollNo = sc.nextInt();
                sql = "INSERT INTO student VALUES (" + id + ",'" + name + "'," + rollNo + ")";
                break;
            case 2:
                sql = "SELECT * FROM student";
                break;
            case 3:
                System.out.print("Enter ID:");
                id = sc.nextInt();
                System.out.print("Enter Name: ");
                sc.nextLine();
                name = sc.nextLine();
                System.out.print("Enter Roll No: ");
                rollNo = sc.nextInt();
                sql = "UPDATE student SET NAME = '" + name + "', ROLL = " + rollNo + " WHERE ID = " + id;
                break;
            case 4:
                System.out.print("Enter ID:");
                id = sc.nextInt();
                sql = "DELETE FROM student WHERE ID = " + id;
                break;
            default:
                System.out.println("Invalid choice");
        }
        try{
            switch (choice){
                case 1:
                case 3:
                case 4:
                    stmt.executeUpdate(sql);
                    break;
                case 2:
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next())
                        System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
                    break;
            }
            con.close();
        }
        catch (Exception ex)
        {
            System.out.println("Error: "+ex);
        }
    }
}