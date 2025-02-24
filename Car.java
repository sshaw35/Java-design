public class Car
{
    //define attributes
    public String make;
    public String model;
    public String color;
    public int year;
    public int curSpeed;
    public int maxSpeed;
    public final int defaultMaxSpeed = 150;
    public int mileage;
    public int curGasAmount;
    public final int defaultGasCapacity = 25;
    public int gasCapacity;
    public final double defaultGasConsumption = 0.02;
    public double gasConsumption;

    //constructor

    public Car() //used to initialize the attributes of your object
    {
        make = "";
        model = "";
        color = "";
        maxSpeed = defaultMaxSpeed;
        curSpeed = 0;
        mileage = 0;
        gasCapacity = defaultGasCapacity;
        curGasAmount = gasCapacity; //car starts with full tank
        gasConsumption = defaultGasConsumption;
    }


    //methods/behaviors
    public void drive(int miles)
    {
        mileage += miles;

    };

     public boolean accelerate(int speedIncrease)
     {
         boolean success = true;

         int newSpeed = speedIncrease + curSpeed;
         if (newSpeed > maxSpeed)
         {
             newSpeed = maxSpeed;

         }
         int actualSpeedIncrease = newSpeed - curSpeed;
         int requiredGas = (int)(actualSpeedIncrease * gasConsumption);
         if(curGasAmount >= requiredGas)
         {
             curGasAmount -= requiredGas;
             curSpeed = newSpeed;
         }

         return success;




         }

    public void brake()
    {
        curSpeed = 0;
    }


     }


