package ro.scoalainformaladavid;

public class Unemployed extends Person {
  public Unemployed(String name, int age) {
    super(name, age);
  }

  @Override
  public String toString() {
    return "Unemployed{" + "name='" + getName() + '\'' + ", age=" + getAge() + '}';
  }
}
