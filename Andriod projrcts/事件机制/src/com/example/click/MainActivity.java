package com.example.click;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

/*
��ǰ��һ����������
*/
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);//�ƶ���ǰ�ؼ���ʾ������
	}
/*
 * �������ҡ���ť���û����ʱ�������˷���
 * 
 */
	public void click(View v)
	{
		System.out.println("\"����\"��ť�������");
	}
}
