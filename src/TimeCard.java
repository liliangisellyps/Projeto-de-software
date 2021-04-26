package src;
import java.time.LocalDate;
import java.time.LocalTime;

public class TimeCard {
    LocalTime checkIn;
    LocalTime checkOut;
    LocalDate date;
    
    public TimeCard(LocalTime checkIn, LocalTime checkOut, LocalDate date) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.date = date;
    }
    
    public void setCheckIn(LocalTime checkIn) {
        this.checkIn = checkIn;
    }
    public LocalTime getCheckIn() {
        return checkIn;
    }
    public void setCheckOut(LocalTime checkOut) {
        this.checkOut = checkOut;
    }
    public LocalTime getCheckOut() {
        return checkOut;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalDate getDate() {
        return date;
    }
}
