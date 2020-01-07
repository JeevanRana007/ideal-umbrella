package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Rem {
	public static void main(String[] args)
	{
		remove();
		
	}
		public static void remove()
		{
		Scanner scanner=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306?user=root&password=7860";
		{
			
			Connection connection;
			try {
				connection = DriverManager.getConnection(url);
				Statement statement=connection.createStatement();
				System.out.println("Enter the name of Car you want to delete");
				String carBrand=scanner.nextLine();
				String query="delete from jazz.car where carBrand="+"'"+carBrand+"'";
				String query2="select * from jazz.car where carBrand="+"'"+carBrand+"'";
				ResultSet result= statement.executeQuery(query2);
				result.next();
				String sc=result.getString("carColour");
				if(sc!=null) {
				statement.executeUpdate(query);
				System.out.println(carBrand+" is deleted from the list");}
			} catch (SQLException e) {
				ExeMethod ex= new ExeMethod();
				System.out.println("car not found");
				ex.contine();
				remove();
			}}}}


