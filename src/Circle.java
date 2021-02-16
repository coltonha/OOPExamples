public class Circle {
    private double radius;
    public Circle(){
        radius=1.0;
    }

    public Circle(double newRadius){
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

}
