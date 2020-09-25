package algorithms.recursion.factorial;

public class Factorial2 {
    public int findFactorialRecursive(int number) {
        if (number > 1 ) {
            return number * findFactorialRecursive(number -1);
        }
        return number;
    }

    public int findFactorialIterative(int number) {
        int tempnum = 0;
        for(int i = number; i > 0; i--) {
            tempnum += number * number - 1;
        }
        return tempnum;
    }

    public static void main(String[] args) {
        Factorial2 factorial2 = new Factorial2();
        System.out.println(factorial2.findFactorialRecursive(6));
        System.out.println(factorial2.findFactorialIterative(5));
    }
}
