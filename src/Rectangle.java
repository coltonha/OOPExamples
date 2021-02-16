
public class Rectangle extends Shape2D{
    private int length,height;

    public Rectangle(){
        length=1;
        height=1;
    }
    public void setLength(int newLength){
        if(newLength>0){
            length=newLength;
        }
    }
    public void setHeight(int newHeight){
        if(newHeight>0){
            height=newHeight;
        }
    }

    public Rectangle(int newLength, int newHeight){
        setLength(newLength);
        setHeight(newHeight);
    }
    public String toString(){
        return "This is a Rectangle object, is located at (" + getX()+","+getY()+ ") with length " +length+ " and height "+height;
    }
}
