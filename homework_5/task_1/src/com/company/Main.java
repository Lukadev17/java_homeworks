package com.company;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ScriptException {
        Scanner input=new Scanner(System.in);
        System.out.println("enter math expression: ");
        String mathexpression=input.nextLine();
        Stringanalyzer obj=new Stringanalyzer(mathexpression);
        obj.calculate();

    }
}
