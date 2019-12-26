package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Planet {
    String planetname;
    double distance;
    double speed;
    Scanner input=new Scanner(System.in);
    ArrayList<String>planetsarray=new ArrayList<String>();
    public String starname;

    public void createPlanet(){
        System.out.println("planetis saxeli: ");
        this.planetname=input.nextLine();
        System.out.println("varsklavis saxeli romlis garshemoc brunavs");
        this.starname=input.nextLine();
        System.out.println("distancia varskvlavidan: ");
        this.distance=input.nextDouble();
        System.out.println("sichqare: ");
        this.speed=input.nextDouble();
    }
    public void getplanetinfo(){
        System.out.println("planetis saxelia: "+planetname+"\n");
        System.out.println("distancia "+distance+"\n");
        System.out.println("sichqare: "+speed+"\n");

    }
    public double spent_time_around_star(double star_diameter){
        return (star_diameter/2+distance)*Math.PI/speed;
    }

    public void chawera() throws IOException {
        FileWriter fw=new FileWriter(starname+".txt",true);
        fw.write("planetis saxelia: "+planetname+"\n");
        fw.write("varkslvavi romlis garshemoc "+planetname+" brunavs aris "+starname+"\n");
        fw.write("distancia "+distance+"\n");
        fw.write("sichqare: "+speed+"\n");
        fw.close();
    }


}
