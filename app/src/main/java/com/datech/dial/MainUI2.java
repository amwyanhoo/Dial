package com.datech.dial;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainUI2 extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ui);

        Button btn = (Button)findViewById(R.id.button ) ;
        btn.setOnClickListener(this);
    }


    private void call(){
        EditText et_phonenumber = (EditText)findViewById(R.id.number);
        String number = et_phonenumber.getText().toString();
        //用intent启动拨打电话
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+number));
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        System.out.println("mainUI2拨打电话");
        call();
    }
}
