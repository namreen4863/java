class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        vol = myBox1.volume();
        System.out.println("volume of Box1" + vol);
        myBox2.width = 25;
        myBox2.height = 10;
        myBox2.depth = 20;
        System.out.println("volume of Box2 is" + myBox2.volume());
        Box arsh = new Box(10, 20, 30);
        double v3;
        v3 = arsh.volume();
        System.out.println("volume of arsh" + v3);

    }
}