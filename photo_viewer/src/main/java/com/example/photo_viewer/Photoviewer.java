package com.example.photo_viewer;


import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.animation.AnimatorProperty;
import ohos.agp.components.AttrSet;
import ohos.agp.components.Component;
import ohos.agp.components.Image;
import ohos.app.Context;
import ohos.global.resource.NotExistException;
import ohos.global.resource.Resource;
import ohos.global.resource.ResourceManager;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.media.image.PixelMap;
import ohos.utils.net.Uri;

import java.io.IOException;
import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;


public class Photoviewer extends Image implements Component.ClickedListener, ohos.agp.render.render3d.Component {

        private static final String TAG = Photoviewer.class.getSimpleName();

        private static final int DOMAIN = 0xD000100;

        private static final HiLogLabel LABEL = new HiLogLabel(
                HiLog.LOG_APP, DOMAIN, TAG);

        private static final String DEFAULT_SOCIAL = "facebook";

        private int imageType = 0;

        private Context d=null;

        private Optional<PixelMap> pixelMapping;
        private Component component;

        public Photoviewer(Context context) {
                super(context);
        }

        public Photoviewer(Context context, AttrSet attrSet) {
                super(context, attrSet);
                initAttr(attrSet);
                setClickedListener(this);
        }

        private void initAttr(AttrSet attrSet) {

                checkImagetype();
        }

        private void checkImagetype() {
                switch (imageType) {
                        case 0:
                                pixelMapping = getPixelMapByResId(ResourceTable.Media_img);
                                break;

                        default:
                                pixelMapping = getPixelMapByResId(ResourceTable.Media_img);
                }
        }

        private Optional<PixelMap> getPixelMapByResId(final int resourceId) {
                final ResourceManager resourceManager = getContext().getResourceManager();
                Optional<PixelMap> pixelMappingOptional = Optional.empty();
                if (resourceManager == null) {
                        return Optional.empty();
                }
                try (Resource resource = resourceManager.getResource(resourceId)) {
                        if (resource == null) {
                                HiLog.error(LABEL, "get pixelmap failed, get resource by id is null");
                                return Optional.empty();
                        }
                        pixelMappingOptional = Util.preparePixelmap(resource);
                } catch (NotExistException e) {
                        HiLog.error(LABEL, "close output failed NotExistException");
                } catch (IOException e) {
                        HiLog.error(LABEL, "close output failed IOException");
                }
                return pixelMappingOptional;
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
                },500);
                AnimatorProperty animatorProperty = component.createAnimatorProperty();
                animatorProperty.scaleX(5).scaleY(5);
                animatorProperty.start();
        }


        public void setContext(Context c)
        {
                this.d=c;
        }

        public Context getC()
        {
                return d;
        }
}