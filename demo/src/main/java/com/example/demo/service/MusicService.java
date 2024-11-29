package com.example.demo.service;

import com.example.demo.client.DeezerClient;
import org.springframework.stereotype.Service;

@Service
public class MusicService {

    private final DeezerClient deezerClient;

    public MusicService(DeezerClient deezerClient) {
        this.deezerClient = deezerClient;
    }

    public Object searchMusic(String query) {
        // Appelle l'API externe via Feign
        return deezerClient.searchMusic(query).getBody();
    }
}
