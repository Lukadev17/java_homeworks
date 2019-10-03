package btu;
import java.util.Scanner;

public class classA {
    int x;
    public classA(){
        System.out.println("hello");
    }
    public void first(){
        System.out.println("enter x: ");
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        System.out.println("x= "+x);
    }
    public void second(){
        System.out.println(x+12);
    }
    public void luwkentoba(){
        if(x%2==0){
            System.out.println("x luwia");
        }else{
            System.out.println("x kentia");
        }
    }
}
