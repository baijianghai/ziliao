package com.pro.android_exit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThridActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thrid);
                //ÿ�ν���Activity,����ӵ�������
		MyActivity.activitie.add(this);
	}

	 public void jump03(View v) {
	 startActivity(new Intent(this, SceondActivity.class));
	 }

        //����˳��ر����е�Activity
	public void exit(View v) {
		MyActivity.exit();
	}
        //�����ؼ�ֻ����ǰ��Activity�Ӽ������Ƴ�
	@Override
	public void finish() {
		super.finish();
		MyActivity.activitie.remove(this);
	}
}
