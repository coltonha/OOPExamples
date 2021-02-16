public class Triangle extends Shape2D{
    private int base, height;

    public Triangle(){
        base=1;
        height=1;
    }

    public void setBase(int newBase){
        if(newBase>0){
            base=newBase;
        }
    }

    public void setHeight(int newHeight){
        if(newHeight>0){
            height=newHeight;
        }
    }
    public Triangle(int newBase, int newHeight){
        setBase(newBase);
        setHeight(newHeight);
    }
   /* public String toString(){
        return "This is a Triangle object, is located at (" + getX()+","+getY()+ ") with base" +base + "and height"+height;
    }*/
}
