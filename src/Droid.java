public class Droid {
    public String name;
    public int batteryLevel;

    // Constructor to initialize the droid with a name and full battery
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    // toString method to represent the droid with a greeting
    public String toString(){
        return "Hello, I am the droid: " + name;
    }

    // Method to perform a task, which reduces the battery level by 10
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    // Method to report the current energy level of the droid
    public void energyReport(){
        System.out.println(name + " Energy Level: " + batteryLevel);
    }

    // Method to transfer energy between two droids
    public void energyTransfer(Droid otherDroid, int amount) {
        // Ensure there's enough energy to transfer
        if (batteryLevel >= amount && amount > 0) {
            batteryLevel -= amount;
            otherDroid.batteryLevel += amount;
            System.out.println(name + " transferred " + amount + " energy to " + otherDroid.name);
        } else {
            System.out.println("Transfer failed. Not enough energy or invalid amount.");
        }
    }
}