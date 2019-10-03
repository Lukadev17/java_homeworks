package btu;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int temp;
        int k;
        Scanner input=new Scanner(System.in);
        System.out.print("enter a: ");
        a=input.nextInt();
        System.out.println("enter b: ");
        b=input.nextInt();
        int even=0;
        int odd=0;
        int sumeven=0;
        int sumodd=0;
        Random randomnumb=new Random();
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        for(int i=1;i<=40;i++){
            int rnumber=randomnumb.nextInt(b-a+1)+a;
            if (rnumber%2==0){
                sumeven+=rnumber;
                even+=1;

            }
            else{
                odd+=1;
                sumodd+=rnumber;
            }

        }
        System.out.println("luwebi "+even);
        System.out.println("kentebi "+odd);
        System.out.println("luwebi jamshi "+sumeven);
        System.out.println("kentebi jamshi "+sumodd);
        if (sumodd>sumeven){
            k=sumodd;
            sumodd=sumeven;
            sumeven=k;
        }

        for(int i=0;i<=5;i++){
            int rnumber =randomnumb.nextInt(sumeven-sumodd+1)+sumodd;
            System.out.println(rnumber);
        }

    }
}
