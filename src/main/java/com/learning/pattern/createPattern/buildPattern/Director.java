package com.learning.pattern.createPattern.buildPattern;

public class Director {
    public void construct(Builder builder){
        builder.buildBody();
        builder.buildHead();
        builder.buildFace();
        builder.buildHp();
        builder.buildMp();
        builder.buildSp();
    }
}
