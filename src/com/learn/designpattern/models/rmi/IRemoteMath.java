package com.learn.designpattern.models.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by zhengxc on 2019/9/23.
 */
public interface IRemoteMath extends Remote{

    public ResponseDto add(RequestDto requestDto) throws RemoteException;

    public ResponseDto subtract(RequestDto requestDto) throws RemoteException;

}
