public class StringPrinter extends Thread{
	PrinterThread p;
	String s1;
	String s2;
	StringPrinter(PrinterThread p,String s1,String s2)
	{
		this.p=p;
		this.s1=s1;
		this.s2=s2;
		
	}
	@Override
	public void run()
	{
		p.display(s1,s2);
	}

}
