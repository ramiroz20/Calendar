package com.company;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

class MyClass {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // получаем текущую дату



    }
}

@Builder(toBuilder = true)
@Getter
@ToString
public class FileInfo {

    private Long id;

    private String name;

    private Long size;

    private String key;

    private LocalDate uploadDate;
}