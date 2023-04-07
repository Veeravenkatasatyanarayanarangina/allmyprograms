package com.motivity.asignment2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

import java.time.LocalDateTime;
@Entity
@Data
public class AppointmentSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime time;
    private boolean available;

    public AppointmentSlot() {
    }

    public AppointmentSlot(int id, LocalDateTime time, boolean available) {
        this.id = id;
        this.time = time;
        this.available = available;
    }


    @Override
    public String toString() {
        return "AppointmentSlot{" +
                "id=" + id +
                ", time=" + time +
                ", available=" + available +
                '}';
    }
}
