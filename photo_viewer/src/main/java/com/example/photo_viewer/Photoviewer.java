package com.example.photo_viewer;

import ohos.agp.components.Image;
import ohos.agp.components.Slider;

public class Photoviewer {
public void onClick(Slider s, Image img){
    s.setValueChangedListener(new Slider.ValueChangedListener() {
        @Override
        public void onProgressUpdated(Slider slider, int i, boolean b) {
            float scale=((i/100.0f)+1);
            img.setScaleX(scale);
            img.setScaleY(scale);

        }

        @Override
        public void onTouchStart(Slider slider) {

        }

        @Override
        public void onTouchEnd(Slider slider) {

        }
    });
}

}
