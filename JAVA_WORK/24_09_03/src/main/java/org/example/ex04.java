package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class ex04 {

    public static void main(String[] args) throws IOException {
        Path fp = Paths.get("d:/a/b/newnewtest");

        // 파일 존재 유무
        boolean test = Files.exists(fp);
        System.out.println("파일 존재 유무 ="+test);
        
        // 파일이 있으면 creatfile 하면 안되고;
        // 파일이 없으면 createfile 해야하고
        if(!test)
            fp = Files.createFile(fp);

        byte []buf = {0x15, 0x16, 0x17};
        System.out.println(Arrays.toString(buf));

        Files.write(fp,buf, StandardOpenOption.APPEND);

        byte []buf2 = Files.readAllBytes(fp);
        System.out.println(buf2);



    }
}