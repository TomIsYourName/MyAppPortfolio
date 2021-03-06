package com.tomisyourname.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public void onClick(View v) {
    Button button = (Button) findViewById(v.getId());
    Toast.makeText(this, "Click this button to start " + button.getText().toString(), Toast.LENGTH_SHORT).show();
  }
}
