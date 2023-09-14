import java.util.Scanner;
public class task10 {

    public static void main(String[] args) {
        int n; 

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number = ");
        n =  sc.nextInt();
    
        for (int i =1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
             
                int product = i * j;
                
                System.out.printf("%4d", product);
            }
    }
    
}
}

