package btu;
import java.util.Scanner;

public class classC {
    int a;
    int b;
    int c;
    public void first() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a: ");
        a = input.nextInt();
        System.out.println("enter b: ");
        b = input.nextInt();
        System.out.println("enter C: ");
        c = input.nextInt();
    }
    public int second(){
        return (a % 10);


    }
    public int third(){
        while(b>=10){
            b=b/10;
        }
        return b;

    }
    public int sumofc(){
        int sum=0;
        while(c>0){
            sum=sum+c%10;
            c/=10;
        }
        return sum;
    }
    public int resultoffifth(){
        return second()*third();
    }
    public void fifth(){
        System.out.println(third()*second());
    }
    public void sixth(){
        System.out.println(third()+resultoffifth());
    }
}
