package com.url.shortner.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "urls")
public class URLS {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String original_url;

 @Column(unique = true)
 private String shortUrl;

 private LocalDateTime created_at;
 private LocalDateTime expire_at;

 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name = "userId")
 private User user;

 @OneToMany(mappedBy = "url" , cascade = CascadeType.ALL)
 private List<Clicks> clickEvent;
}
