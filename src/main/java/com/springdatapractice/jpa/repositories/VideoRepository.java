package com.springdatapractice.jpa.repositories;

import com.springdatapractice.jpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Integer> {
}
