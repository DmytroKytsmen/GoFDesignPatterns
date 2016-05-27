package edu.kytsmen.designpatterns.singleton;

public class SmartEagerCaptain {
    private static SmartEagerCaptain _captain;

    private SmartEagerCaptain() {
    }

    public static SmartEagerCaptain getCaptain() {
        return SingletonHelper._captain;
    }

    private static class SingletonHelper {
        private static final SmartEagerCaptain _captain = new SmartEagerCaptain();
    }

}
