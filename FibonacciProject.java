import java.util.Scanner;

public class FibonacciProject {
    public static void main(String[] args){
            System.out.print("Please enter the total number it will generate for Fibonacci: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            int count = Integer.parseInt(input);

            if(count == 1)
                System.out.println(1);
            if(count == 2){
                System.out.println(1);
                System.out.println(1);
            }

            int[] numbers = new int[count];
            numbers[0] = 1;
            numbers[1] = 1;
            for(int i=2;i<count;i++)
                numbers[i] = numbers[i-1] + numbers[i - 2];
            for(int i=0;i<count;i++)
                System.out.println(numbers[i]);
    }
}
