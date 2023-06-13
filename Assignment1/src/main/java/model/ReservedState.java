package model;

public class ReservedState implements VinylState{
    private Vinyl vinyl;
    public ReservedState(Vinyl vinyl){
        this.vinyl = vinyl;
    }
    @Override
    public void OnReserve() {
        System.out.println("The vinyl is already reserved!");
    }
    public void OnBorrow(){
        System.out.println("The game has been borrowed!");
        this.vinyl.changeState(new BorrowedState(this.vinyl));
    }

    @Override
    public void OnReturn() {
        System.out.println("The vinyl has been returned!");
        vinyl.changeState(new AvailableState(vinyl));
    }
    public void remove(){
        System.out.println("The vinyl can not be removed at the moment!");
    }
}
