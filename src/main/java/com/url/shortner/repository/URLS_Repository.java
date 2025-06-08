package com.url.shortner.repository;

import com.url.shortner.models.URLS;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.URL;
import java.util.List;
import java.util.Optional;

public interface URLS_Repository  extends JpaRepository<URLS,Long> {
    Optional<URLS> findByShortUrl(String shortUrl);
    List<URLS> findAllByUser_UserId(Long userId);
    boolean existsByShortUrl(String shortUrl);
}
