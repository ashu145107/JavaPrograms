interface Animal{
	void speak();
}
class Tiger implements Animal{
	private static String name="Tiger";
	public void speak() {
		System.out.println(name+" says Halum-Halum");
	}
}
class Duck implements Animal{
	private static String name="Duck";
	public void speak() {
		System.out.println(name+" says Pack-pack");
	}
}
