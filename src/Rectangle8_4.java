public class Rectangle8_4 {
    private double width = 1;
    private double length = 1;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0.0 || width > 20.0)
            throw new IllegalArgumentException("width must be greater than 0 or less than 20");
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0.0 || length > 20.0)
            throw new IllegalArgumentException("length must be greater than 0 or less than 20");
        this.length = length;
    }
    public double area(double length, double breath){
        double area;
        area = length * breath;
        return area;
    }
    public double perimeter(double length, double breath){
        double perimeter;
        perimeter = length * breath;
        return perimeter;
    }

    public double area(Rectangle8_4 rectangle8_4) {
        double area = rectangle8_4.getLength() * rectangle8_4.getWidth();
        return area;
    }
    public double perimeter(Rectangle8_4 rectangle8_4) {
        double p = rectangle8_4.getLength() + rectangle8_4.getWidth();
        return p;
    }
}
