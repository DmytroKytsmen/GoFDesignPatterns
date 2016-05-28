package edu.kytsmen.designpatterns.facade.v1;

public class SkiResortFacade {
    private SkiRent skiRent;
    private TicketSystem ticketSystem;
    private BookingSystem bookingSystem;

    public SkiResortFacade(SkiRent skiRent, TicketSystem ticketSystem, BookingSystem bookingSystem) {
        this.skiRent = skiRent;
        this.ticketSystem = ticketSystem;
        this.bookingSystem = bookingSystem;
    }

    public int haveGoodRest(int height, int weight, int feetSize, int skierLevel, int roomQuality) {
        int skiPrice = skiRent.rentSki(weight, skierLevel);
        int skiBootsPrice = skiRent.rentBoots(feetSize, skierLevel);
        int polePrice = skiRent.rentPole(height);
        int oneDayTicketPr = ticketSystem.buyOneDayTicket();
        int hotelPrice = bookingSystem.bookRoom(roomQuality);
        return skiPrice + skiBootsPrice + polePrice + oneDayTicketPr + hotelPrice;
    }

    public int haveRestWithOwnSkies() {
        return ticketSystem.buyOneDayTicket();
    }
}
