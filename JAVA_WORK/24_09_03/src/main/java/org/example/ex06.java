package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ex06 {
    public static void main(String[] args) throws IOException {

        Path src = Paths.get("myfile");
        Path target = Paths.get("targetfile");
        Files.copy(src,target);



    }
}