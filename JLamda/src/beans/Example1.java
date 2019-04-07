package beans;

public class Example1 {
    public static void main(String[] args) {
        FI multiply = (x, y) -> x * y;
        System.out.println(multiply.calculate(2,3));

        // Straight line formula  mx + b
        int straightLine = multiply.calculate(2,3) + 10;
        System.out.println("calculation result: " + straightLine);
    }
}
