package com.example.labo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
	private View mZoneCouleur;
	private int mCouleur;
	private ToggleButton mBoutonRouge;
	private ToggleButton mBoutonVert;
	private ToggleButton mBoutonBleu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mZoneCouleur = findViewById(R.id.ZoneCouleur);
		
		mBoutonRouge = (ToggleButton)findViewById(R.id.BoutonRouge);
		mBoutonVert = (ToggleButton)findViewById(R.id.BoutonVert);
		mBoutonBleu = (ToggleButton)findViewById(R.id.BoutonBleu);				
	}
	public void peindreRegion(View vue) {				
		if(!mBoutonRouge.isChecked()){
			mCouleur = mCouleur & 0xFF00FFFF;
		}
		if(!mBoutonVert.isChecked()){
			mCouleur = mCouleur & 0xFFFF00FF;
		}
		if(!mBoutonBleu.isChecked()){
			mCouleur = mCouleur & 0xFFFFFF00;
		}		
		if(mBoutonRouge.isChecked()) {
			mCouleur = mCouleur | 0xFFFF0000;
		}
		if(mBoutonVert.isChecked()) {
			mCouleur = mCouleur | 0xFF00FF00;
		}
		if(mBoutonBleu.isChecked()) {
			mCouleur = mCouleur | 0xFF0000FF;
		}
		mZoneCouleur.setBackgroundColor(mCouleur);
	}   
}
