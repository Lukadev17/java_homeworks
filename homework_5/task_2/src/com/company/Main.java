package com.company;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        task2();
    }

    public static void task2() throws IOException {
        Scanner input = new Scanner(System.in);
        Star starobj = new Star();
        while (true) {
            starobj.createstar();
            starobj.starinfo();
            starobj.chawerastar();
            System.out.println(" planetis dasamateblad daachiret 1-s ");
            String s = input.nextLine();
            if (s.equals("1")) {
                Planet planobj = new Planet();
                planobj.createPlanet();
                planobj.getplanetinfo();
                System.out.println("dro romelsac planeta andomebs varsklavis garshemo gadaadgilebisas "+planobj.spent_time_around_star(starobj.diameter));
                planobj.chawera();

            }
            System.out.println("tu gindat kosmosis datvaliereba daachiret 1-s, programis gasatishad akrifet 2");
            String str = input.nextLine();
            if (str.equals("1")) {
                starobj.overviewgalaxy();

            }else if (str.equals("2")){
                System.out.println("programam daasrula mushaoba");
                break;
            }break;
        }
    }
}
