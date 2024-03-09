package com.nik.microservicestudent.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StudentJson {
    private String name;
    private Double mark;
}


