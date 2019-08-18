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

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return (width * depth * height);
    }
}