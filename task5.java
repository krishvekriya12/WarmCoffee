import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int number;

            Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number: ");
        number = sc.nextInt();

     
        for(int i=1; i<=number; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }    
}
