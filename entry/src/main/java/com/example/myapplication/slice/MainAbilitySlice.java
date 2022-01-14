package com.example.myapplication.slice;
        import com.example.myapplication.ResourceTable;
        import com.example.photo_viewer.Photoviewer;
        import ohos.aafwk.ability.AbilitySlice;
        import ohos.aafwk.content.Intent;
public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        Photoviewer s = (Photoviewer) findComponentById(ResourceTable.Id_image);
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


