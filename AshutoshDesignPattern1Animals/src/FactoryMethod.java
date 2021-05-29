public class FactoryMethod {
	public Animal animalFactory(String animal) {
		Animal ob=null;
		if(animal=="Duck")
			ob=new Duck();
		else if(animal=="Tiger")
			ob=new Tiger();
		return ob;
	}
	public static void main(String[] args) {
		FactoryMethod f=new FactoryMethod();
		Animal duck=f.animalFactory("Duck");
		duck.speak();
		Animal tiger=f.animalFactory("Tiger");
		tiger.speak();
	}

}

