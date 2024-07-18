package org.example.aa;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class Student {

    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student(String  name,
                   int kor,
                   int eng,
                   int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }




}
