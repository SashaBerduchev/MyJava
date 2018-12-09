package model.entity;

import java.util.Arrays;

public class PointListSample {
   public static class PointsOfFirstQuater extends PointList
    {
        @Override
        protected boolean filter(Point point){
            return point.getX()>0 && point.getY() > 0;
        }
    }


    public void PointSet(){
        PointList points = new PointList() {
            @Override
            protected boolean filter(Point point) {
                return point.getX() >=0;
            }
        };
        points = new PointsOfFirstQuater()
                .add(new Point(1,2))
                .add(new Point(0,0))
                .add(new Point(-4,6))
                .add(new Point(3,7))
                .add(new Circle(5,-5, 3));
        Point[] pointsByFilter = points.getByFilter();
        System.out.println(Arrays.toString(pointsByFilter));
    }



}
