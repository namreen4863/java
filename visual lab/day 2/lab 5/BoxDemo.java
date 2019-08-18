class BoxDemo {
    public static void main(String[] args) {
        double vol;
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        mybox1.setDimension(10, 15, 20);
        mybox2.setDimension(10, 10, 10);
        vol = mybox1.volume();
        System.out.println("volume of myBox1 is" + vol);
        System.out.println(mybox2.volume());
    }
}