import java.util.Scanner;
public class task7{
    public static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number = ");
        a = sc.nextInt();

        System.out.println("enter number = ");
        b = sc.nextInt();

        System.out.println("enter number = ");
        c = sc.nextInt();

        if(a>c){
            if(a>c){
                System.out.println(a+"is large");
            }
            else{
                System.out.println(c+"is large");
            }
            
        }
        else{
            if(b>c){
            System.out.println(b+"is large");
            }
            else{
                System.out.println(c+"is large");
            }
        }

    }
}