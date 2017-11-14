package client;

import java.rmi.Naming;

import rmi.RmiServerIntf;

public class RmiClient { 
    public static void main(String args[]) throws Exception {
        RmiServerIntf obj = (RmiServerIntf)Naming.lookup("//localhost:1099/RmiServer");
//        for(int i = 0; i < 20; i ++){
//        	System.out.println(obj.getMessage()); 
//        }
        System.err.println(obj.increaseAndGet(20));
    }
}
