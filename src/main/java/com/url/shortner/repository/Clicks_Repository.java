package com.url.shortner.repository;

import com.url.shortner.models.Clicks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Clicks_Repository extends JpaRepository<Clicks, Long> {
    List<Clicks> findAllByUrl_ShortUrl(String shortUrl);
}
