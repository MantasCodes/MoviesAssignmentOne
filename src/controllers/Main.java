package controllers;

import asg.cliche.Command;
import asg.cliche.ShellFactory;
import cliche.sample.Sample;
import cliche.sample.Sampletoo;
import models.User;

import java.io.IOException;
import java.util.Collection;

public class Main {

    @Command// first
   public Collection<User> createUser() {
    	
    
   MovandUserAPI MovandUserAPI = new MovandUserAPI();

    MovandUserAPI.createUser("Bart", "Simpson",45,   "male", "plantworker");
    MovandUserAPI.createUser("Homer", "Simpson",12,  "male", "student");
    MovandUserAPI.createUser("Lisa", "Simpson",11,  "female", "student");

    Collection<User> users = MovandUserAPI.getUsers();
    System.out.println(users);
	return users; //return the Collection of users 
    }

    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("hello", "Just type in '?list' to see all of the commands",
        		new Sampletoo()).commandLoop(); // and three.
        
            ShellFactory.createConsoleShell("cliche> ", "Enter '?list' to list all commands",
                    new Sample()).commandLoop();
        }
    }
