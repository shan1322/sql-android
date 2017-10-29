package com.example.shantanu.sql;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sell extends AppCompatActivity {
    EditText editRegNo,editRoomNo,editBlockNo,editMobileNo,editTitle,editCost;
    Button btnAddData;
    Button btnviewAll;
    String regno,roomno,blockno,mobileno,title,cost;
    dboperations mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);
        editRegNo=(EditText)findViewById(R.id.editText_RegNo);
        editRoomNo= (EditText)findViewById(R.id.editText2_RoomNo);
        editBlockNo=(EditText)findViewById(R.id.editText3_BlockNo);
        editMobileNo=(EditText)findViewById(R.id.editText4_MobileNo);
        editTitle=(EditText)findViewById(R.id.editText5_Title);
        editCost=(EditText)findViewById(R.id.editText6_Cost);
        btnAddData=(Button)findViewById(R.id.button_add);
        btnviewAll=(Button)findViewById(R.id.button_id);
        mydb=new dboperations(this);
    }
        public void AddData(View view)
        {
            regno=editRegNo.getText().toString();
            roomno=editRegNo.getText().toString();
            blockno=editBlockNo.getText().toString();
            mobileno=(editMobileNo.getText().toString());
            title=editTitle.getText().toString();
            cost=editCost.getText().toString();
            if(mobileno.length()==10 && Integer.valueOf(mobileno.charAt(0))!=0) {
                Backgroundtask backgroundtask = new Backgroundtask(this);
                backgroundtask.execute("add_info", regno, roomno, blockno, mobileno, title, cost);
                finish();
            }
            else

                Log.d("Invalid","NO");


        }





}
