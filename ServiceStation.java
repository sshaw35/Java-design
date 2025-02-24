import java.security.Provider;

public class ServiceStation
{
    public Car carToService;

    public ServiceStation()
    {
        carToService = null;

    }

    public boolean checkGas()
    {
        boolean needsGas = false;
        if (carToService.curGasAmount <
            carToService.gasCapacity)
        {
           needsGas =  true;
        }
        return needsGas;
    }

    public void fillGas()
    {
        //fill the full tank
        carToService.curGasAmount = carToService.gasCapacity;
    }

}

