public class ComplexTest {

    public static void main(String[] args) {
        ComplexTest ct = new ComplexTest();

        System.out.println("No argument constructor:");
        Complex zero = new Complex();
        zero.print(zero);

        System.out.println();
        System.out.println("----------------");
        System.out.println("Creating variables:");
        Complex x = new Complex(1,-5);
        Complex y = new Complex(-3,-4);
        System.out.print("x = ");
        x.print(x);
        System.out.println();
        System.out.print("y = ");
        y.print(y);

        System.out.println();
        System.out.println("----------------");
        System.out.println("Addition:");
        Complex resultAdd = x.add(x,y);
        System.out.print("x + y = ");
        resultAdd.print(resultAdd);

        System.out.println();
        System.out.println("----------------");
        System.out.println("Subtraction:");
        Complex resultSubtract = x.subtract(x,y);
        System.out.print("x - y = ");
        resultSubtract.print(resultSubtract);

        System.out.println();
        System.out.println("----------------");
        System.out.println("Multiplication:");
        Complex resultMultiplication = x.multiply(x,y);
        System.out.print("x * y = ");
        resultMultiplication.print(resultMultiplication);
    }
}
