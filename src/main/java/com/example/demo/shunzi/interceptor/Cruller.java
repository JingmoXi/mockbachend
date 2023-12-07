package com.example.demo.shunzi.interceptor;

public class Cruller extends Pastry{
    @Override
    void accept(PastryVisitor visitor) {
        visitor.visitCruller(this);
    }
}
