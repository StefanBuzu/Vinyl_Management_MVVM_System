package model;

import model.Vinyl;

import java.util.ArrayList;

public class VinylList {
    private ArrayList<Vinyl> vinyls;

    public VinylList(){
        vinyls = new ArrayList<Vinyl>();
    }
    public void add(Vinyl vinyl){
        vinyls.add(vinyl);
    }
    public void remove(int index){
        if (vinyls.size()>index){
            vinyls.remove(index);
        }
    }
    public int getSize(){
        return vinyls.size();
    }
    public void borrow(int index){
        vinyls.get(index).OnBorrow();
    }
    public void reserve(int index){
        vinyls.get(index).OnReserve();
    }
    public void onReturn(int index){
        vinyls.get(index).OnReturn();
    }
    public ArrayList<Vinyl> getAllVinyls(){
        return vinyls;
    }
}
