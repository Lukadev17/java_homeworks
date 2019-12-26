package com.company;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Stringanalyzer {
    public String mathexpression;

    public Stringanalyzer(String mathexpression){
        this.mathexpression=mathexpression;
    }
    public void calculate(){
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
            Object result = engine.eval(mathexpression);
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }

    }
}
