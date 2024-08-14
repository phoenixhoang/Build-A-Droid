public class Droid {
    public String name;
    public int batteryLevel;

    // Constructor to initialize the droid
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    // introduce the droid with a greeting
    public String toString(){
        return "Hello, I am the droid: " + name;
    }

}
