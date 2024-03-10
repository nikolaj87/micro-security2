package com.nik.microservicestudent.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StudentResponse {
    private Long id;
    private String name;
    private Double mark;
    private String port;
}

