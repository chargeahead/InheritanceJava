
public class Fish extends Animal{
  public int fins;
  public Fish(String color, double weight, int fins) {
	  super(color,weight);
	  this.fins = fins;
  }
  public void swim() {
	  System.out.println("I am swimming");
  }
  @Override
  public void speak() {
	  System.out.println("This is my own fish specfic speak method. My color is "+color+" my weight is "+weight);
  }
}
