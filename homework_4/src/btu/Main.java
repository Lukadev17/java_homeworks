package btu;
import generator.Generator;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter language:");
        String language=input.nextLine();
        System.out.println("enter parameters:");
        String parameters=input.nextLine();

        Generator generator = new Generator(language, parameters);
        generator.parseStringToarray();
        generator.generateAlphabet();
        generator.generateParagraph();
    }
}