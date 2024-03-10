package com.nik.jobmicroservice.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StudentDto {
    private Long id;
    private String name;
    private Double mark;
}