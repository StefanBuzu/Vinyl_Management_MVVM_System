package model;

public interface VinylState{
    void OnReserve();
    void OnBorrow();
    void OnReturn();
    void remove();
}
