class TestVehicle {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.displayCarInfo();

        Vehicle ferrari = new Vehicle(300, "RED", "FERRARI");
        ferrari.displayCarInfo();

        System.out.println(v.regNo);
        System.out.println(ferrari.regNo);

    }
}