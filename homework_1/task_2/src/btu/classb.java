package btu;
import java.util.Scanner;

public class classb extends classA {
    int y;
    public void inputy(){
        System.out.println("enter y: ");
        Scanner inputy=new Scanner(System.in);
        y=inputy.nextInt();
    }
    public int summary(){
        return x+y;
    }
}
