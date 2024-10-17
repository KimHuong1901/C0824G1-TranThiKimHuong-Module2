package ss6.bai_2;

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
    public float []  getXYZ(float x, float y, float z) {
        return new float [] {x, y, z};
    }
        @Override
    public String toString() {
        return "(" +
                "x = " + getX() +
                ", y = " + getY() +
                ", z = " + z +
                ')';
    }
    public static void main(String[] args) {
        Point2D point2d = new Point2D(3, 4);
        System.out.println(point2d);
        Point3D point3d = new Point3D(3, 4, 5);
        System.out.println(point3d);
    }
}
