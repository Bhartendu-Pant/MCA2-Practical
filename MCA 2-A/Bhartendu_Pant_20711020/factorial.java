import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number :" );
        int n =sc.nextInt();
        int temp=n;
        int f=1;
        while(n!=0){
            f=f*n;
            n--;
        }
        System.out.println("The factorial of "+ temp +" is " +f);
    }

}
