package ss6;

import javax.swing.plaf.PanelUI;

public class Point2D {
    private float x;
    private float y;
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float [] getXY(){
        return new float[] {x, y};
    }

    @Override
    public String toString() {
        return "(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}
class Point3D extends Point2D {
    private float z;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                ')';
    }

    public static void main(String[] args) {
    Point2D point2d = new Point2D(3, 4);
    System.out.println(point2d);
    Point3D point3d = new Point3D(3, 4, 5);
        System.out.println(point3d);
}
}
