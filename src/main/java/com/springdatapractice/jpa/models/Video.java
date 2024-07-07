package com.springdatapractice.jpa.models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Polymorphism(type= PolymorphismType.EXPLICIT)
//@PrimaryKeyJoinColumn(name = "video_id") //JOIN inheritance primary/foreign key column name
//@DiscriminatorValue("V")
public class Video extends Resource {
    private int length;
}
