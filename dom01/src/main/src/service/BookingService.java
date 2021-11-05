package service;

import entity.Booking;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookingService {
    List<Booking> getBookings();

    @Transactional
    Integer addBooking(Booking booking);


    Booking getBooking(Integer id);
}
