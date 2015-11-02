package com.example.click;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

/*
当前是一个界面的组件
*/
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);//制定当前控件显示的内容
	}
/*
 * 当“点我”按钮被用户点击时，触发此方法
 * 
 */
	public void click(View v)
	{
		System.out.println("\"点我\"按钮被点击了");
	}
}
