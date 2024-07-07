package com.springdatapractice.jpa.models;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;



@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Lecture extends BaseEntity{

    private String name;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;


    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;
}
