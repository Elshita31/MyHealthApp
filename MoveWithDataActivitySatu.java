package id.sch.smktelkommalang.myhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivitySatu extends AppCompatActivity {
    public static final String EXTRA_JUDUL="extra_judul";
    public static final String EXTRA_ISI="extra_isi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data_activity_satu);

        TextView tvDataReceived = findViewById(R.id.tv_data_received);
        String judul = getIntent().getStringExtra(EXTRA_JUDUL);
        String isi = getIntent().getStringExtra(EXTRA_ISI);

        String text = judul;
        tvDataReceived.setText(text);
    }
}