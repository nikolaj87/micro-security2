package com.nik.jobmicroservice.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class JobJson {
    private String name;
    private String positionDescription;
}
