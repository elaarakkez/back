package com.example.demo.controller;

import com.example.demo.service.MusicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/music")
public class MusicController {

    private final MusicService musicService;

    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchMusic(@RequestParam String query) {
        // Appelle le service pour effectuer la recherche
        return ResponseEntity.ok(musicService.searchMusic(query));
    }
}
