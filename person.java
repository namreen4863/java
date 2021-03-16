class Person {
    public String name;
    public int age;
}

class Program {
    public static void main(String[] args) {
        Person naeem = new Person();
        naeem.name = "NAEEM GHADAI";
        naeem.age = 18;
        Person abdulkadir = new Person();
        abdulkadir.name = "ABDULKADIR SEKHA";
        abdulkadir.age = 18;
        System.out.println("NAME IS " + naeem.name);
        System.out.println("AGE IS " + naeem.age);
        System.out.println("NAME IS " + abdulkadir.name);
        System.out.println("AGE IS " + abdulkadir.age);
    }
}