import java.util.Scanner;

public class TravelDetails 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the starting city: ");
        String fromCity = sc.nextLine();
        
        System.out.print("Enter the via city: ");
        String viaCity = sc.nextLine();
        
        System.out.print("Enter the destination city: ");
        String toCity = sc.nextLine();
        
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = sc.nextDouble();
        
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();
        
        System.out.print("Enter the total time taken for the journey in hours: ");
        double timeTaken = sc.nextDouble();
        
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;
        
        System.out.println("Travel Details:");
        System.out.println("Name: " + name);
        System.out.println("Journey: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Time Taken: " + timeTaken + " hours");
        System.out.println("Average Speed: " + averageSpeed + " miles per hour");
        
    }
}

