/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.User;
import java.util.ArrayList;

/**
 *
 * @author Zeii
 */
public class UserData {
    
//variable global que simula una base de datos
    static ArrayList<User> users;

    public UserData() {
        super();
        users = new ArrayList<>();
    }

    public void insertUser(User user) {

        users.add(user);
    }

    public void removeCustomer(User user) {

        users.remove(user);
    }

    public ArrayList<User> getAllCustomers() {

        return users;

    }

    public User[] getAllCustomersArray() {

        User[] usersArray = new User[users.size()];

        for (int i = 0; i < usersArray.length; i++) {

            usersArray[i] = users.get(i);
        }
        return usersArray;

    }

    public User findUserByName(String userName) {

        User user= new User() {
        } ;

        for (User currentUser : users) {

            if (currentUser.getName().equalsIgnoreCase(userName)) {

                user = currentUser;
            }
        }
        return user;
    }

}

