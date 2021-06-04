public class Complex {

    private float real;
    private float imaginary;

    public Complex(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        real = 0;
        imaginary = 0;
    }

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImaginary() {
        return imaginary;
    }

    public void setImaginary(float imaginary) {
        this.imaginary = imaginary;
    }

    public Complex add(Complex a, Complex b) {
        float resultReal;
        float resultImaginary;

        resultReal = a.getReal() + b.getReal();
        resultImaginary = a.getImaginary() + b.getImaginary();

        return new Complex(resultReal, resultImaginary);
    }

    public Complex subtract(Complex a, Complex b) {
        float resultReal;
        float resultImaginary;

        resultReal = a.getReal() - b.getReal();
        resultImaginary = a.getImaginary() - b.getImaginary();

        return new Complex(resultReal, resultImaginary);
    }

    public Complex multiply(Complex a, Complex b) {
        float resultReal;
        float resultImaginary;

        resultReal = (a.getReal() * b.getReal()) - (a.getImaginary() * b.getImaginary());
        resultImaginary = (a.getReal() * b.getImaginary()) + (a.getImaginary() * b.getReal());

        return new Complex(resultReal, resultImaginary);
    }

    public void print(Complex x) {
        System.out.print("(" + x.getReal() + "," + x.getImaginary() + ")");
    }
}
