// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package io.flutter.plugins.camera.features.intfeature;

import android.hardware.camera2.CaptureRequest;
import io.flutter.plugins.camera.CameraProperties;
import io.flutter.plugins.camera.features.CameraFeature;

/** Used to control the fps, videoBitrate and audioBitrate configuration on the {@link android.hardware.camera2} API. */
public class IntFeature extends CameraFeature<Integer> {

  private Integer currentValue;

  public IntFeature(@NonNull CameraProperties cameraProperties, @NonNull Integer value) {
    super(cameraProperties);
    currentValue = value;
  }

  @Override
  public @NonNull String getDebugName() {
    return "IntFeature";
  }

  @Override
  public @NonNull Integer getValue() {
    return currentValue;
  }

  @Override
  public void setValue(@NonNull Integer value) {
    currentValue = value;
  }

  @Override
  public boolean checkIsSupported() {
    return true;
  }

  @Override
  public void updateBuilder(@NonNull CaptureRequest.Builder requestBuilder) {}
}
