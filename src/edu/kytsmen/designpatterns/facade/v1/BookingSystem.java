package edu.kytsmen.designpatterns.facade.v1;


public class BookingSystem {
    private static int THREESTARS = 250;
    private static int FOURSTARS = 500;
    private static int FIVESTARS = 900;

    public int bookRoom(int roomQuality) {
        switch (roomQuality) {
            case 3:
                return THREESTARS;
            case 4:
                return FOURSTARS;
            case 5:
                return FIVESTARS;
            default:
                throw new IllegalArgumentException("roomQuality should be in range 3..5");

        }
    }
}
