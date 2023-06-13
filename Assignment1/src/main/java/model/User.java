package model;

public class User implements Runnable{
    private String firstName;
    private String lastName;
    private VinylList vinylList;

    public User(String firstName, String lastName, VinylList vinylList){
        this.firstName = firstName;
        this.lastName = lastName;
        this.vinylList = vinylList;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public void run() {

    }
}
