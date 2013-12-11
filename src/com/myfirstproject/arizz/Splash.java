package com.myfirstproject.arizz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class Splash extends Activity {

	MediaPlayer ourSong;
	
	@Override
	protected void onCreate(Bundle ArizzLikePlaying) {
		// TODO Auto-generated method stub
		super.onCreate(ArizzLikePlaying);
		setContentView(R.layout.splash);
		ourSong = MediaPlayer.create(Splash.this, R.raw.insectsound); 
		
		SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		boolean music = getPrefs.getBoolean("checkbox", true);
		if (music == true)

			ourSong.start();
		Thread timer = new Thread(){
			@Override
			public void run(){
				try{
					sleep(5000);					
				} catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openStartingPoint = new Intent("com.myfirstproject.arizz.Menu");
					startActivity(openStartingPoint);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}

}
