import TerminalIO.*;
public class Fibonacci {
    public static void main (String[] args){
        KeyboardReader kr = new KeyboardReader();
        int num = kr.readInt("Enter a Fibonacci number (max 15): ");
        
        System.out.println(fib(num));
    }

    static int fib(int n) {
        if (n<=2) return 1;
        else return fib (n-1) + fib (n-2);
        
    }
    
}
