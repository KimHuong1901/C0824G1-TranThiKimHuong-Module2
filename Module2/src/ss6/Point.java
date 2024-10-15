package ss6;

public class Point {
    private float x;
    private float y;
    public Point(float x, float y) {
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
    public float[] getXY(){
        return new float[]{x, y};
    }
//    @Override
//    public String toString() {
//        return "Point{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }
}
class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y) {
        super(x, y);
    }
  public float getXSpeed() {
        return xSpeed;
  }
  public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
  }
  public float getYSpeed() {
        return ySpeed;
  }
  public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
  }
  public void setSpeedX(float speedX) {
        this.xSpeed = speedX;
  }
}
