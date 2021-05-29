public class Main {
	public static void main(String[] args) {
		MTEx m=new MTEx();
		m.run();
		System.out.println(m.getName());
		System.out.println(m.getPriority());
		m.setPriority(1);
		m.setName("thread1");
		System.out.println(m.getName());
		System.out.println(m.getPriority());
		
	}

}
