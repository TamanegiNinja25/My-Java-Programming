import java.util.Scanner;
public class MethodCall
{
    static void showNumberPlus10(int num)
    {
        int answer = num + 10;
        System.out.println(num + " plus 10 is " + answer);
    }
    static void showNumberPlus100(int num)
    {
        int answer = num + 100;
        System.out.println(num + " plus 100 is " + answer);
    }
    static void showNumberPlus1000(int num)
    {
        int answer = num + 1000;
        System.out.println(num + " plus 1000 is " + answer);
    }
    public static void main(String[]args)
    {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter desired Integer: ");
        num = s.nextInt();
        showNumberPlus10(num);
        showNumberPlus100(num);
        showNumberPlus1000(num);
    }
}