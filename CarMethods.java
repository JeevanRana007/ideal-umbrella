package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CarMethods {
	private String carNumber;
	private int num;
	private String carBrand;
	private String carColour;
	
	Scanner scanner=new Scanner(System.in);
	
protected  void AddCar()
	{
	//Scanner scanner=new Scanner(System.in);
	String url="jdbc:mysql://localhost:3306?user=root&password=7860";
	String query="insert into jazz.car values";
	try {
		Connection connection=DriverManager.getConnection(url);
		Statement statement=connection.createStatement();
		System.out.println("Enter the number of cars you like to add :");
		num=scanner.nextInt();
		if(num==0)
		{
			System.out.println("You are not adding any Car ");
		}
		else {
		for(int i=1;i<=num;i++)
		{
			scanner.nextLine();
			System.out.println("Enter the carNumber :");
			carNumber=scanner.nextLine();
			System.out.println("Enter the carBrand :");
			carBrand=scanner.nextLine();
			System.out.println("Enter the carColour :");
			carColour=scanner.next();
			String query1=query+"('"+carNumber+"','"+carBrand+"','"+carColour+"')";
		statement.executeUpdate(query1);
		}
		System.out.println("Car/Cars"
				+ " Added to list");}
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}

		protected  void removeCar()
		{
		Scanner scanner=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306?user=root&password=7860";
		
			
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
				removeCar();
			}}

			protected  void Select()
			{
				String url1="jdbc:mysql://localhost:3306?user=root&password=7860";
				String query2="select * from jazz.car";
				try {
					Connection connection1=DriverManager.getConnection(url1);
					Statement statement=connection1.createStatement();
					ResultSet numcars=statement.executeQuery(query2);
					//ResultSet count=statement.executeQuery(query3);
					System.out.println("Select any option below");
					System.out.println("1.Display All Cars");
					System.out.println("2.Display even positioned Cars");
					System.out.println("3.Display odd positioned Cars");
					int in=scanner.nextInt();
					switch(in)
					{
					case 1:
					{
						System.out.println("CarNumber  CarBrand  CarColour");
						while(numcars.next())
						{
							carNumber=numcars.getString("carNumber");
							carBrand=numcars.getString("carbrand");
							carColour=numcars.getString("carcolour");
							System.out.println(carNumber+"  "+carBrand+"  "+carColour);
						}
					}
					break;
					case 2:
					{
						System.out.println("CarNumber  CarBrand  CarColour");
						while(numcars.next())
						{
							numcars.next();
							carNumber=numcars.getString("carNumber");
							carNumber=numcars.getString("carbrand");
							carColour=numcars.getString("carcolour");
							System.out.println(carNumber+"  "+carBrand+"  "+carColour);
						}
					}
					break;
					case 3:
					{
						System.out.println("CarNumber  CarBrand  CarColour");
						while(numcars.next())
						{
							
							carNumber=numcars.getString("carNumber");
							carBrand=numcars.getString("carbrand");
							carColour=numcars.getString("carcolour");
							System.out.println(carNumber+"  "+carBrand+"  "+carColour);
							numcars.next();
						}
					}
						break;
					}
					connection1.close();
				}
				
					catch (SQLException e) {
					ExeMethod ex= new ExeMethod();
					ex.contine();
					Select();
					}
			}
			protected void search()
			{
				String url="jdbc:mysql://localhost:3306?user=root&password=7860";
				String query="select * from jazz.car where carBrand=";
				Connection connection;
				try {
					connection = DriverManager.getConnection(url);
					Statement statement=connection.createStatement();
					System.out.println("Enter the name of Car you want to search :");
					String carBrand=scanner.nextLine();
					String query1=query+"'"+carBrand+"'";
					ResultSet car=statement.executeQuery(query1);
					car.next();
					 carNumber=car.getString("carNumber");
		        	String carBrand1=car.getString("carBrand");
					carColour=car.getString("carColour");
					System.out.println(carNumber+" "+carBrand1+" "+carColour);
				} catch (SQLException e) {
					System.out.println("car not found");
					
				}
				finally
				{
					ExeMethod ex= new ExeMethod();
					ex.contine();
					ex.exeMethod();
					ex.contine();
				}
}}

