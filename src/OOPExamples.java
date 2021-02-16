public class OOPExamples {
    public static void main(String[] args) {
        Circle c1= new Circle();
        Rectangle r1= new Rectangle();
        Triangle t1= new Triangle();
        
        Shape2D [] myShapeArray= new Shape2D[3];
        
        myShapeArray[0]=c1;
        myShapeArray[1]=r1;
        myShapeArray[2]=t1;

        System.out.println(myShapeArray[0].toString());
        System.out.println(myShapeArray[1].toString());
        System.out.println(myShapeArray[2].toString());

    }
}
