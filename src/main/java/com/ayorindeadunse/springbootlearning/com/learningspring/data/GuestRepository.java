package com.ayorindeadunse.springbootlearning.com.learningspring.data;

import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest,Long> {
}
