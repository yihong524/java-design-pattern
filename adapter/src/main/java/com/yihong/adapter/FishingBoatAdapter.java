package com.yihong.adapter;

public class FishingBoatAdapter implements RowingBoat {
    private final FishingBoat fishingBoat = new FishingBoat();

    public final void row() {
        fishingBoat.sail();
    }

}
