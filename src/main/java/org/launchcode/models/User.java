package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {

    @NotNull
    @Size(min = 5, max = 15, message = "The username must be between 5 and 15 characters.")
    private String username;

    @Email
    private String email;

    @NotNull
    @Size(min = 6, message = "The password must be at least 6 characters long.")
    private String password;

    @NotNull(message = "Passwords must match.")
    private String verifyPassword;

    private int id;
    private static int nextId = 1;

    public User() {
        this.id = nextId;
        nextId++;
    }

    public User(String username, String email, String password, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }

    private void checkPassword(){
        if (password != null && verifyPassword != null && !(password.equals(verifyPassword))) {
            verifyPassword = null;
        }
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }
}

