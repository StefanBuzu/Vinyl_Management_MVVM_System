package model;

public class BorrowedState implements VinylState{
    private Vinyl vinyl;
    public BorrowedState(Vinyl vinyl){
        this.vinyl = vinyl;
    }
    @Override
    public void OnReserve() {
        System.out.println("The vinyl has been reserved successfully!");
        this.vinyl.changeState(new BorrowedReservedState(this.vinyl));
    }

    @Override
    public void OnBorrow() {
        System.out.println("The vinyl is already borrowed!");
    }

    public void OnReturn(){
        System.out.println("The vinyl has been returned!");
        this.vinyl.changeState(new AvailableState(this.vinyl));
    }
    public void remove(){
        System.out.println("You can not remove the vinyl, because it is borrowed!");
    }
}
