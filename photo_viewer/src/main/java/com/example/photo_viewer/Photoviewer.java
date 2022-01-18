package com.example.photo_viewer;

import ohos.agp.animation.AnimatorProperty;
import ohos.agp.components.AttrSet;
import ohos.agp.components.Component;
import ohos.agp.components.Image;
import ohos.app.Context;
import java.util.Timer;
import java.util.TimerTask;

public class Photoviewer extends Image implements Component.ClickedListener, ohos.agp.render.render3d.Component {
        Component component;

        public Photoviewer(Context context, AttrSet attrSet) {
                super(context, attrSet);
                setClickedListener(this);
        }

        @Override
        public void onClick(Component component) {
        this.component = component;
        Timer time = new Timer();
        time.schedule(new TimerTask() {
                @Override
                public void run() {
                        AnimatorProperty animatorProperty = component.createAnimatorProperty();
                        animatorProperty.scaleX(1).scaleY(1);
                        animatorProperty.start();
                }
        }, 500);
        time.schedule(new TimerTask() {
                @Override
                public void run() {
                        AnimatorProperty animatorProperty = component.createAnimatorProperty();
                        animatorProperty.rotate(360).setDuration(1500).setTarget(component);
                        animatorProperty.start();
                }
        }, 1000);
        AnimatorProperty animatorProperty = component.createAnimatorProperty();
        animatorProperty.scaleX(5).scaleY(5);
        animatorProperty.start();
        }
}