package example;

public class e7 {
    public static void main(String[] args){
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + e6.numberOfObjects);
        e6 c1=new e6();
        System.out.println("\nAfter creating c1");
        System.out.println("c1:radius ("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
        e6 c2=new e6(5);
        c1.radius=9;
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("cl: radius (" + c1.radius + ") and number of Circle objects ("+c1.numberOfObjects+")");
        System.out.println("cl: radius (" + c2.radius + ") and number of Circle objects ("+c2.numberOfObjects+")");

    }
}
