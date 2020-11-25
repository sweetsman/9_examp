package example;

public class e10 {
    public static void main(String[] args){
        e8 myCircle=new e8(1);
        int n=5;
        printAreas(myCircle,n);
        System.out. println("\n" + "Radius is " + myCircle.getRadius());
        System.out. println("n is " +n);
    }

    public static void printAreas(e8 c,int times){
        System.out.println("Radius \t\tArea");
        while(times>=1){
            System.out.println(c.getRadius()+"\t\t"+c.getArea());
            c.setRadius(c.getRadius()+1);
            times--;
        }
    }

}
