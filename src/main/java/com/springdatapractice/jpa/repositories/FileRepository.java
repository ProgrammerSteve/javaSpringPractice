package com.springdatapractice.jpa.repositories;

import com.springdatapractice.jpa.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Integer> {
}
