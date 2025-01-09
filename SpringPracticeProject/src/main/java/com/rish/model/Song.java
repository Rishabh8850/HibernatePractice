package com.rish.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Song {
    private int songId;
    private String songName;
    private String singerName;
}
