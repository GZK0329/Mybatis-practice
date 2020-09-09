package com.gzk.pojo;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Teacher teacher;
    private String name;
    private int sid;

}
