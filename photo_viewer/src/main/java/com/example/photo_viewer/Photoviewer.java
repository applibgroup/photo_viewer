/*
        Copyright (C) 2020-21 Application Library Engineering Group

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
 */
package com.example.photo_viewer;
import ohos.agp.animation.AnimatorProperty;
import ohos.agp.components.AttrSet;
import ohos.agp.components.Component;
import ohos.agp.components.Image;
import ohos.app.Context;
import java.util.Timer;
import java.util.TimerTask;
public class Photoviewer extends Image implements Component.ClickedListener, ohos.agp.render.render3d.Component {
       public Component component;
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