class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return (width * height * depth);
    }

    void setDimension(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}