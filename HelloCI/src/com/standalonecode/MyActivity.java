package com.standalonecode;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Create something from the dependent library.
        HelloCI hello = new HelloCI();
        hello.sayHello();
    }
}
