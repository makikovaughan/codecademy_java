/*
Build A Droid: Build some robots
*/

/*
Droid class
State:
  name
  battery level

Behavior
  performing a task
  stating its battery level
*/
public class Droid {
    //instance fields
    String name;
    int batteryLevel;

    //constructor
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    //toString method
    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    //performTask() method that does not return any values and takes one parameter.
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    //energyReport() method: Render the instance’s batteryLevel
    public void energyReport() {
        System.out.println("The " + name+ "'s current battery level: " + batteryLevel);
    }

    //energyTransfer method: Exchange the battery level between instances.
    public void energyTransfer(Droid droid1) {
        int batteryLevel1 = droid1.batteryLevel;
        int batteryLevel2 = batteryLevel;
        droid1.batteryLevel = batteryLevel2;
        batteryLevel = batteryLevel1;
    }

    //main method
    public static void main(String[] args) {

        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.performTask("cooking");
        codey.energyReport();

        Droid randy = new Droid("Randy");
        System.out.println(randy);
        randy.performTask("cleaning");
        randy.energyReport();
        randy.energyTransfer(codey);
        randy.energyReport();
    }

}
