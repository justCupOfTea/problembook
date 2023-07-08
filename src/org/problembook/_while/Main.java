package org.problembook._while;

public class Main {
    public static void main(String[] args) {
        System.out.println("while1: " + While1.fun(2, 1.0));
        System.out.println("while1: " + While1.fun(1.1, 1));

        System.out.println("while10: " + While10.fun(2));
        System.out.println("while10: " + While10.fun(8));

        While14.fun(1.1);
        While14.fun(1.51);
        While14.fun(1.9);

        System.out.println("while22: " + While22.fun(3));
        System.out.println("while22: " + While22.fun(4));
        System.out.println("while22: " + While22.fun(5));
        System.out.println("while22: " + While22.fun(71));
    }
}
