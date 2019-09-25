package com.learn.designpattern.decorate.rmi;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class RemoteMathServiceImpl extends UnicastRemoteObject implements IRemoteMath{

    protected RemoteMathServiceImpl() throws RemoteException {
    }


    @Override
    public ResponseDto add(RequestDto requestDto) throws RemoteException {
        ResponseDto responseDto = new ResponseDto();
        MathResponse mathResponse = new MathResponse();
        mathResponse.setResultNum(requestDto.getRequest().getRequestNum1() + requestDto.getRequest().getRequestNum2());
        responseDto.setResponse(mathResponse);
        return responseDto;
    }

    @Override
    public ResponseDto subtract(RequestDto requestDto) throws RemoteException {
        ResponseDto responseDto = new ResponseDto();
        MathResponse mathResponse = new MathResponse();
        mathResponse.setResultNum(requestDto.getRequest().getRequestNum1()-requestDto.getRequest().getRequestNum2());
        responseDto.setResponse(mathResponse);
        return responseDto;
    }
}
