package ro.scoalainformaladavid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    TreeSet<Person> treeSetByName = new TreeSet<>(new NameComparator());
    TreeSet<Person> treeSetByAge = new TreeSet<>(new AgeComparator());
    HashMap<Person, List<Hobby>> hobbiesMap = new HashMap<>();
    Person p1 = new Student("Peter", 20, 2);
    Person p2 = new Hired("Paul", 26, 5799.99);
    Person p3 = new Unemployed("John", 45);

    treeSetByName.add(p1);
    treeSetByName.add(p2);
    treeSetByName.add(p3);

    treeSetByAge.add(p1);
    treeSetByAge.add(p2);
    treeSetByAge.add(p3);

    for (Person p : treeSetByName) {
      System.out.println(p);
    }

    System.out.println("================");

    for (Person p : treeSetByAge) {
      System.out.println(p);
    }

    System.out.println("================");

    List<Address> cyclingAddresses = new ArrayList<>();
    Address cyclingAddress1 = new Address("Strada Splaiului 33", "Brasov", "Romania");
    Address cyclingAddress2 = new Address("Strada Vladimirescu 25", "Oradea", "Romania");
    Address cyclingAddress3 = new Address("Main Street 25", "London", "United Kingdom");
    cyclingAddresses.add(cyclingAddress1);
    cyclingAddresses.add(cyclingAddress2);
    cyclingAddresses.add(cyclingAddress3);

    Hobby cycling = new Hobby("Cycling", 2, cyclingAddresses);

    List<Address> swimmingAddresses = new ArrayList<>();
    Address swimmingAddress1 = new Address("Rue Victor Hugo 12", "Paris", "France");
    Address swimmingAddress2 = new Address("Strada Lalelelor 15", "Bucuresti", "Romania");
    Address swimmingAddress3 = new Address("Main Street 40", "London", "United Kingdom");
    swimmingAddresses.add(swimmingAddress1);
    swimmingAddresses.add(swimmingAddress2);
    swimmingAddresses.add(swimmingAddress3);

    Hobby swimming = new Hobby("Swimming", 3, swimmingAddresses);

    List<Address> basketBallAddresses = new ArrayList<>();

    Address basketBallAddress1 = new Address("Basket Ball Street 25", "Barcelona", "Spania");
    Address basketBallAddress2 = new Address("Main Street 50", "London", "United Kingdom");
    Address basketballAddress3 = new Address("Strada Stadionului 14", "Timisoara", "Romania");
    basketBallAddresses.add(basketBallAddress1);
    basketBallAddresses.add(basketBallAddress2);
    basketBallAddresses.add(basketballAddress3);

    Hobby basketBall = new Hobby("Basketball", 4, basketBallAddresses);

    List<Hobby> peterHobbies = new ArrayList<>();
    peterHobbies.add(cycling);

    List<Hobby> paulHobbies = new ArrayList<>();
    paulHobbies.add(swimming);

    List<Hobby> johnHobbies = new ArrayList<>();
    johnHobbies.add(basketBall);

    hobbiesMap.put(p1, peterHobbies);
    hobbiesMap.put(p2, paulHobbies);
    hobbiesMap.put(p3, johnHobbies);

    System.out.println(p1.getName() + " " + hobbiesMap.get(p1));
  }
}
