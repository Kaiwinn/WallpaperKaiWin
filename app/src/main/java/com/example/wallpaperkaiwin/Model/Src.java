package com.example.wallpaperkaiwin.Model;

public class Src {
    public String original;
    public String large2x;
    public String large;
    public String medium;
    public String small;
    public String portrait;
    public String landscape;
    public String tiny;

    public Src(String original, String large2x,
               String large, String medium, String small,
               String portrait, String landscape, String tiny) {
        this.original = original;
        this.large2x = large2x;
        this.large = large;
        this.medium = medium;
        this.small = small;
        this.portrait = portrait;
        this.landscape = landscape;
        this.tiny = tiny;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getLarge2x() {
        return large2x;
    }

    public void setLarge2x(String large2x) {
        this.large2x = large2x;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getLandscape() {
        return landscape;
    }

    public void setLandscape(String landscape) {
        this.landscape = landscape;
    }

    public String getTiny() {
        return tiny;
    }

    public void setTiny(String tiny) {
        this.tiny = tiny;
    }
}
