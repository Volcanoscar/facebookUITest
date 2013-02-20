package test.gisung.facebookuitest.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public class OpenListener implements AnimationListener {
	View iSidebar;
	View iContent;
	
	public OpenListener(View sidebar, View content) {
		this.iSidebar = sidebar;
		this.iContent = content;
	}
	
	@Override
	public void onAnimationEnd(Animation animation) {
		iContent.clearAnimation();
		//mOpened
	}

	@Override
	public void onAnimationRepeat(Animation animation) {
	}

	@Override
	public void onAnimationStart(Animation animation) {
		iSidebar.setVisibility(View.VISIBLE);
	}

}
