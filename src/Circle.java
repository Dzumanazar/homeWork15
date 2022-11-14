public class Circle {
    private double PI;

    public Circle(double PI) {
        this.PI = PI;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }
    public static double area ( double radius){
        return Math.PI*(radius * radius);
    }

    @Override
    public String toString() {
        return  PI + "\narae: "+ area(2)+"\n circumference: "+circumference(3);
    }

    public static double circumference(double radius){
        return Math.PI * (2 * radius);

    }
}
