package client;

import java.rmi.Naming;

import rmi.RmiServerIntf;

public class RmiClient { 
    public static void main(String args[]) throws Exception {
        RmiServerIntf obj = (RmiServerIntf)Naming.lookup("//120.76.208.28:1099/RmiServer");
//        RmiServerIntf obj = (RmiServerIntf)Naming.lookup("//localhost:1099/RmiServer");
        System.out.println(obj.getMessage()); 
    }
}
