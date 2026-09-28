package ro.scoalainformaladavid;

public class Hired extends Person {
  private double salary;

  public Hired(String name, int age, double salary) {
    super(name, age);
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return "Hired{"
        + "name='"
        + getName()
        + '\''
        + ", age="
        + getAge()
        + ", salary="
        + salary
        + '}';
  }
}
