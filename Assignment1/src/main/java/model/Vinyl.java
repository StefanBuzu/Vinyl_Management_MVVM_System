package model;

public class Vinyl {
    private String title;
    private String artist;
    private int year;
    private VinylState state;
    private boolean isRemoved;

    public Vinyl(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.isRemoved = false;
        this.state = new AvailableState(this);
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getArtist() {
        return artist;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public boolean getIsRemoved(){
        return isRemoved;
    }
    public void setRemoved(boolean isRemoved){
        this.isRemoved = isRemoved;
    }
    public void OnReserve(){
    this.state.OnReserve();
    }
    public void OnBorrow(){
    this.state.OnBorrow();
    }
    public void OnReturn(){
    this.state.OnReturn();
    }
    public void changeState(VinylState state){
        this.state = state;
    }
    public void remove(){
        this.state.remove();
    }
}
