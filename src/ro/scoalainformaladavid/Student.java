package ro.scoalainformaladavid;

public class Student extends Person {
  private int yearOfStudy;

  public Student(String name, int age, int yearOfStudy) {
    super(name, age);
    this.yearOfStudy = yearOfStudy;
  }

  public int getYearOfStudy() {
    return yearOfStudy;
  }

  @Override
  public String toString() {
    return "Student{"
        + "name='"
        + getName()
        + '\''
        + ", age="
        + getAge()
        + ", yearOfStudy="
        + yearOfStudy
        + '}';
  }
}
