package com.dilarasahin.muziklistem;

import android.media.MediaPlayer;
import android.widget.ImageView;

import java.io.Serializable;

public class Icerik implements Serializable {
    int image;
    String kimeait;
    String sarkiisim;

    public Icerik(int image, String kimeait, String sarkiisim) {
        this.image = image;
        this.kimeait = kimeait;
        this.sarkiisim = sarkiisim;
    }
  

}

