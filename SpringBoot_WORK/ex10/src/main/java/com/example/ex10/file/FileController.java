package com.example.ex10.file;

import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

@RestController
@RequestMapping("file")
@CrossOrigin
public class FileController {

    // Path
    private final Path imagepath;

    // Path의 생성자를 만들어 준다.
    public FileController() {
        this.imagepath = Paths.get("ex10/images/file/").toAbsolutePath();

        try{
            Files.createDirectories(this.imagepath);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @GetMapping("test")
    public String test(){

        return "test";
    }

    @PostMapping(value = "upload", produces = MediaType.APPLICATION_JSON_VALUE)
    public String upload(@RequestPart(name="file")MultipartFile file,
                         @RequestPart(name="fileDto")HashMap<String, String>map){
        System.out.println(file);
        System.out.println(map);

        return "upload";
    }


    @Data
    class FileDto{
        private String name;
    }

}