package btu;
import java.io.FileWriter;


public class Main {

    public static void main(String[] args) {
        double a;
        double b;


        for(a=1.0;a<=2;a+=0.01){
            b=a*a+2*a+3;
            try{
                FileWriter fw =new FileWriter("Functions.txt",true);
                fw.write(b+"\n");
                fw.close();
            }catch(Exception e){
                System.out.println(e);}


        }
	// write your code here
    }
}
