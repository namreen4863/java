
class BoxDemo {
    public static void main(String[] args) {
        double vol;
        Box b = new Box();
        b.width = 10;
        b.height = 20;
        b.depth = 15;
        vol = b.width * b.height * b.depth;
        System.out.println("volume of box is" + vol);
    }
}