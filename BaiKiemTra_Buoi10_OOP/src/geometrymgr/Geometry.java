package geometrymgr;

import java.util.ArrayList;
import java.util.List;

public abstract class Geometry {
    protected List<point> points;

    public Geometry() {
        this.points = new ArrayList();
    }

    public void input()
    {
        System.out.println("input " + getClass().getSimpleName());
        point p;
        for(int i = 0; i < getNumberPoints() ; i++){
            System.out.println("Input point" + i + " ");
            p = new point();
            p.input();
            this.points.add(p);
        } 
        p.input();
    }
    }

    public void output() {
        System.out.println(toString());
    }

    public abstract void isValid();

    public abstract boolean perimeterCalculate();

    public abstract double areaCalculate();
    protected abstract int getNumberPoints();

    @Override
    public String toString() {
        return "Geometry [points=" + points + "]";
    }




    
}
