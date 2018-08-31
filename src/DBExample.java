import java.sql.*;

/**
 * Created by merin on 8/2/18.
 */
public class DBExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

    Class.forName("com.mysql.jdbc.Driver");
    Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeedb","root","root");
        CallableStatement cs=connection.prepareCall("" +"{call getEmployee(?,?,?)}");
        cs.setInt(1,1000);
        cs.setString(2,"merin");

        cs.execute();
        ResultSet rs1=cs.getResultSet();
        while (rs1.next ()){
            System.out.println(rs1.getInt("empsal")+" "+rs1.getString("name"));
        }
        }
}
