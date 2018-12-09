import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Point {
    private  int y = getX();
    private int x;

    public  Point(){

    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "Point{"+
                "y="+y+
                ", x=" +x+
                "}";
    }


    int getSquare(){
        if(x>0)
            return 100500;
        throw  new NotImplementedException();
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }



}
