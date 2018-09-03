package com.example.admin.tuan2bai1;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


// Sử dựng Inline anonymous listener
public class XuLySuKienTrenAndroid extends Activity {

    //Khai bao bien

    EditText edtNhapa;
    EditText edtNhapb;
    EditText edtKetqua;
    Button btnCong;
    Button btnThoat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xu_ly_su_kien_tren_android);

       //Anh xa

        edtNhapa = (EditText) findViewById(R.id.nhapa);
        edtNhapb = (EditText) findViewById(R.id.nhapb);
        edtKetqua = (EditText) findViewById(R.id.ketqua);
        btnCong = (Button) findViewById(R.id.btncong);
        btnThoat = (Button) findViewById(R.id.thoat);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtNhapa.getText()+"");// Lấy giá trị trong Text
                int b = Integer.parseInt(edtNhapb.getText()+"");

                edtKetqua.setText(a+b);
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
