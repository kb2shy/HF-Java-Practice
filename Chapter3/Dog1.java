/**
 * Dog
 */
public class Dog1 {

  String name;
  public static void main(String[] args) {
    Dog1 dog1 = new Dog1();
    dog1.bark();
    dog1.name = "Bart";

    Dog1[] myDogs = new Dog1[3];
    myDogs[0] = new Dog1();
    myDogs[1] = new Dog1();
    myDogs[2] = dog1;

    myDogs[0].name = "Fred";
    myDogs[1].name = "Marge";

    System.out.print("Last dog's name is ");
    System.out.println(myDogs[2].name);

    int x = 0;
    while (x < myDogs.length) {
      myDogs[x].bark();
      x = x + 1;
    }
  }

  public void bark() {
    System.out.println(name + " says Ruff!");
  }

  public void eat() {}
  public void chaseCat() {}
}