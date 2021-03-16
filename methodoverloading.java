package methodoverloading;

import java.util.Scanner;
class Area{
    int calculateArea(int breadth, int length){
        return length * breadth;
    }
    
    float calculateArea(int side){
        return side*side;
    }
    
    float calculateArea(float radius){
        return(float) Math.PI*radius*radius;
    }
}

public class Methodoverloading {
    private static int lenght;


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ENTER THE LENGTH OF RECTANGLE: ");
        int length=sc.nextInt();
        System.out.println("ENTER THE BREATH OF RECTANGLE: ");
        int breadth=sc.nextInt();
        
        Area area = new Area();
        
        int rectangleArea= area.calculateArea(length,breadth);
        
        System.out.println("ENTER THE SIDE OF SQUARE: ");
        int side=sc.nextInt();
        
        float squareArea = area.calculateArea(side);
        
        System.out.println("ENTER THE RADIUS OF CIRCLE: ");
        float radius = sc.nextFloat();
        
        float circleArea=area.calculateArea(radius);
        
        System.out.println("AREA OF RACTANGLE IS: "+rectangleArea);
        
        System.out.println("AREA OF SQUARE IS: "+squareArea);
        
        System.out.println("AREA OF CIRCLE IS: "+circleArea);
    
    }
}
