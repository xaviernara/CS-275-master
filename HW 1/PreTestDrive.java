/*
   This program tests the public interface of the Car class.

   When you run this program using your Car class, the only
   output you should get is the message "Your Car class passed
   all of these tests."
*/

public class PreTestDrive
{
   public static void main( String[] args )
   {
      Car car1 = new Car(25.5);

      double fuelEfficiency = car1.getFuelEfficiency();
      double fuelLevel = car1.getFuelLevel();
      double odometer = car1.getOdometer();

      if(fuelLevel!=0.0 || fuelEfficiency!=25.5 ||  odometer!=0.0)
      {       
         System.out.println("1. There is a problem with your constructor.");
         System.exit(0);
      }

      double newFuelLevel = car1.addFuel(12.5);

      fuelEfficiency = car1.getFuelEfficiency();
      fuelLevel = car1.getFuelLevel();
      odometer = car1.getOdometer();

      if(newFuelLevel!=12.5 || fuelLevel!=12.5 || fuelEfficiency!=25.5 || odometer!=0.0)
      { 
         System.out.println("this is the first if statement that checks addFuel");
         System.out.println(fuelLevel);
         System.out.println(fuelEfficiency);
         System.out.println(odometer);
         System.out.println("this is the new fuel level " +newFuelLevel);
         
         System.out.println("2. There is a problem with your addFuel method.");
         System.out.println("----------------------------------------------------------");
         System.exit(0);
      }

      double distance = car1.drive(76.5);

      fuelEfficiency = car1.getFuelEfficiency();
      fuelLevel = car1.getFuelLevel();
      odometer = car1.getOdometer();

      if(distance!=76.5 || fuelLevel!=9.5 || fuelEfficiency!=25.5 || odometer!=76.5)
      {
        System.out.println("this is the 3rd if statement that checks drive");
         System.out.println(distance);
         System.out.println(fuelLevel);
         System.out.println(fuelEfficiency);
         System.out.println(odometer);
          
         System.out.println("3. There is a problem with your drive method.");
         System.exit(0);
      }

      distance = car1.drive(1000);

      fuelEfficiency = car1.getFuelEfficiency();
      fuelLevel = car1.getFuelLevel();
      odometer = car1.getOdometer();

      if(distance!=242.25 || fuelLevel!=0.0 || fuelEfficiency!=25.5 || odometer!=318.75)
      {
        System.out.println("This the 4th if statement for the drive method");
        System.out.println(distance);
        System.out.println(fuelLevel);
        System.out.println(fuelEfficiency);
        System.out.println(odometer);
         System.out.println("4. There is a problem with your drive method.");
         System.exit(0);
      }

      distance = car1.drive(1);

      fuelEfficiency = car1.getFuelEfficiency();
      fuelLevel = car1.getFuelLevel();
      odometer = car1.getOdometer();

      if(distance!=0.0 || fuelLevel!=0.0 || fuelEfficiency!=25.5 || odometer!=318.75)
      {
        System.out.println("This the 5th if statement for the drive method");
        System.out.println(distance);
        System.out.println(fuelLevel);
        System.out.println(fuelEfficiency);
        System.out.println(odometer);
         System.out.println("5. There is a problem with your drive method.");
         System.exit(0);
      }

      System.out.println("Your Car class passed all of these tests.");
   }//main
}//PreTestDrive