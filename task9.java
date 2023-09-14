import java.util.Scanner;
public class task9 {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number = ");
        a = sc.nextInt();


        for(int i=1;i<=a;i++){
            a=a*i;
            System.out.println(a);
        }
    }
    
}
