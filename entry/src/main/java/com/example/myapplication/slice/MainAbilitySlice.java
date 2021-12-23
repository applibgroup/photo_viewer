package com.example.myapplication.slice;

        import com.example.myapplication.ResourceTable;
        import com.example.photo_viewer.Photoviewer;
        import ohos.aafwk.ability.AbilitySlice;
        import ohos.aafwk.content.Intent;
        import ohos.agp.animation.AnimatorProperty;
        import ohos.agp.components.Image;
        import ohos.agp.components.Slider;
        import ohos.agp.components.Text;

public class MainAbilitySlice extends AbilitySlice {
    AnimatorProperty animatorProperty;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        Photoviewer P = (Photoviewer) findComponentById(ResourceTable.Id_image_img);
        P.setContext(this);


    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

}





//        Text t=(Text)findComponentById(ResourceTable.Id_text_zoom);
//        Slider s=(Slider)findComponentById(ResourceTable.Id_slider_seek);
//        Image img=(Image)findComponentById(ResourceTable.Id_image_img);
//        float zoom= (float) 0.0;
//        t.setText("Zoom = "+String.valueOf(zoom)+"%");
//        s.setValueChangedListener(new Slider.ValueChangedListener() {
//            @Override
//            public void onProgressUpdated(Slider slider, int i, boolean b) {
//                float scale=((i/100.0f)+1);
//                img.setScaleX(scale);
//                img.setScaleY(scale);
//                t.setText("Zoom = "+String.valueOf((scale-1)*100)+"%");
//
//            }
//
//            @Override
//            public void onTouchStart(Slider slider) {
//
//            }
//
//            @Override
//            public void onTouchEnd(Slider slider) {
//
//            }
//        });

