package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class Proerties {
    private static HashMap<String,String> proretiesHash = new HashMap<>();

    public static HashMap<String,String> Read(String path){
        File file = new File(path);
        FileInputStream fileinput = null;
        Properties pros = new Properties();
        try {
            fileinput = new FileInputStream(file);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            assert fileinput != null;
            pros.load(fileinput);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Enumeration keys = pros.keys();
        while (keys.hasMoreElements()){
            String key = (String) keys.nextElement();
            String Value = pros.getProperty(key);
            proretiesHash.put(key,Value);
        }
        return  proretiesHash;
    }
}
