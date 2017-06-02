package com.googlemap;

import com.googlemap.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Helps extends Activity {
	//����˵���Ҫ�ĳ���
	private static final int MENU_MAIN = Menu.FIRST + 1;
	private static final int MENU_NEW = MENU_MAIN + 1;
	private static final int MENU_BACK = MENU_NEW + 1;;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helps);
    	setTitle(R.string.menu_helps);
    }
	// ��ʼ���˵�
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		menu.add(0, MENU_MAIN, 0, R.string.menu_main).setIcon(
				R.drawable.icon).setAlphabeticShortcut('M');
		menu.add(0, MENU_NEW, 0, R.string.menu_new).setIcon(
				R.drawable.new_track).setAlphabeticShortcut('N');
		menu.add(0, MENU_BACK, 0, R.string.menu_back).setIcon(
				R.drawable.back).setAlphabeticShortcut('E');
		return true;
	}
	
	// ��һ���˵���ѡ�е�ʱ�����
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent = new Intent();
		switch (item.getItemId()) {
		case MENU_NEW:
			intent.setClass(Helps.this, NewTrack.class);
			startActivity(intent);
			return true;
		case MENU_MAIN:
			intent.setClass(Helps.this, iTracks.class);
			startActivity(intent);
			return true;
		case MENU_BACK:
		    finish();
			break;
		}
		return true;
	}
}
