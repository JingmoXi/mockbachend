package com.example.demo.shunzi;

public class Shunzi {

   public static void error(int line, String message) {
        report(line, "", message);
    }

    private static void report(int line, String where,
                               String message) {
        System.err.println(
                "[line " + line + "] Error" + where + ": " + message);
        //hadError = true;
    }

    public static void main(String[] args){
        //入口方法
    }

}
