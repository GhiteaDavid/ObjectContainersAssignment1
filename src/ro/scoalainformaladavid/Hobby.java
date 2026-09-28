package ro.scoalainformaladavid;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
  private String name;
  private int frequency;
  private List<Address> listOfAddresses = new ArrayList<Address>();

  public Hobby(String name, int frequency, List<Address> listOfAddresses) {
    this.name = name;
    this.frequency = frequency;
    this.listOfAddresses = listOfAddresses;
  }

  public String getName() {
    return name;
  }

  public int getFrequency() {
    return frequency;
  }

  @Override
  public String toString() {
    return name + ", listOfAddresses=" + listOfAddresses;
  }
}
