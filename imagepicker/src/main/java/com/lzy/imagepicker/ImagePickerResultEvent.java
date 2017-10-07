package com.lzy.imagepicker;

import com.lzy.imagepicker.bean.ImageItem;

import java.util.ArrayList;

/**
 * Copyright © 2017 Worktile. All Rights Reserved.
 * Author: Moki
 * Email: mosicou@gmail.com
 * Date: 2017/10/7
 * Time: 14:25
 * Desc:
 */
public class ImagePickerResultEvent {
    private ArrayList<ImageItem> result;

    public ImagePickerResultEvent(ArrayList<ImageItem> result) {
        this.result = result;
    }

    public ArrayList<ImageItem> getResult() {
        return result;
    }

    public void setResult(ArrayList<ImageItem> result) {
        this.result = result;
    }
}
