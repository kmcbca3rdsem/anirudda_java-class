package Assignment.Lab4;

class TicketBooking {
    private int availableTickets = 5;

    public synchronized void bookTicket(String customerName) {
        if (availableTickets > 0) {
            System.out.println(customerName + " booked ticket number " + availableTickets);
            availableTickets--;
        } else {
            System.out.println("Sorry " + customerName + ", tickets are sold out!");
        }
    }
}

class CustomerThread extends Thread {
    private TicketBooking booking;
    private String customerName;

    CustomerThread(TicketBooking booking, String name) {
        this.booking = booking;
        this.customerName = name;
    }

    @Override
    public void run() {
        booking.bookTicket(customerName);
    }
}

public class TicketBookingDemo {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        CustomerThread t1,t2,t3,t4,t5,t6;
                t1 = new CustomerThread(booking, "Alex");
         t2 = new CustomerThread(booking, "Aniruddha");
         t3 = new CustomerThread(booking, "Supreme");
         t4 = new CustomerThread(booking, "Dipesh");
         t5 = new CustomerThread(booking, "Aayushma");
         t6 = new CustomerThread(booking, "Bisuda");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}