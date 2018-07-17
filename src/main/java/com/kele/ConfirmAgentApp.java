package com.kele;

import com.kele.service.ISignInConfirm;
import com.kele.service.SignInConfirmService;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ConfirmAgentApp {
    public static void main(String[] args){

            try {
                ISignInConfirm signInConfirm = new SignInConfirmService();
                LocateRegistry.createRegistry(9090);
                Naming.rebind("rmi://localhost:9090/signInConfirm", signInConfirm);
                System.out.println("Confirm Agent Started");
            }catch (Exception e){
                e.printStackTrace();
            }


    }
}
