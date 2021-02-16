public class Shape2D {
    private int x,y;
    public void setX(int newX){
        if(newX>=0){
            x=newX;
        }
    }
    public void setY(int newY){
        if(newY>=0){
            y=newY;
        }
    }
    public Shape2D() {
        x=0;
        y=0;
    }
    public Shape2D(int newX, int newY){
        setX(newX);
        setY(newY);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String toString(){
        return "located at (" +x+","+y+")";
    }
}
