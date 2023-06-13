package model;

public class AvailableState implements VinylState{
    private Vinyl vinyl;
    public AvailableState(Vinyl vinyl){
        this.vinyl = vinyl;
    }
    public void OnReserve(){
        System.out.println("The game has been reserved!");
        this.vinyl.changeState(new ReservedState(this.vinyl));
    }

    @Override
    public void OnBorrow() {
        System.out.println("The vinyl was borrowed!");
        vinyl.changeState(new BorrowedState(vinyl));
    }

    @Override
    public void OnReturn() {
        System.out.println("The vinyl can not be returned, because it is available!");
    }

    public void remove(){
        System.out.println("The vinyl was removed!");
        vinyl.setRemoved(true);
    }
}
