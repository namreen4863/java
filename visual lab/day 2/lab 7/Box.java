class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Default Constructor");
        width = 10;
        depth = 10;
        height = 10;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return (width * depth * height);
    }
}