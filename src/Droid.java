public class Droid {
    public String name;
    public int batteryLevel;

    // Constructor to initialize the droid
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    // Method to perform a task
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    // Method to report the current energy level of the droid
    public void energyReport(){
        System.out.println(name + " Energy Level: " + batteryLevel);
    }

    // Introduce the droid with a greeting
    public String toString(){
        return "Hello, I am the droid: " + name;
    }

}
