package com.ayorindeadunse.springbootlearning.com.learningspring.data;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends CrudRepository<Reservation,Long> {
    List<Reservation> getReservationsByDate(Date res_date);
}
