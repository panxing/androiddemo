package com.example.androiddemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	private ViewTreeObserver mViewTreeObserver;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		final TextView tv=(TextView) findViewById(R.id.tv);
//		int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
//		int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
//		tv.measure(w, h);
//		int height = tv.getMeasuredHeight();
//		int width = tv.getMeasuredWidth();
//		System.out.println("height"+height+"..width"+width);
//
//		tv.post(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("height"+tv.getWidth()+"..width"+tv.getHeight());
//			}
//		});
//		mViewTreeObserver = tv.getViewTreeObserver();
//
//		mViewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener()
//		    {
//		      @Override
//		      public void onGlobalLayout()
//		      {
//		        // TODO Auto-generated method stub
//		    	  tv.getViewTreeObserver().removeGlobalOnLayoutListener(this);
//		        System.out.println("onGlobalLayout width=" + tv.getWidth() + " height=" + tv.getHeight());
//		      }
//		    });
	}
}
