package com.myfirstproject.arizz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


 public class Email extends Activity implements View.OnClickListener {
	 EditText personsEmail, intro, personsName, stupidThings, hatefulAction, outro;
	 String emailAdd, beginning, name, stupidAction, hatefulAct, out;
	 Button sendEmail;
	 protected void OnCreate(Bundle savedInstanceState) {
		 //TODO Auto-generated method stub
		 setContentView(R.layout.email);
		 initializeVars();
		 sendEmail.setOnClickListener(this);
	 }
	 
	 private void initializeVars(){
		 //TODO Auto-generated method stub
		 personsEmail = (EditText) findViewById(R.id.etEmails);
		 intro = (EditText) findViewById(R.id.etIntro);
		 personsName = (EditText) findViewById(R.id.etName);
		 stupidThings = (EditText) findViewById(R.id.etThings);
		 hatefulAction = (EditText) findViewById(R.id.etAction);
		 outro = (EditText) findViewById(R.id.etOutro);
		 sendEmail = (Button) findViewById(R.id.bSentEmail);
	 }
	 
	 public void OnClick(View v){
		//TODO Auto-generated method stub
		  
		 convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated();
		 String emailaddress[] = {emailAdd};
		 String message = "Well Hello" + name + "I just want to say" + beginning
				 + ". Not only that but I hate when you" + stupidAction
				 + ", that just really makes me crazy. I just want to make you "
				 + hatefulAct + ". welp. thats all I wanted to chit-chatter about. oh and"
				 + out + ". Oh also if you get bored you should check out www.mybring"
				 + '\n' + "PS. I think I love you...  ";
		 Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		 emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
		 emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "I hate you!");
		 emailIntent.setType("plain/text");
		 emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
		 startActivity(emailIntent);
	 }
	 private void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated() {
		//TODO Auto-generated method stub
		 emailAdd = personsEmail.getText().toString();
		 beginning = intro.getText().toString();
		 name = personsName.getText().toString();
		 stupidAction = stupidThings.getText().toString();
		 hatefulAct = hatefulAction.getText().toString();
		 out = outro.getText().toString();
	 }
	 
	 protected void OnPause() {
		//TODO Auto-generated method stub
		 super.onPause();
		 finish();
	 }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
 }
