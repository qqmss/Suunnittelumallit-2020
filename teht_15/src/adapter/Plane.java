package adapter;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private List<Shape> shapes = new ArrayList<>();

    public void addPoint(double x, double y){
        shapes.add(new Point(x, y));
    }

    public void display(){
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
