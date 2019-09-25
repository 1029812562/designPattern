package com.learn.designpattern.decorate;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 此处UpCaseInputStream继承了InputStream接口另外字节流也会继承该接口
 *
 * @author zhengxc
 * @date 2019/9/19
 */
public class UpCaseInputStream extends FilterInputStream {

    protected UpCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read(byte[] b) throws IOException {
        int c = super.read(b);
        for (int i = 0; i < b.length; i++) {
            int orgin = b[i];
            b[i] = (byte) Character.toUpperCase(orgin);
        }
        return c;
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1) ? -1 : Character.toUpperCase(c);
    }
}
