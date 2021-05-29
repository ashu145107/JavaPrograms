public class SyncExMain {
	public static void main(String[] args) {
		PrinterThread p=new PrinterThread();
		StringPrinter s1=new StringPrinter(p,"Hello..","There");
		StringPrinter s2=new StringPrinter(p,"How","are you");
		StringPrinter s3=new StringPrinter(p,"Thank you","very much");
		s1.start();
		s2.start();
		s3.start();
	}

}
