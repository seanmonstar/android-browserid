package org.persona.login.android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;

public class PersonaActivity extends Activity {
	
	private static final String TAG = "PersonaTestActivity";
	private static final int LOGIN_RESULT = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_persona, menu);
        return true;
    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void login(View btn) {
    	Log.d(TAG, "login clicked");
    	Intent i = new Intent(this, PersonaLoginActivity.class);
    	startActivityForResult(i, LOGIN_RESULT);
    }
    
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	Log.d(TAG, "activty result returned");
    }

}
