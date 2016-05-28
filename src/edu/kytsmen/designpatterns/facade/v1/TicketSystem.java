package edu.kytsmen.designpatterns.facade.v1;


public class TicketSystem {
    private static int ONEDAYPRICE = 115;
    private static int HALFDAYPRICE = 60;

    public int buyOneDayTicket() {
        return ONEDAYPRICE;
    }

    public int buyHalfDayTicket() {
        return HALFDAYPRICE;
    }
}
