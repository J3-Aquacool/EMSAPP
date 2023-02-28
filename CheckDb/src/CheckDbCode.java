import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckDbCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
	  		System.out.println("1");
	  		
	    Connection    c= DriverManager.getConnection("jdbc:mysql://localhost:3306/emsapp","root","admin");
	    System.out.println("2");
  		
	       if(c!=null)
	      {
	    	  
	    	  System.out.println("Connected Succesfully");
	      }
	      
	      } catch (ClassNotFoundException ce)
	      {
	      throw new RuntimeException("Driver Problem", ce);
	      }
	      catch (SQLException se ) {
	    	  
	    	  throw new RuntimeException("Error connecting to the database", se);
	      
	      }
	    

	}

}
