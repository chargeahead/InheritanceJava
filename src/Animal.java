
public class Animal {
  public String color;
  public double weight;
  public Animal(String color, double weight) {
	  this.color = color;
	  this.weight = weight;
  }
  public void speak() {
	  System.out.println("My color is "+color+" my weight is "+weight);
  }
}
