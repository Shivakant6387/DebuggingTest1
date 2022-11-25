package com.debugging.com;

public class percel {
    public static void callMethod(Object obj)throws Exception{
        obj.getClass()
                .getMethod("canMove")
                .invoke(obj);

    }
    public static void main(String[]args) throws Exception {
        Device mobile= new Device();
        mobile.moveTo(10,20);
        callMethod(mobile);
    }
}
