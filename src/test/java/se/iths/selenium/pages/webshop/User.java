package se.iths.selenium.pages.webshop;

public class User {

    String username;
    String password;
    String phone;

    public static User slaskUser(){
        return new User("slask@apa.se", "slask", "070123678");
    }

    private User(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
