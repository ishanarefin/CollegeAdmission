package com.example.yousuf.collegeadmission;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Spinner;

public class With_All_Input extends AppCompatActivity {
    public static final String EXTRA_MASSAGE=null;
    Spinner Group_;
    Spinner Board_;
    EditText Roll_No;
    Spinner Year_;
    Spinner Shift_;
    Spinner Version_;
    Spinner Quota_;
    Button Apply_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with__all__input);
        Intent intent=getIntent();
        final String MessageText=intent.getStringExtra(EXTRA_MASSAGE);
        Group_=(Spinner)this.findViewById(R.id.Group_);
        Board_=(Spinner)this.findViewById(R.id.Board_);
        Roll_No=(EditText)this.findViewById(R.id.Roll_No);
        Year_=(Spinner)this.findViewById(R.id.Year_);
        Shift_=(Spinner)this.findViewById(R.id.Shift_);
        Version_=(Spinner)this.findViewById(R.id.Version_);
        Quota_=(Spinner)this.findViewById(R.id.Quota_);
        Apply_=(Button)this.findViewById(R.id.Apply_);
        Apply_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneno="01670";
                String group_="";
                String board_="";
                String year_="";
                String shift_="";
                String version_="";
                String quota_="";
                if(Group_.getSelectedItemPosition() == 0) {
                    group_="SC";
                }
                else if(Group_.getSelectedItemPosition() == 1) {
                    group_="BS";
                }
                else if(Group_.getSelectedItemPosition() == 2) {
                    group_="HU";
                }

                if(Board_.getSelectedItemPosition() == 0) {
                    board_="DHA";
                }
                else if(Board_.getSelectedItemPosition() == 1) {
                    board_="CHI";
                }
                else if(Board_.getSelectedItemPosition() == 2) {
                    board_="COM";
                }
                if(Board_.getSelectedItemPosition() == 3) {
                    board_="BAR";
                }
                else if(Board_.getSelectedItemPosition() == 4) {
                    board_="JES";
                }
                else if(Board_.getSelectedItemPosition() == 5) {
                    board_="RAJ";
                }
                else if(Board_.getSelectedItemPosition() == 6) {
                    board_="SYL";
                }
                else if(Board_.getSelectedItemPosition() == 7) {
                    board_="DIN";
                }

                if(Year_.getSelectedItemPosition() == 0) {
                    year_="2010";
                }
                else if(Year_.getSelectedItemPosition() == 1) {
                    year_="2011";
                }
                else if(Year_.getSelectedItemPosition() == 2) {
                    year_="2012";
                }
                else if(Year_.getSelectedItemPosition() == 3) {
                    year_="2013";
                }
                else if(Year_.getSelectedItemPosition() == 4) {
                    year_="2014";
                }
                else if(Year_.getSelectedItemPosition() == 5) {
                    year_="2015";
                }
                else if(Year_.getSelectedItemPosition() == 6) {
                    year_="2016";
                }
                else if(Year_.getSelectedItemPosition() == 7) {
                    year_="2017";
                }
                else if(Year_.getSelectedItemPosition() == 8) {
                    year_="2018";
                }
                else if(Year_.getSelectedItemPosition() == 9) {
                    year_="2019";
                }
                else if(Year_.getSelectedItemPosition() == 10) {
                    year_="2020";
                }
                if(Shift_.getSelectedItemPosition() == 0) {
                    shift_="M";
                }
                else if(Shift_.getSelectedItemPosition() == 1) {
                    shift_="D";
                }
                else if(Shift_.getSelectedItemPosition() == 2) {
                    shift_="N";
                }

                if(Version_.getSelectedItemPosition() == 0) {
                    version_="B";
                }
                else if(Version_.getSelectedItemPosition() == 1) {
                    version_="E";
                }

                if(Quota_.getSelectedItemPosition() == 0) {
                    quota_="FQ";
                }
                else if(Quota_.getSelectedItemPosition() == 1) {
                    quota_="EQ";
                }
                else if(Quota_.getSelectedItemPosition() == 2) {
                    quota_="SQ";
                }
                else if(Quota_.getSelectedItemPosition() == 3) {
                    quota_="";
                }

                String rollno_ = Roll_No.getText().toString();
                String Massage="CAD";
                Massage=Massage+" "+MessageText+" "+group_+" "+board_+" "+rollno_+" "+year_+" "+shift_+" "+version_+" "+quota_;
                sendMassage(phoneno, Massage,view);
            }
        });
    }
    private void sendMassage(final String phoneno, final String massage,View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure,You want to Apply!");

        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                SmsManager smsManager = SmsManager.getDefault();
                try {
                    smsManager.sendTextMessage(phoneno, null, massage, null, null);
                    Toast.makeText(getApplicationContext(), "SMS Sent", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "SMS Failed!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void Quit_(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure,You wanted to Quit");

        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                android.os.Process.killProcess(android.os.Process.myPid());

            }
        });

        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
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
