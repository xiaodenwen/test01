package dao;

import entity.Booking;

import java.util.List;

public interface BookingDao {
    List<Booking> getBookings();

    Integer addBooking(Booking booking);

    Booking getBooking(Integer id);
}
