// this added import statements
import java.util.*;
import java.io.*;

public class Car
{
  private int fuel;
  private String name;
  private String plate;

  Car(int fuel, String name, String plate)
  {
    this.fuel = fuel;
    this.name = name;
    this.plate = plate;
  }

  public static int ret19()
  {
    return 19;
  }

  public static char retA()
  {
    return 'A';
  }

  public String toString()
  {
    return "Name: " + this.name + " " +
           "Fuel: " + this.fuel + " " +
           "Plate: " + this.plate;
  }

  // This is a random comment
  // This is a main method
  public static void main(String [] argv)
  {
    Car temp = new Car(19, "Honda", "123abc");
    System.out.println(temp);
    System.out.println("End of list" + ret19);
  }
}
