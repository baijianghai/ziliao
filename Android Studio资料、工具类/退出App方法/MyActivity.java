package com.pro.android_exit;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Application;

public class MyActivity extends Application {

        //����һ�����Activity�ļ���
	public static ArrayList<Activity> activitie = new ArrayList<Activity>();

	@Override
	public void onCreate() {
		super.onCreate();
	}

        //�ر����е�Activity
	public static void exit() {
		for (int i = 0; i < activitie.size(); i++) {
			activitie.get(i).finish();
			i--;
		}
	}

}
