package Inheritance;

	class Animal{
		public void animalSound() {
			System.out.println("The animal makes a sound");
		}
	}
	class Dog extends Animal{
		public void animalSound() {
			super.animalSound();//call the superclass method
			System.out.println("The dog barks!!!");
		}
	}
	public class SuperMethodEx {

	public static void main(String[] args) {
		Dog myDog=new Dog();
	   // Animal myDog = new Dog();
		myDog.animalSound();

	}

}
