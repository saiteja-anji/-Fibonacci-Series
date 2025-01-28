import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

       
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            
            int firstTerm = 0, secondTerm = 1;

            System.out.println("Fibonacci Series up to " + n + " terms:");

           
            for (int i = 1; i <= n; i++) {
                
                System.out.print(firstTerm + " ");
                
              
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }

       
        scanner.close();
    }
}
