package com.example.vfernandez.oviedotourguide;

import android.content.Context;
import android.content.res.Resources;

public class Location {
    private String mName;
    private String mInfo;
    private String mTimetable;

    private static final int NO_VALUE_PROVIDED = -1;

    private int mIcon = NO_VALUE_PROVIDED;
    private int mImage = NO_VALUE_PROVIDED;

    public Location(String name, String info, String timetable, int image, int icon) {
        mName = name;
        mInfo = info;
        mTimetable = timetable;
        mImage = image;
        mIcon = icon;
    }

    public Location(Context ctx, int name, int info, int timetable, int image, int icon) {
        if (name != NO_VALUE_PROVIDED) {
            mName = ctx.getResources().getString(name);
        }
        if (info != NO_VALUE_PROVIDED) {
            mInfo = ctx.getResources().getString(info);
        }
        if (timetable != NO_VALUE_PROVIDED) {
            mTimetable = ctx.getResources().getString(timetable);
        }
        mImage = image;
        mIcon = icon;
    }

    public boolean hasIcon(){ return mIcon != NO_VALUE_PROVIDED; }

    public String getName() {
        return mName;
    }

    public String getInfo() {
        return mInfo;
    }

    public String getTimetable() {
        return mTimetable;
    }

    public int getImage() {
        return mImage;
    }

    public int getIcon() { return mIcon; }

    @Override
    public String toString() {
        return "Location{" +
                "mName='" + mName + '\'' +
                ", mInfo='" + mInfo + '\'' +
                ", mTimetable='" + mTimetable + '\'' +
                ", mImage=" + mImage +
                ", mIcon=" + mIcon +
                '}';
    }
}
