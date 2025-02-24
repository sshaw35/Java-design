import java.security.Provider;
import java.util.Scanner;

public class CarSimulationApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ServiceStation serviceStation = new ServiceStation();
        Car car = null;
        int option = 0;

        System.out.println("Welcome to car simulation application!");
        while (option != 4)
        {
            System.out.println("1. Create a new car.");
            System.out.println("2. Test drive the car.");
            System.out.println("3. Service the car.");
            System.out.println("4. Quit.");

            option = scanner.nextInt();

            if (option == 1)
            {
                //create a car
                System.out.println("Please enter the make, model, color," +
                        "maxSpeed, gasCapacity of a car, separated by spaces.");
                car = new Car();
                car.make = scanner.next();
                car.model = scanner.next();
                car.color = scanner.next();
                car.maxSpeed = scanner.nextInt();
                car.gasCapacity = scanner.nextInt();

                System.out.println("Your " + car.color + " " +
                        car.make + " " + car.model + " was created!!!!" );
            }
            else if (option == 2)
            {
                //test drive the car
                int choice = 0;
                while (choice != 4)
                {
                    System.out.println("1. Drive at current speed.");
                    System.out.println("2. Accelerate.");
                    System.out.println("3. Brake. ");
                    System.out.println("4. Return to main menu");
                    choice = scanner.nextInt();

                    if (choice == 1)
                    {
                        //drive at current speed
                        int miles = 0;
                        System.out.println("How many miles?");
                        miles = scanner.nextInt();

                        car.drive(miles);

                        System.out.println("The new mileage of the car" +
                                " is:" + car.mileage);

                    }
                    else if (choice == 2)
                    {
                        //accelerate
                        int speedIncrease = 0;
                        System.out.println("How much to increase speed.");
                        speedIncrease = scanner.nextInt();

                        car.accelerate(speedIncrease);

                        System.out.println("The new speed of the car is: "
                        + car.curSpeed);
                    }
                    else if (choice == 3)
                    {
                        //brake
                        car.brake();
                    }
                }
            }
            else if (option == 3)
            {
                serviceStation.carToService = car;
                if(serviceStation.checkGas())
                {
                    System.out.println("Car needs gas, filling tank.");
                    serviceStation.fillGas();
                }
                else
                    System.out.println("Tank is already full!!!");
            }
        }
        System.out.println("Thank you for using this car simulation," +
                " Have a nice day!!!!!!!!");



    }
}
