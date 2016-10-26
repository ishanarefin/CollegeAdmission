package com.example.yousuf.collegeadmission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Dhaka_Board(View view){
        Intent intent=new Intent(this,Dhaka_Board.class);
        startActivity(intent);
        finish();
    }

    public void Chittagong_Board(View view){
        Intent intent=new Intent(this,Chittagong_Board.class);
        startActivity(intent);
        finish();
    }

    public void Comilla_Board(View view){
        Intent intent=new Intent(this,Dhaka_Board.class);
        startActivity(intent);
    }

    public void Barisal_Board(View view){
        Intent intent=new Intent(this,Dhaka_Board.class);
        startActivity(intent);
    }

    public void Jessore_Board(View view){
        Intent intent=new Intent(this,Dhaka_Board.class);
        startActivity(intent);
    }

    public void Rajshahi_Board(View view){
        Intent intent=new Intent(this,Dhaka_Board.class);
        startActivity(intent);
    }


    public void Sylhet_Board(View view){
        Intent intent=new Intent(this,Dhaka_Board.class);
        startActivity(intent);
    }
    public void Dinajpur_Board(View view){
        Intent intent=new Intent(this,Dhaka_Board.class);
        startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
