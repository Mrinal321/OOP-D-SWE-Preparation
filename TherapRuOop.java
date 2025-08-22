/* Question:
 * Given a Structural Program to find the area of 
 * squares and rectangles. Convert it into an Object 
 * Oriented Program using the OOP concepts.
 */

abstract class Shape{
    abstract void area();
}

class Rectangle extends Shape{
    private double height, weidth;
    Rectangle(double height, double weidth){
        this.height = height;
        this.weidth = weidth;
    }
    void area(){
        double area =  height*weidth;
        System.err.println("Area of Rectangle: " + area);
    }
}

class Square extends Shape{
    private double lenght;
    Square(double lenght){
        this.lenght = lenght;
    }
    void area(){
        double area =  lenght*lenght;
        System.err.println("Area of Square: " + area);
    }
}


public class TherapRuOop {
    public static void main(String[] args) {
        Shape rec = new Rectangle(3, 2);
        rec.area();
        Shape sqr = new Square(4);
        sqr.area();
    }
}