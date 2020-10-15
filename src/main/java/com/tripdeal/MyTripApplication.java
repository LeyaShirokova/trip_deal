package com.tripdeal;

import com.tripdeal.models.Guide;
import com.tripdeal.models.User;
import com.tripdeal.services.guide.GuideService;
import com.tripdeal.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class MyTripApplication implements CommandLineRunner {
    @Autowired
    UserService userService;
    @Autowired
    GuideService guideService;
    public static void main(String[] args) {
        SpringApplication.run(MyTripApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("StartApplication...");
        try {
           //testUserData();
            //testGuideData();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }



    void testUserData() throws Throwable {
        User user=
                 //new User(1,"Yafit","Yafit","Yafit@gmail.com","passwordYes","Ramat-Gan","Israel","054442225");
               // new User(2,"Leya","Shi","shi@gmail.com","passwordLShi","TLV","Israel","0522223344");
              //  new User(3,"Shoshana","Shalom","shoshi@gmail.com","passwordShoSham","Bat-Yam","Israel","0524444365");
                new User(4,"Haim","Moshe","hsim@gmail.com","1234","Beer-Sheva","Israel","044466655");
         System.out.println("[SAVE]");
         userService.save(user);
         System.out.println("[SAVE ENDING]");
         // find all
         System.out.println("Get all users" + userService.findAll());
         //find by id
         System.out.println("Find user where id is 2 : "+userService.findById(2L).orElseThrow(IllegalArgumentException::new));
         //update
         System.out.println("Update password");
         user.setPassword("New33Password");
         System.out.println("Rows affected: "+userService.update(user));
         //delete user by id
         System.out.println("Delete user with id 1");
         System.out.println("Rows affected: "+ userService.deleteById(1));
         // find all
         System.out.println("Get updated list of Users: "+userService.findAll());
         System.out.println("*********************************************************************************************");
    }

    void testGuideData() throws Throwable {
        Guide guide =
               // new Guide(1,"M333M54","Welcome to MUMU. Come to join us.", 5);
                //new Guide(2,"GG222S1","Welcome to Tiyoolim",4);
                //new Guide(3,"K22GG2","Best travel with us.Come to join us",3);
                new Guide(4,"HH666D34","Only our company knows the best location. Come!",4);
        System.out.println("[SAVE]");
        guideService.save(guide);
        System.out.println("[SAVE ENDING]");
         //find all
        System.out.println("Get all guides" + guideService.findAll());
        //find by id
       System.out.println("Find guide where id is 1 "+ guideService.findById(1L).orElseThrow(IllegalArgumentException::new));
        //update
        System.out.println("Update rate");
       ( guide).setRate(5);
        System.out.println("Rows affected: "+guideService.update(guide));
        //delete guide by id
        System.out.println("Delete user with id 1");
        System.out.println("Rows affected: "+ guideService.deleteById(1));
        // find all
        System.out.println("Get updated list of Users: "+guideService.findAll());
        System.out.println("*********************************************************************************************");

    }

}
