package model;

public class BorrowedReservedState implements VinylState{
    private Vinyl vinyl;
    public BorrowedReservedState(Vinyl vinyl){
        this.vinyl = vinyl;
    }
    @Override
    public void OnReserve() {
        System.out.println("The vinyl can not be reserved, because it is already reserved!");
    }

    @Override
    public void OnBorrow() {
        System.out.println("The vinyl can not be borrowed at the moment!");
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
