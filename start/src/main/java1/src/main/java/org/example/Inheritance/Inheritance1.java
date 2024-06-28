package org.example.Inheritance;

public class Inheritance1 {

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    int x;
    int y;
    String Name;


    @Override
    public String toString() {
        return "Inheritance1{" +
                "x=" + x +
                ", y=" + y +
                ", Name='" + Name + '\'' +
                '}';
    }

}
