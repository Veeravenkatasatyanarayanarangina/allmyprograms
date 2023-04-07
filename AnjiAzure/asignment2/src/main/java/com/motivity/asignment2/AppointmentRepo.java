package com.motivity.asignment2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Repository
public interface AppointmentRepo extends JpaRepository<AppointmentSlot,Integer> {
    AppointmentSlot findByTime(LocalDateTime localDateTime);
}
