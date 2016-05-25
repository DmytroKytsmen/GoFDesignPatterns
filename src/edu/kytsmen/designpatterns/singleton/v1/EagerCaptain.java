package edu.kytsmen.designpatterns.singleton.v1;

public class EagerCaptain {
    private static EagerCaptain _captain = new EagerCaptain();

    private EagerCaptain() {
    }

    private static EagerCaptain getCaptain() {
        return _captain;
    }
}
