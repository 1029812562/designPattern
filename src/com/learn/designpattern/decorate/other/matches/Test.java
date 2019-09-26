package com.learn.designpattern.decorate.other.matches;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

/**
 * Created by zhengxc on 2019/9/26.
 */
public class Test {

    public static void main(String[] args) {
        //获取项目中所有导入的类型
        java.io.File file = new java.io.File("F:\\code\\github\\designPattern\\src\\com\\learn\\designpattern");
        List<File> allFile = new ArrayList<>();
        initAllFiles(file, allFile);
        String regex = "[\\s]*import[\\s]+(java\\.[a-zA-Z\\.]+)[\\s]*;";
        Pattern pattern = Pattern.compile(regex);
        for (File fileResovle : allFile) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileResovle));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    Matcher matcher = pattern.matcher(line);
                    while (matcher.find()) {
                        System.out.println(matcher.group(1));
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private static void initAllFiles(File file, List<File> files) {
        if (file.isDirectory()) {
            java.io.File[] childFiles = file.listFiles();
            for (int i = 0; i < childFiles.length; i++) {
                java.io.File childFile = childFiles[i];
                initAllFiles(childFile, files);
            }
        } else {
            files.add(file);
        }
    }

}
