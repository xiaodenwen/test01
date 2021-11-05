package service.impl;

import dao.BookingDao;
import entity.Booking;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import service.BookingService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookingSerivceImpl implements BookingService {
    @Resource
    private BookingDao bookingDao;

    @Override
    public List<Booking> getBookings() {
        return bookingDao.getBookings();
    }


    @Override
    public Integer addBooking(Booking booking) {
        Integer resutl= bookingDao.addBooking(booking);

        return resutl;
    }

    @Override
    public Booking getBooking(Integer id) {
        return bookingDao.getBooking(id);
    }
}
