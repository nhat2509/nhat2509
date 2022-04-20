package BuildClass;
import java.util.Scanner;
public class OfflineStudent extends Student{
  public String vehicles;
  public void addVehicles(){
    System.out.println("Vehicles");
    Scanner sc = 
    vehicles = sc.nextLine();
  } 
  public void displayVehicles(){
    System.out.println("Vehicles: " + vehicles);
  } 
  public void placeToStudy(){
    System.out.println("Study in the classroom");
  }
}
