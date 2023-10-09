package com.example.effectivejava.chapter4;

import java.applet.AudioClip;
import java.io.File;

public class Wp implements Singer, Songwriter{

    @Override
    public AudioClip sing(File file) {
        return null;
    }

    @Override
    public File compose(int chartPosition) {
        return null;
    }
}
