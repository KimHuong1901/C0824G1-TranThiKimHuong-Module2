package ss4;

import java.util.Scanner;

public class Fan {
static final int SLOW = 1;
static final int MEDIUM = 2;
static final int FAST = 3;
private int speed = SLOW;
private boolean on;
private double radius = 5;
private String color = "blue";
public Fan(){}
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int value){
        this.speed = value;
    }
    public double getRadius (){
        return radius;
}
    public void setRadius(int r){
        this.speed = r;
    }
    public String getColor(){
        return color;
    }
        public void setColor(String color){
            this.color = color;
        }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }

    @Override
    public String toString() {
       String status;
        if (on == true) {
            status = "Fan is on";
        } else {
            status = "Fan is off";
        }
             return
                "speed = " + speed +
                ", on = " + on +
                ", radius = " + radius +
                ", color = " + color + " " + status;
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2);

    }
}
