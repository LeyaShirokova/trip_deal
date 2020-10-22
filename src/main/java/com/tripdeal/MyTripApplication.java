package com.tripdeal;

import com.tripdeal.models.Guide;
import com.tripdeal.models.TripRegister;
import com.tripdeal.models.TripTypes;
import com.tripdeal.models.User;
import com.tripdeal.services.guide.GuideService;
import com.tripdeal.services.tripregister.TripRegisterService;
import com.tripdeal.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

@SpringBootApplication
public class MyTripApplication implements CommandLineRunner {
    @Autowired
    UserService userService;
    @Autowired
    GuideService guideService;
    @Autowired
    TripRegisterService tripRegisterService;

    public static void main(String[] args) {
        SpringApplication.run(MyTripApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("StartApplication...");
        try {
            // testUserData();
           // testGuideData();
             testTripRegisterData();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    void testUserData() throws Throwable {
        User user =
                new User(1,"Leya","Shi","leya@gmail.com","passwordYes","TLV","Israel","054444444");
        System.out.println("[SAVE]");
        userService.save(user);
        System.out.println("[SAVE ENDING]");
        System.out.println("Get all users" + userService.findAll());
        System.out.println("Find user where id is  : " + userService.findById(1L).orElseThrow(IllegalArgumentException::new));
        System.out.println("Update password");
        user.setPassword("New33Password");
        System.out.println("Rows affected: " + userService.update(user));
        System.out.println("Delete user with id 1");
//        System.out.println("Rows affected: " + userService.deleteById(1));
//        System.out.println("Get updated list of Users: " + userService.findAll());
    }
    void testGuideData() throws Throwable {
        Guide guide = new Guide(1,"GG222S1","Welcome to Tiyoolim. Come to join us.",4);
        System.out.println("[SAVE]");
        guideService.save(guide);
        System.out.println("[SAVE ENDING]");
        System.out.println("Get all guides" + guideService.findAll());
        System.out.println("Find guide where id is 1 " + guideService.findById(1L).orElseThrow(IllegalArgumentException::new));
        System.out.println("Update description: ");
        guide.setDescriptionGuide("Hello to TravelPo. Come to join us");
        System.out.println("Rows affected: " + guideService.update(guide));
        System.out.println("Delete user with id 1");
      //  System.out.println("Rows affected: " + guideService.deleteById(1));
        System.out.println("Get updated list of Users: " + guideService.findAll());


    }
    private void testTripRegisterData() throws Throwable {
        TripRegister tripRegister = new TripRegister(1, 1, "Golan", LocalDate.of(2020,10,25), 5, TripTypes.TREKKING);
        System.out.println("[SAVE]");
        tripRegisterService.save((tripRegister));
        System.out.println("[SAVE ENDING]");
        System.out.println("Get all trip registers: " + tripRegisterService.findAll());
        System.out.println("Find trip where trip_id : " + tripRegisterService.findById(1L).orElseThrow(IllegalArgumentException::new));
        System.out.println("Update day of trip");
        tripRegister.setDateOfTrip(LocalDate.of(2021,01,01));
        tripRegisterService.update(tripRegister);
       System.out.println("Get all trip registers: " + tripRegisterService.findAll());
//        System.out.println("Delete trip with trip_id ");
//      System.out.println("Rows affected: " + tripRegisterService.deleteById(1));


    }



}
