public class ComplexTest {
    public static void main(String[] args) {
        Complex complex = new Complex(4.7,8.4);
        Complex complex1 = new Complex(3, 6.3);
        Complex complex2 = new Complex();

        complex.printComplex();
        complex1.printComplex();
        Complex.addComplexNumbers(complex,complex1);
        Complex.subtractComplexNumbers(complex,complex1);

    }
}
