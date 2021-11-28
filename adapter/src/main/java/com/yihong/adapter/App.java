package com.yihong.adapter;

public class App {
    public App() {

    }

    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
