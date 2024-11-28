package com.videostreamproject.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.videostreamproject.entities.Video;

@Service
public interface VideoService {

    // save video
    Video save(Video video,MultipartFile file);

    //get video by id
    Video get(String videoId);

    //get video by title
    Video findByTitle(String title);

    List<Video>getAll();

}
