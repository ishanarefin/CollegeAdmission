package com.example.yousuf.collegeadmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Chittagong_Board extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__board);
    }

    public void Chittagong_Public_School_And_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE, "104051");
        startActivity(intent);
    }

    public void Chittagong_Govt_City_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE, "131368");
        startActivity(intent);

    }

    public void Faujdarhat_Cadet_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"105116");
        startActivity(intent);

    }

    public void Chittagong_University_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE, "104468");
        startActivity(intent);

    }

    public void Chittagong_Govt_Girls_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"104693");
        startActivity(intent);

    }

    public void BAF_Shaheen_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"104265");
        startActivity(intent);
    }


    public void Chittagong_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"104532");
        startActivity(intent);

    }
    public void Govt_Haji_Muhammad_Mohsin_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"104527");
        startActivity(intent);
    }

    public void Ispahani_Public_School_And_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"105826");
        startActivity(intent);
    }
    public void Govt_Commerce_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"104302");
        startActivity(intent);
    }
    public void Agrabad_Womens_College(View view){
        Intent intent=new Intent(this,With_All_Input.class);
        intent.putExtra(With_All_Input.EXTRA_MASSAGE,"104303");
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
