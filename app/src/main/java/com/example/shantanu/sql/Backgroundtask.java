package com.example.shantanu.sql;

/**
 * Created by Shantanu on 10/28/2017.
 */


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.widget.Toast;

/**
 * Created by Shantanu on 10/28/2017.
 */

public class Backgroundtask extends AsyncTask<String,Void,String> {
    Context ctx;
    Backgroundtask(Context ctx)
    {
        this.ctx=ctx;
    }
    protected void onPreExecute()
    {

    }
    protected String doInBackground(String... params) {
        String method=params[0];
        dboperations dbop=new dboperations(ctx);
        if (method.equals("add_info"))
        {
            String regno=params[1];
            String roomno=params[2];
            String blockno=params[3];
            String mobileno=params[4];
            String title=params[5];
            String cost=params[6];
            SQLiteDatabase db= dbop.getWritableDatabase();
            dbop.insertData(db,regno,roomno,blockno,mobileno,title,cost);
            return "one row inserted";

        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result) {

        Toast.makeText(ctx,result,Toast.LENGTH_LONG).show();
    }
}

