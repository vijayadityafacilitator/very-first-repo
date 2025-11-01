import java.util.Scanner;

public class factorial {
    Scanner sc = new Scanner(System.in);
    
    int fact = 1;

    System.out.println("Enter a number: ");
    int num = sc.nextInt();

    for(int i = 1; i < num; i++){
        fact = fact * i;
    }
    System.out.println(fact);
}
