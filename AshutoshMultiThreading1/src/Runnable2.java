public class Runnable2 {
	public static void main(String[] args) {
		RunnableMain r=new RunnableMain();
		Thread t=new Thread(r);
		t.start();
	}
}
