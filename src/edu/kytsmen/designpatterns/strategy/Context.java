package edu.kytsmen.designpatterns.strategy;


public class Context {
    IChoice myContext;

    public void setMyContext(IChoice myContext) {
        this.myContext = myContext;
    }
    public void showChoice(String s1, String s2){
        myContext.myChoice(s1,s2);
    }
}
