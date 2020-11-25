package example;

public class e9 {
    public static void main(String[] args){
        e8 myCircle=new e8(5.0);
        System.out.println("The area of the circle of radius " + myCircle.getRadius()+ " is " + myCircle.getArea());
        myCircle.setRadius(myCircle.getRadius()*1.1);
        System.out.println("The area of the circle of radius " + myCircle.getRadius()+ " is " + myCircle.getArea());
        System.out.println("The number of objects created is " + e8.getNumberOfObjects());
    }
}
