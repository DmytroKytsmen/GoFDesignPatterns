package edu.kytsmen.designpatterns.singleton;

public class EagerCaptain {
    private static EagerCaptain _captain = new EagerCaptain();

    private EagerCaptain() {
    }

    private static EagerCaptain getCaptain() {
        return _captain;
    }
}
