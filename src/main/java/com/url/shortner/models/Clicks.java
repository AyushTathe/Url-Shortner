package com.url.shortner.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "clicks")
public class Clicks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serial_no;
    private String ipAddress;
    private String userAgent;
    private int clickCount = 0;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "url_id")
    private URLS url;

}
