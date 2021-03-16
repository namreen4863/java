public class Vehicle {
    private String brand;
    private String color;
    public int regNo;
    public static int totalVehicle = 0;
    private int topSpeed;

    public Vehicle() {
        totalVehicle++;
        brand = "null";
        color = "red";
        regNo = totalVehicle;
        System.out.println("I AM DEFAULT CONSTRUCTOR");
        topSpeed = 100;
    }

    public Vehicle(int t, String c, String b) {
        totalVehicle++;
        regNo = totalVehicle;
        System.out.println("I AM PARAMETERISED CONSTRUCTOR");
        topSpeed = t;
        color = c;
        brand = b;
    }

    public void displayCarInfo() {
        System.out.println("BRAND = " + brand);
        System.out.println("TOPSPEED = " + topSpeed);
        System.out.println("COLAR = " + color);
    }
}