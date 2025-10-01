public class TravelFacade {
    private FlightBooking flight;
    private HotelBooking hotel;
    private CarBooking car;

    public TravelFacade() {
        flight = new FlightBooking();
        hotel = new HotelBooking();
        car = new CarBooking();
    }

    public void bookTrip(String from, String to, int hotelNights, int carDays) {
        System.out.println("Starting travel booking process...");
        flight.bookFlight(from, to);
        hotel.bookHotel(to, hotelNights);
        car.bookCar(to, carDays);
        System.out.println("Travel booking completed!\n");
    }
}
