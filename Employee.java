import java.sql.*;
import java.io.*;
import java.util.*;
class Employee
{
public static void main(String args[]) throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
PreparedStatement pstmt=con.prepareStatement("insert into EMPLOYEE values(?,?,?,?,?)");

Scanner sc=new Scanner(System.in);

System.out.println("Enter first name of the employee ");
String fname=sc.next();
pstmt.setString(1,fname);
System.out.println("Enter Last name of the employee ");
String lname=sc.next();
pstmt.setString(2,lname);

System.out.println("Enter Parents name of the employee ");
String pname=sc.next();
pstmt.setString(3,pname);


System.out.println("Enter age of the employee ");
int age=sc.nextInt();
pstmt.setInt(4,age);

System.out.println("Enter city of the employee ");
String city=sc.next();
pstmt.setString(5,city);
pstmt.executeUpdate();

System.out.println("Details are successfully stored in the database");
con.close();
}
}