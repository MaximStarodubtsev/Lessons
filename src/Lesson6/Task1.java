package Lesson6;

class Rectangle {
    private Point a;
    private Point b;
    public Point getA()
    {
        return a;
    }
    public Point getB(){
        return b;
    }
    public Rectangle(Point x, Point y){
        a = x;
        b = y;
    }
    public double countSquare(){
        return (double) (Math.abs(a.getX()-b.getX())*Math.abs(a.getY()-b.getY()));
    }
    public double calculateDiagonal(){
        double x = Math.abs(a.getX()-b.getX());
        double y = Math.abs(a.getY()-b.getY());
        double i = Math.pow(x,2);
        double j = Math.pow(y,2);
        double k = i + j;

        double ret = Math.sqrt(k);
        return ret;
    }
}

class Point{
    private int x;
    private int y;
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    public double distance(Point point){
        int a = Math.abs(this.x - point.getX());
        int b = Math.abs(this.y - point.getY());
        return Math.pow((Math.pow(a,2)+Math.pow(b,2)),1/2);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

}