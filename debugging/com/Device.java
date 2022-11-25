package com.debugging.com;

public class Device implements Move{
    private int posX;
    private int posY;
    @Override
    public void moveTo(int x, int y){
        posX+=x;
        posY+=y;
        System.out.println("Move to  : "+posX+","+posY);
    }

    @Override
    public boolean canMove() {
        return true;
    }
}
