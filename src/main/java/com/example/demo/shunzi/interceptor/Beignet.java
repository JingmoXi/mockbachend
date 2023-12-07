package com.example.demo.shunzi.interceptor;

public class Beignet extends Pastry{
    @Override
    void accept(PastryVisitor visitor) {
        visitor.visitBeignet(this);
    }
}
