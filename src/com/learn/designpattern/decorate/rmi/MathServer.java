package com.learn.designpattern.decorate.rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class MathServer {

    public static void main(String[] args) {
        IRemoteMath remoteMath = null;
        try {
            remoteMath = new RemoteMathServiceImpl();
            LocateRegistry.createRegistry(1099);
            LocateRegistry.getRegistry().bind("compute", remoteMath);
            System.out.println("server ok");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

    }

}
