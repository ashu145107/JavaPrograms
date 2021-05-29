

abstract class Shape {
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    int length = 0;
    int width = 0;
    int radius = 0;

    abstract double perimeter();

    abstract double area();

}

class Square extends Shape {

    public double perimeter() {
        return 4 * super.getLength();
    }

    public double area() {
        return super.getLength() * super.getLength();
    }
}

class Rectangle extends Shape {

    public double perimeter() {
        return 2 * (super.getLength() + super.getWidth());
    }

    public double area() {
        return super.getLength() * super.getWidth();
    }
}

class Circle extends Shape {

    public double perimeter() {
        return 2 * 3.14 * super.getRadius();
    }

    public double area() {
        return 3.14 * super.getRadius() * super.getRadius();
    }
}

class Triangle extends Shape {

    public double perimeter() {
        return super.getLength() + super.getWidth() + super.getRadius();
    }

    public double area() {
        return 0.5 * (super.getLength() * super.getWidth());
    }
}