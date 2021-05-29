
public class PrinterThread {
	synchronized void display(String s1,String s2)
	{
		System.out.println(s1+" "+s2);

		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

	}
}



