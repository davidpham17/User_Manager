package main;

import controller.DoctorManagement;
import model.User;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        
        new DoctorManagement(user).run();
    }
    
}
