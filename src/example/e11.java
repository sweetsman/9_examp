package example;

public class e11 {
    public static void main(String[] args){
        e8[] circleArray;
        circleArray=creatCircleArray();
        printCircleArray(circleArray);
    }
    public static e8[] creatCircleArray(){
        e8[] circleArray= new e8[5];
        for(int i=0;i<circleArray.length;i++){
            circleArray[i]=new e8(Math.random()*100);
        }
        return circleArray;
    }
    public static void printCircleArray(e8[] circleArray){
        System.out.printf("%-30s%-15s\n","Radius","Area");
        for(int i=0;i<circleArray.length;i++){
                System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("%-30s%-15f\n","The total area of circles is",sum(circleArray));
    }
    public static double sum(e8[] circleArray){
        double sum=0;
        for (int i =0;i<circleArray.length;i++)
            sum+=circleArray[i].getArea();
        return sum;
    }
}
