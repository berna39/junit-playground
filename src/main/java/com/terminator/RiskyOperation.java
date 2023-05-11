package com.terminator;

public class RiskyOperation {

    public void jumpFromPlane(Boolean can) throws Exception{
        if(can) throw new Exception("Hey! Good Luck");
        System.out.println("Stay safe");
    }
}
