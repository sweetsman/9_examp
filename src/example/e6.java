package example;

public class e6 {
    double radius;
    static int numberOfObjects=0;
    e6(){
        radius=1;
        numberOfObjects++;
    }
    e6(double newRadius){
        radius=newRadius;
        numberOfObjects++;
    }
    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
}
