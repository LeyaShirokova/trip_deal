package com.tripdeal;

import com.tripdeal.models.Customer;
import com.tripdeal.models.Guide;
import com.tripdeal.models.User;
import com.tripdeal.services.guide.GuideService;
import com.tripdeal.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
         //  testUserData();
           // testGuideData();
            testCustomerData();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private void testCustomerData() {
        
    }

    void testUserData() throws Throwable {
        User user=
                 new User(1,"Yafit","Yafit","Yafit@gmail.com","passwordYes","Ramat-Gan","Israel","054442225");
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
         System.out.println("Delete user with id 4");
         System.out.println("Rows affected: "+ userService.deleteById(4));
         // find all
         System.out.println("Get updated list of Users: "+userService.findAll());
         System.out.println("*********************************************************************************************");
    }

    void testGuideData() throws Throwable {
        Guide guide =
                new Guide(1,"M333M54","Welcome to MUMU. Come to join us.", 5);
        System.out.println("[SAVE]");
        guideService.save(guide);
        System.out.println("[SAVE ENDING]");
         //find all
        System.out.println("Get all guides" + guideService.findAll());
        //find by id
//        System.out.println("Find guide where id is 1 "+ guideService.findById(1L).orElseThrow(IllegalArgumentException::new));
        //update
        System.out.println("Update rate");
       ( guide).setRate(4);
        System.out.println("Rows affected: "+guideService.update(guide));
        //delete guide by id
        System.out.println("Delete user with id 2");
        System.out.println("Rows affected: "+ guideService.deleteById(1));
        // find all
        System.out.println("Get updated list of Users: "+guideService.findAll());
        System.out.println("*********************************************************************************************");

    }

}
