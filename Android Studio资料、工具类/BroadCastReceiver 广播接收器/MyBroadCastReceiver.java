package com.pro.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadCastReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		if(intent.getAction().equals("FM555")){
			Toast.makeText(context, "���յ��˹㲥���ŷ�����Ϣ", Toast.LENGTH_SHORT).show();
		}		
	}

}
