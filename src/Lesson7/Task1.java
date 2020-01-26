package Lesson7;

public class Task1{
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(ShapeUtils.isFigureTriangle(triangle));

        Figure rectangle = new Rectangle();
        System.out.println(ShapeUtils.isFigureTriangle(rectangle));
        Circle circle = new Circle();
        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());
        System.out.println(circle.toString());

    }

}

abstract class Figure{
    abstract public double squareOfFigure();
    abstract public double perimeterOfFigure();
}

class Circle extends Figure{
    private double radius;
    public Circle(){
        radius = 7;
    }
    public Circle (double radius ){this.radius = radius;}
    public double getRadius() {return radius;}
    public void setRadius(double radius){this.radius = radius;}
    @Override
    public double squareOfFigure(){
        return Math.PI*Math.pow(radius,2);
    }
    @Override
    public double perimeterOfFigure() {return 2*Math.PI*radius;}
    @Override
    public String toString(){
        return "Radius of circle: " + radius + "\nSquare of figure: " +
                squareOfFigure() +"\nPerimeter of figure: " + perimeterOfFigure();
    }
}
class Rectangle extends Figure{
    private double width;
    private double height;
    public Rectangle(){
        width = 7;
        height = 7;
    }
    public Rectangle (double width, double height)
    {
        this.height = height;
        this.width = width;
    }
    @Override
    public double squareOfFigure (){return width*height;}
    @Override
    public double perimeterOfFigure (){return (width + height)*2;}
    public double getDiagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }
    @Override
    public String toString(){
        return "Width of rectangle: " + width+"\nHeight of rectangle: "+ height + "\nSquare of figure: " +
                squareOfFigure() +"\nPerimeter of figure: " + perimeterOfFigure();
    }
}
class Triangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double p = (firstSide+ secondSide+ thirdSide)/2;

    public Triangle(){
        firstSide = 7;
        secondSide = 7;
        thirdSide = 8;
        p = (firstSide+ secondSide+ thirdSide)/2;
    }
    public Triangle(double firstSide, double secondSide, double thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this. thirdSide= thirdSide;
    }
    @Override
    public double squareOfFigure(){return Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide));}
    @Override
    public double perimeterOfFigure(){return firstSide+ secondSide+thirdSide;}
    @Override
    public String toString(){
        return "First side of triangle: " + firstSide+"\nSecond side of triangle: "+ secondSide
                + "\nThird side of triangle: "+ thirdSide + "\nSquare of figure: " +
                squareOfFigure() +"\nPerimeter of figure: " + perimeterOfFigure();
    }
}

class ShapeUtils{
    public static String isFigureRectangle(Figure figure){
        if (figure instanceof Rectangle){
            return "Figure is rectangle.";
        }
        else return "Figure is not rectangle.";
    }
    public static String isFigureTriangle(Figure figure){
        if(figure instanceof Triangle){
            return "Figure is triangle.";
        }
        else return "Figure is not triangle.";
    }
}