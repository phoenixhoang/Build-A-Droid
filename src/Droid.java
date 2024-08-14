public class Droid {
    public String name;
    public int batteryLevel;

    // Constructor to initialize the droid
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    // Method to perform a task, which reduces the battery level by 10
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    // introduce the droid with a greeting
    public String toString(){
        return "Hello, I am the droid: " + name;
    }

}
