package com.learning.pattern.createPattern.buildPattern;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();

        Builder commonBuild = new CommonRoleBuilder();

        director.construct(commonBuild);

        Role commonRole = commonBuild.getResult();
        System.out.println(commonRole.toString());
    }
}
