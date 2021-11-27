import java.sql.*;

public class JDBC_1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
//        oracle.jdbc.oracledriver
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Stu","root","");//Connection is interface
        Statement s= con.createStatement();
        ResultSet rs=s.executeQuery("select * from customer");

        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getInt(2));
        }
        s.close();
        con.close();
    }
}
