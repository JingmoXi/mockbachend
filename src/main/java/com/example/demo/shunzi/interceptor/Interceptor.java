package com.example.demo.shunzi.interceptor;

import java.util.List;


public class Interceptor {

    public static void runFile(String path){
        //解析文件
    }

    private static void run(String source) {
        Scanner scanner = new Scanner(source);
        List<Token> tokens = scanner.scanTokens();

        // For now, just print the tokens.
        for (Token token : tokens) {
            System.out.println(token);
        }
    }

}
