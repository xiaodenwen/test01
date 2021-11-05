package servlet;

import entity.Booking;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import service.BookingService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BookingServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        String name = req.getParameter("name");
        String sj = req.getParameter("sj");
        Integer zt = Integer.valueOf(req.getParameter("zt"));
        String sfz = req.getParameter("sfz");

        Booking booking = new Booking();
        booking.setUserName(name);
        booking.setStatus(zt);
        booking.setBookingDate(sj);
        booking.setCardid(sfz);

        WebApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + ac);
        BookingService service = (BookingService) ac.getBean("bookingSerivceImpl");
        System.out.println(service.addBooking(booking));
    }
}
