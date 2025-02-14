package com.cybage;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 

import com.cybage.model.Users;
import com.cybage.repository.UsersRepository;

 

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{

 

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }
    
    @Autowired
    UsersRepository ur;

 

    @Override
    public void run(String... args) throws Exception {
//		ur.save(new Users(1, "adit1", "adit1", "user"));
//		ur.save(new Users(2, "adit2", "adit2", "user"));
//		ur.save(new Users(3, "adit3", "adit3", "user"));
//		ur.save(new Users(4, "adit4", "adit4", "user"));
//		ur.save(new Users(5, "admin", "admin", "admin"));       
    }
    
}