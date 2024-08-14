public class Main {
    public static void main(String[] args) {

        // Create first instance of Droid
        Droid codey = new Droid("Codey");
        System.out.println(codey);

        // Perform a task with the first droid
        codey.performTask("Dancing");
        codey.energyReport();

        // Create another instance of Droid
        Droid misty = new Droid("Misty");
        System.out.println(misty);

        // Perform a task with the second droid
        misty.performTask("Singing");
        misty.energyReport();

        // Transfer energy from Codey to Misty
        codey.energyTransfer(misty, 20);

        // Report energy levels after transfer
        codey.energyReport();
        misty.energyReport();
    }
}