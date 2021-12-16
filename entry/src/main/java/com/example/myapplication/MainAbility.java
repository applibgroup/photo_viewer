package com.example.myapplication;

import com.example.myapplication.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Image;
import ohos.agp.components.Slider;
import ohos.global.resource.Resource;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
        Slider s=(Slider)findComponentById(ResourceTable.Id_slider_seek);
        Image img=(Image)findComponentById(ResourceTable.Id_image_img);
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
