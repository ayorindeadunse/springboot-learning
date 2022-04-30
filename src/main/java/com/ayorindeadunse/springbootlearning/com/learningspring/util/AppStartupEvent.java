package com.ayorindeadunse.springbootlearning.com.learningspring.util;

import com.ayorindeadunse.springbootlearning.com.learningspring.data.Room;
import com.ayorindeadunse.springbootlearning.com.learningspring.data.RoomRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    private final RoomRepository roomRepository;

    public AppStartupEvent(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
    Iterable<Room> rooms = roomRepository.findAll();
    rooms.forEach(System.out::println);
    }
}
