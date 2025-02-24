public class die {
    private int value;
    private int totalRolled;
    private int rollCount;

    // Constructor
    public die() {
        value = 0;
        totalRolled = 0;
        rollCount = 0;
    }


    public int roll() {
        value = (int)(6 * Math.random()) + 1;
        totalRolled += value;
        rollCount++;
        return value;
    }


    public int getTotal() {
        return totalRolled;
    }


    public double getAverage()
    {
        return (double) totalRolled / rollCount;
    }


    public void reset() {
        totalRolled = 0;
        rollCount = 0;
    }
}


