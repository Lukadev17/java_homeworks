package btu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ClassA {
    public void method1() {
        Random r = new Random();
        ArrayList<Integer> mynumbers = new ArrayList<Integer>();
        ArrayList<Integer> modifiedmynumbers = new ArrayList<Integer>();
        for (int i=0; i < 12; i++) {
            int randomvalue = r.nextInt();
            mynumbers.add(randomvalue);
            modifiedmynumbers.add(randomvalue);
        }
        for (int k=modifiedmynumbers.size()-1;k>0;k--){
            if (k%2==0){
                modifiedmynumbers.remove(k);
            }

        }
        Collections.sort(mynumbers);
        Collections.sort(modifiedmynumbers);

        System.out.println("tavdapirveli listi "+mynumbers);
        System.out.println("shecvlili listi "+ modifiedmynumbers);
    }
    public void method2(){
        ArrayList<Integer>mynumbers=new ArrayList<Integer>();
        Random r=new Random();
        for (int i=0;i<12;i++){
            int randomvalue=r.nextInt(10-5)+5;
            mynumbers.add(randomvalue);
        }
        System.out.println(mynumbers);
        for (int k=mynumbers.size()-1;k>-1;k--){
            if (k%3==0 & k>0){
                mynumbers.add(k+1,r.nextInt((25-20)+1)+20);
            }
        }
        System.out.println("modified mynumbers list  is ");
        System.out.println(mynumbers);
    }
}
