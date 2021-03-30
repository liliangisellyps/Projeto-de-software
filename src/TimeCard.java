package src;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

import jdk.vm.ci.meta.Local;

public class TimeCard extends Employee {
    LocalTime checkIn;
    LocalTime checkOut;
    LocalDate date;
}
