package model.entity;

import java.util.Arrays;

public abstract class PointList {
    private Point [] points;
    private int count =0;

    public  PointList() {
        points = new Point[10];
    }

    public PointList add(Point newPoint){
        if(count >= points.length -1){
            points = Arrays.copyOf(points, points.length +3/2);
        }
        points[count++] = newPoint;
        return this;
    }

    protected abstract boolean filter (Point point);

    public Point[] getByFilter(){
        Point[] temp = new Point[points.length];
        int index = 0;
        for(int i=0; i<count; i++)
        {
            if(filter(points[i])){
                temp[index++] = points[i];
            }
        }
        return Arrays.copyOf(temp, index);
    }
}
