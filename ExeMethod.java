package car;

import java.util.Scanner;
public class ExeMethod {
	Scanner scanner=new Scanner(System.in);

	public  void exeMethod()
	{
		
		CarMethods cm=new CarMethods();
		System.out.println("Select any option below");
		System.out.println("1.Add Car/Cars");
		System.out.println("2.Cars in ShowRoom");
		System.out.println("3.remove a car/cars");
		System.out.println("4.Search a Car");
		System.out.println("5.Exit");
		try {
		int input=scanner.nextInt();
		switch(input)
		{
		case 1:
		cm.AddCar();
		break;
		case 2:
			cm.Select();
				break;
		case 3:
			cm.removeCar();
			break;
		case 4:
		  cm.search();
			break;
		case 5:
			break;
	}
	}
	catch(Exception e)
	{
	System.out.println("choose the right option");

	}
	}
	protected  void contine() {
		try
		{
		System.out.println("");
		System.out.println("Do you want to continue :");
		System.out.println("1.Yes");
		System.out.println("2.No");
		int option=scanner.nextInt();
		switch(option)
		{
		case 1:
			exeMethod();
			break;
		case 2:
			break;
		}}
		catch(Exception e)
		{
			System.out.println("You Are A FOOL Doesn't know what to type");
		}
	}

}
