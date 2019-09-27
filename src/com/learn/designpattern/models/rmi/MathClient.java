package com.learn.designpattern.models.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class MathClient {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            IRemoteMath remoteMath = (IRemoteMath)registry.lookup("compute");
            RequestDto requestDto = new RequestDto();
            MathRequest mathRequest = new MathRequest();
            mathRequest.setRequestNum1(1);
            mathRequest.setRequestNum2(2);
            requestDto.setRequest(mathRequest);
            ResponseDto responseDto = remoteMath.add(requestDto);
            System.out.println(responseDto);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }

    }

}
