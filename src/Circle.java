public class Circle extends Shape2D{
    private double radius;
    public Circle(){
        super();
        radius=1.0;
    }

    public Circle(double newRadius){
        super();
        setRadius(newRadius);
    }
    public Circle(int newX, int newY, double newRadius) {
        super(newX, newY);
        setRadius(newRadius);
    }
    public void setRadius(double newRadius){
        if(newRadius>0){
            radius=newRadius;
        }
    }
    public double getRadius(){
        return radius;
    }
 /*   public String toString(){
        return "This is a Circle object" + super.toString()+" and a radius of "+radius;
    }*/
}
