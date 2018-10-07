package tw.brad.activitytest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
        Log.d("brad", "MainActivity()");
    }

    /*
     * switch to page2
     */
    public void test1(View view){
        Intent intent = new Intent(this, Page2Activity.class) ;
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("brad","onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("brad","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("brad","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("brad","onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("brad","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("brad","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("brad","onDestroy");
    }
}
