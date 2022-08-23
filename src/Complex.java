public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public Complex(){
        realPart = 2.0;
        imaginaryPart = 5.0;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public static void addComplexNumbers(Complex complex, Complex complex1){
        double realP = complex.getRealPart() + complex1.getRealPart();
        double imagP = complex.getImaginaryPart() + complex1.getRealPart();
        System.out.printf("%.2f + %.2fi%n",realP,imagP);
    }
    public static void subtractComplexNumbers(Complex complex,Complex complex1){
        double realP = complex.getRealPart() - complex1.getRealPart();
        double imagP = complex.getImaginaryPart() - complex1.getRealPart();
        System.out.printf("%.2f + %.2fi%n",realP,imagP);
    }
    public void printComplex(){
        System.out.printf("(%.2f , %.2f)%n",getRealPart(),getImaginaryPart());
    }

}
