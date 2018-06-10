package org.inetsolv;

import java.io.BufferedReader;
/*
 * IN THIS PROJECT WE WILL SEE HOW TO INSERT DATE INTO DATABASE.....
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateInsertINtoDataBase {

	public static void main(String[] args) {
	
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		  
		    int eno;
		    String employeeName;
		    String dateOfBirth;
		    SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		    /*
		     * HEAR WE ARE REDING THE EMPLOYEE DETAILS FROM KEYBOARD.....
		     */
		    try {
		    System.out.print("ENTER THE EMPLOYEE NO :");
		    eno=Integer.parseInt(br.readLine());

		    System.out.print("ENTER THE EMPLOYEE NAME :");
		    employeeName=br.readLine();

		    System.out.print("ENTER THE EMPLOYEE DATE OF BIRTH IN THIS FORMAT dd/MM/yyyy :");
		    dateOfBirth=br.readLine();
		 
		    /*
		     * HEAR WE ARE MAKINA A CONNECTION WITH OREACLE DATABASE...
		     */
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","venu","reddy1996");
		    PreparedStatement pr=con.prepareStatement("insert into employee values(?,?,?,?)");

		    /*
		     * HEAR WE ARE INSERTING DATA INTO DATABASE...
		     */
		    pr.setInt(1,eno);
		    pr.setString(2,employeeName);

		    java.util.Date doj1=new java.util.Date();
		    long ms1=doj1.getTime();
		    java.sql.Date doj2=new java.sql.Date(ms1);
		    pr.setDate(3,doj2);
	   
		    java.util.Date dob1=dateFormat.parse(dateOfBirth);
		    long ms2=dob1.getTime();
		    java.sql.Date dob2=new java.sql.Date(ms2);
		    pr.setDate(4,dob2);

		    pr.executeUpdate();
		    con.close();

		    System.out.print("RECORD IS INSERTED");
		    }
		    catch(ClassNotFoundException classNotFoundException) {
		    	classNotFoundException.printStackTrace();
		    }
		    catch(SQLException sqlException) {
		    	sqlException.printStackTrace();
		    }
		    catch(IOException ioException) {
		    	ioException.printStackTrace();
		    }
		    catch(ParseException parseException) {
		    	parseException.printStackTrace();
		    }
	}

}
/*
 * OUTPUT
 * 
 ENO ENAME           DOJ       DOB
---- --------------- --------- ---------
   1 venu            04-JUN-18 02-JUN-95
 */
	
