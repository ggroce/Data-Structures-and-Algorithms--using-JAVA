package algorithms.recursion.fibonacci;

// Given a number N return the index value of the Fibonacci sequence,
// where the sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...

// the pattern of the sequence is that each value is the sum of the
// 2 previous values, that means that for N=5 → 2+3

//For example: fibonacciRecursive(6) should return 8

public class Fibonacci2 {
    int counter = 0;

    public int fiboRecursive(int num) {
        System.out.println("num is: " + num);
        if (num < 2) {
            //System.out.println("inside if");
            if (num == 1) {
                counter++;
                System.out.println("incrementing counter: " + counter);
            }
            return num;
        }
        return fiboRecursive(num - 1) + fiboRecursive(num - 2);
    }

    public static void main(String[] args) {
        Fibonacci2 fibonacci = new Fibonacci2();
        System.out.println(fibonacci.fiboRecursive(5));
    }
}
