package model;

import java.util.ArrayList;

public class ModelManager {
    private ArrayList<User> users;
    private VinylList vinylList;

    public ModelManager(){
        users = new ArrayList<User>();
        vinylList = new VinylList();
    }
    public User getUser(String firstName){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getFirstName().equals(firstName)){
                return users.get(i);
            }
        } return null;
    }
    public void Users(){
        users.add(new User("Bob","Bobson", vinylList));
        users.add(new User("Wendy","Wendys",vinylList));
    }
    public void VinylCollection(){
        vinylList.add(new Vinyl("The Hounds Of Love", "Kate Bush", 1980));
        vinylList.add(new Vinyl("Dark Side Of The Moon", "Pink Floyd", 1973));
        vinylList.add(new Vinyl("Kind of Blue", "Miles Davis", 1959));
        vinylList.add(new Vinyl("The Doors", "The Doors", 1967));
        vinylList.add(new Vinyl("Fleetwood Mac", "Rumours", 1977));
        vinylList.add(new Vinyl("Thriller", "Michael Jackson", 1982));
        vinylList.add(new Vinyl("What’s The Story Morning Glory", "Oasis", 1995));
        vinylList.add(new Vinyl("Elephant", "The White Stripes", 2003));
        vinylList.add(new Vinyl("After The Gold Rush", "Neil Young", 1970));
        vinylList.add(new Vinyl("Sticky Fingers", "The Rolling Stones", 1971));
        vinylList.add(new Vinyl("Electric Warrior", "T-Rex", 1971));
    }
}
