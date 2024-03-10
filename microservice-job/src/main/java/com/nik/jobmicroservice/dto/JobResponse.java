package com.nik.jobmicroservice.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class JobResponse {
    private String JobName;
    private String JobDescription;
    private String StudentName;
    private Double StudentMark;
    private String environmentPort;
}
