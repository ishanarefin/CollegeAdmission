package com.example.yousuf.collegeadmission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Dhaka_Board extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__board);
    }

    public void Dhaka_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE, "107977");
        startActivity(intent);
    }

    public void Dhaka_City_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE, "107975");
        startActivity(intent);

    }

    public void Dhaka_Imperial_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"107974");
        startActivity(intent);

    }

    public void Tejgaon_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE, "108533");
        startActivity(intent);

    }

    public void Viqarunnisa_Noon_School_and_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"108357");
        startActivity(intent);

    }

    public void Dhaka_Commerce_college(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"108207");
        startActivity(intent);
    }


    public void Holy_Cross_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"131962");
        startActivity(intent);

    }
    public void Rajuk_Uttara_Model_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"108573");
        startActivity(intent);
    }

    public void BAF_Shaheen_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"107858");
        startActivity(intent);
    }

    public void Notre_Dame_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"108274");
        startActivity(intent);
    }

    public void Dhaka_Residential_Model_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"108258");
        startActivity(intent);
    }

    public void Shamsul_Haque_Khan_School_And_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"114352");
        startActivity(intent);
    }

    public void Mirzapur_Cadet_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"133861");
        startActivity(intent);
    }

    public void Mymensingh_Girls_Cadet_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"111926");
        startActivity(intent);
    }

    public void Shaheed_Birottom_Lt_Anowar_Girls_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"132143");
        startActivity(intent);
    }

    public void National_Ideal_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"132078");
        startActivity(intent);
    }

    public void Cambrian_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"132140");
        startActivity(intent);
    }

    public void Birsrestha_Noor_Mohammad_Public_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"108161");
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
