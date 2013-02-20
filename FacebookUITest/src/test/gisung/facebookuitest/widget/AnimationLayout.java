package test.gisung.facebookuitest.widget;

import test.gisung.facebookuitest.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class AnimationLayout extends ViewGroup {
	
	protected View mSidebar;
	protected View mContent;
	protected boolean mOpened;
	
	public AnimationLayout(Context context) {
		this(context, null);
	}
	
	public AnimationLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void measureChild(View child, int parentWidthMeasureSpec,
			int parentHeightMeasureSpec) {
		// TODO Auto-generated method stub
		super.measureChild(child, parentWidthMeasureSpec, parentHeightMeasureSpec);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		return super.onInterceptTouchEvent(ev);
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		mSidebar = findViewById(R.id.animation_layout_sidebar);
		mContent = findViewById(R.id.animation_layout_content);
		
		if (mSidebar == null) {
			throw new NullPointerException("no view id = animation_sidebar");
		}
		
		if (mContent == null) {
			throw new NullPointerException("no view id = animation_content");
		}
		
		
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

	public boolean isOpening() {
		return mOpened;
	}
	
	public void setOpened(boolean opened) {
		this.mOpened = opened;
	}
}
