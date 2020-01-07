package car;
public class CarProject {
	
	public static void main(String[] args) {
		try
		{
			ExeMethod ex=new ExeMethod();
		ex.exeMethod();
		}
		catch(Exception e)
		{
			ExeMethod ex=new ExeMethod();
			ex.contine();
		}
		finally
		{
		
				ExeMethod ex=new ExeMethod();
				ex.contine();
				ex.exeMethod();
		}
	}}