package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Star {
    String name;
    double temperature;
    double diameter;
    Scanner input=new Scanner(System.in);
    ArrayList<String>starsarray=new ArrayList<String>();

    public void createstar(){
        System.out.println("sheqmenit varskvlavi: ");
        this.name=input.nextLine();
        System.out.println("miutitet diametri: ");
        this.diameter=input.nextDouble();
        System.out.println("miutitet temperatura: ");
        this.temperature=input.nextDouble();
        starsarray.add(this.name);
    }

    public void starinfo(){
        System.out.println("varskvlavis saxelia "+name);
        System.out.println("varskvlavis temperaturaa: "+temperature);
        System.out.println("varskvlavis diametria: "+diameter);
    }

    public void chawerastar() throws IOException {
        FileWriter fw=new FileWriter(name+".txt",true );
        fw.write("varskvlavis saxelia: "+name+"\n");
        fw.write("temperatura: "+temperature+"\n");
        fw.write("diamnetri "+diameter+"\n");
        fw.close();
    }



    public void overviewgalaxy() throws IOException {
        for (int i=0;i<starsarray.size();i++){
            BufferedReader br=new BufferedReader(new FileReader(starsarray.get(i)+".txt"));
            String stri;
            while ((stri=br.readLine())!=null){
                System.out.println(stri);
            }

        }
    }

}
