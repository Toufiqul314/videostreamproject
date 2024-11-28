package com.videostreamproject.services.impl;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.videostreamproject.entities.Video;
import com.videostreamproject.services.VideoService;

public class VideoServiceImpl implements VideoService {

    @Override
    public Video save(Video video, MultipartFile file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Video get(String videoId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Video findByTitle(String title) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Video> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
