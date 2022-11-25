package com.debugging.com;

public class FieldBreakPoint {

    int count=0;
    public FieldBreakPoint(){
        count=10;
    }
    private void inc(){
        count+=10;
    }
    public int getCount(){
        return count;
    }
    public static void main(String[] args) {
    FieldBreakPoint fieldBreakPoint=new FieldBreakPoint();
    fieldBreakPoint.inc();
        System.out.println(fieldBreakPoint.getCount());
    }
}
