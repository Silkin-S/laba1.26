import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        double a = in.nextDouble();
        double b = in.nextDouble();
        if (b == 0){
            out.println("Решений нет");
        }
        else if (b > 0){
            if(a > 0){
                out.print("x<=");
                out.print(-a);
                out.print(" or ");
                out.print("x>=0");
            }
            else if(a == 0){
                out.println("x - любой");
            }
            else{
                out.print("x<=0");
                out.print(" or ");
                out.print("x>=");
                out.print(-a);

            }
        }
        else {
            if (a > 0){
                out.print(-a);
                out.print("<=x<=0");
            }
            else if (a == 0){
                out.println("x=0");
            }
            else{
                out.print("0<=x<=");
                out.print(-a);
            }
        }
    }
}
//rer