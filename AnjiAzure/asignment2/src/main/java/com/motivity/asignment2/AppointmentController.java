package com.motivity.asignment2;

import com.twilio.Twilio;
import com.twilio.rest.verify.v2.service.Verification;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@CrossOrigin("http://localhost:3000/")
@RestController
@Slf4j
public class AppointmentController {
    @Autowired
    AppointmentRepo appointmentRepo;

    @GetMapping("/appointment-slots")
    public List<AppointmentSlot> getAppointmentSlots() {
        List<AppointmentSlot> appointmentSlots = new ArrayList<>();
        LocalDateTime localDate=LocalDateTime.now().plusDays(1).withHour(9).withMinute(0).withSecond(0).withNano(0);
        System.out.println(localDate);
        LocalDateTime startTime = LocalDateTime.now().plusDays(1).withHour(9).withMinute(0).withSecond(0).withNano(0);
        LocalDateTime endTime = startTime.plusHours(8);
        if(appointmentRepo.findByTime(localDate)!=null){

            while (startTime.isBefore(endTime)) {
                appointmentSlots.add(appointmentRepo.findByTime(startTime));
                startTime = startTime.plusHours(1);
            }
        }
        else{
            while (startTime.isBefore(endTime)) {
                AppointmentSlot slot = new AppointmentSlot();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
                String formattedDateTime = startTime.format(formatter);
                System.out.println(formattedDateTime.length()+" "+formattedDateTime);
                LocalDateTime localDateTime=LocalDateTime.of(
                        Integer.parseInt(formattedDateTime.substring(0,4)),
                        Integer.parseInt(formattedDateTime.substring(5,7)),
                        Integer.parseInt(formattedDateTime.substring(8,10)),
                        Integer.parseInt( formattedDateTime.substring(11,13)),
                        Integer.parseInt( formattedDateTime.substring(14,16)));
                slot.setTime(localDateTime);
                slot.setAvailable(true);
                appointmentSlots.add(appointmentRepo.save(slot));
                startTime = startTime.plusHours(1);
            }
        }
        return appointmentSlots;
    }
    @PostMapping("book-slot")
    public AppointmentSlot bookSlot(@RequestBody AppointmentSlot appointmentSlot){
        AppointmentSlot appointmentSlot1=appointmentRepo.findById(appointmentSlot.getId()).get();
        if(appointmentSlot1.isAvailable()==true){
            System.out.println(appointmentSlot1.getTime().getDayOfWeek());
            appointmentSlot1.setAvailable(false);
            appointmentSlot=appointmentRepo.save(appointmentSlot1);
        }

        return  appointmentSlot;
    }
    @PostMapping("calender")
    public List<AppointmentSlot> createslots(@RequestBody String date){
        List<AppointmentSlot> appointmentSlots = new ArrayList<>();
        String str=date.substring(0,10);
        String[] arr= str.split("-");
        LocalDate localDate=LocalDate.of(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2]));

        LocalTime time=LocalTime.of(9,0,0,0);

        LocalDateTime localDateTime=LocalDateTime.of(localDate,time);
        LocalDateTime endTime = localDateTime.plusHours(8);
        if(appointmentRepo.findByTime(localDateTime)!=null){
            while (localDateTime.isBefore(endTime)) {
                appointmentSlots.add(appointmentRepo.findByTime(localDateTime));
                localDateTime = localDateTime.plusHours(1);
            }
        }
        else{
            while (localDateTime.isBefore(endTime)) {
                AppointmentSlot slot = new AppointmentSlot();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
                String formattedDateTime = localDateTime.format(formatter);
                System.out.println(formattedDateTime.length()+" "+formattedDateTime);
                LocalDateTime localDateTime1=LocalDateTime.of(
                        Integer.parseInt(formattedDateTime.substring(0,4)),
                        Integer.parseInt(formattedDateTime.substring(5,7)),
                        Integer.parseInt(formattedDateTime.substring(8,10)),
                        Integer.parseInt( formattedDateTime.substring(11,13)),
                        Integer.parseInt( formattedDateTime.substring(14,16)));
                slot.setTime(localDateTime1);
                slot.setAvailable(true);
                appointmentSlots.add(appointmentRepo.save(slot));
                localDateTime = localDateTime.plusHours(1);
            }
        }
        return appointmentSlots;
    }
    @GetMapping("/sample")
    public RedirectView redirect(){
        return new RedirectView("http://localhost:3000/sample");
    }



    @GetMapping(value = "/generateOTP")
    public ResponseEntity<String> generateOTP(){

        Twilio.init(System.getenv("TWILIO_ACCOUNT_SID"), System.getenv("TWILIO_AUTH_TOKEN"));

        Verification verification = Verification.creator(
                        "VAXXXXXXXXXX", // this is your verification sid
                        "+1555XXXXXXX", //this is your Twilio verified recipient phone number
                        "sms") // this is your channel type
                .create();

        System.out.println(verification.getStatus());

        log.info("OTP has been successfully generated, and awaits your verification {}", LocalDateTime.now());

        return new ResponseEntity<>("Your OTP has been sent to your verified phone number", HttpStatus.OK);
    }
}