
# Photo Viewer

## Introduction

An HMOS library that makes any image to be zoom and rotate
<p>
	<img src="photoviewer.gif" width = 800 height = 512/>
</p>



## Integration

1. For using Photoviewer module in sample app, include the source code and add the below dependencies in entry/build.gradle to generate hap/support.har.
```
    implementation fileTree(dir: 'libs', include: ['*.jar', '*.har'])
    implementation project(path: ':photo_viewer')
    testImplementation 'junit:junit:4.13'
    ohosTestImplementation 'com.huawei.ohos.testkit:runner:1.0.0.100'
```
2. For using Photoviewer module in separate application using har file, add the har file in the entry/libs folder and add the dependencies in entry/build.gradle file.
```
   implementation fileTree(dir: 'libs', include: ['*.jar'])
    testImplementation 'junit:junit:4.13'
```
3. For using Photoviewer module from a remote repository in separate application, add the below dependencies in entry/build.gradle file.
```
 implementation 'dev.applibgroup:photo_viewer:1.0.0'
 testImplementation 'junit:junit:4.13'
```

## Usage

Refer to the ability_main.xml file in the entry sample app.

Create a Image in your layout file by adding the following XML tag:

``` xml
    <com.example.photo_viewer.Photoviewer
        ohos:height="match_parent"
        ohos:width="match_parent"
        ohos:image_src="$media:img"
        ohos:clickable="true"/>
```
You can give any image of our choice by adding an image in media folder.

Path as follows:

Entry->src->main->resources->base->media

Suppose you have added image file name as (sample.png) you need to change in xml as follows:
``` xml
  ohos:image_src="$media:sample"
```

## License
```

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


```
