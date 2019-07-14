package org.davidsciacchettano.services.web.musicapi.service.impl;

import org.davidsciacchettano.services.web.musicapi.service.MusicFileService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class MusicFileServiceImpl implements MusicFileService {

    @Override
    @Scheduled(cron = "*/1 * * * * *")
    public void findFiles() {
        System.out.println("Starting a search for music files in the file system:" + Instant.now());
    }
}
