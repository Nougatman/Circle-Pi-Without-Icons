package com.material.dashboard.candybar.sample.nougatman.iconpack.circlepi.activities;

import android.support.annotation.NonNull;

import com.dm.material.dashboard.candybar.activities.CandyBarMuzeiActivity;
import com.material.dashboard.candybar.sample.nougatman.iconpack.circlepi.services.MuzeiService;

public class MuzeiActivity extends CandyBarMuzeiActivity {

    @NonNull
    @Override
    public Class<?> onInit() {
        return MuzeiService.class;
    }
}
