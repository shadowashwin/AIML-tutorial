// import java.util.Scanner;
class A
{
    public static void main(String[] args) {
        int n=55;
        System.out.println(n%10);
        n=(n-n%10)/10;
        // System.out.println(n);
        System.out.println(n%10);
    }
}