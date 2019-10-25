package btu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Double> contain =new ArrayList<Double>();

            BufferedReader bf=new BufferedReader(new FileReader("Functions.txt"));
            String st;
            while((st=bf.readLine())!=null){
                double dataline=Double.parseDouble(st);
                contain.add(dataline);

            }
            bf.close();

        Collections.sort(contain);
        System.out.println("minimum "+contain.get(0));
        System.out.println("maximum "+contain.get(contain.size()-1));
	// write your code here
    }
}
