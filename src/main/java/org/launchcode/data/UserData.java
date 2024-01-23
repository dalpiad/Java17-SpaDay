package org.launchcode.data;

import org.launchcode.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    List<User> users = new ArrayList();

    public void add (User user){
        users.add(user);
    }

    public List<User> getAll(){
        return users;
    }

    public User getById (int id) {
        for(User user : users) {
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }


}
