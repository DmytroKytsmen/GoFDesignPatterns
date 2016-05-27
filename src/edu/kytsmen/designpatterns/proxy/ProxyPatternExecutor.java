package edu.kytsmen.designpatterns.proxy;


public class ProxyPatternExecutor {
    public static void main(String[] args) {
        System.out.println("***Proxy Pattern Demo***\n");
        Proxy px = new Proxy();
        px.doSomeWork();
    }
}
