package id.sch.smktelkommalang.myhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data_satu);
        btnMoveWithDataActivity.setOnClickListener(this);

        Button btnMoveWithDataActivityDua = findViewById(R.id.btn_move_activity_data_dua);
        btnMoveWithDataActivityDua.setOnClickListener(this);

        Button btnMoveWithDataActivityTiga = findViewById(R.id.btn_move_activity_data_tiga);
        btnMoveWithDataActivityTiga.setOnClickListener(this);

        Button btnMoveWithDataActivityEmpat = findViewById(R.id.btn_move_activity_data_empat);
        btnMoveWithDataActivityEmpat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.btn_move_activity_data_satu:
            Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivitySatu.class);
            moveWithDataIntent.putExtra(MoveWithDataActivitySatu.EXTRA_JUDUL,"AYO JAGA DIRI");
            startActivity(moveWithDataIntent);
            break;

        case R.id.btn_move_activity_data_dua:
            Intent moveIntent = new Intent(MainActivity.this, MoveWithDataActivityDua.class);
            startActivity(moveIntent);
            break;

        case R.id.btn_move_activity_data_tiga:
            Intent moveIntentTiga = new Intent(MainActivity.this, MoveWithDataActivityTiga.class);
            startActivity(moveIntentTiga);
            break;

        case R.id.btn_move_activity_data_empat:
            Intent moveIntentEmpat = new Intent(MainActivity.this, MoveWithDataActivityEmpat.class);
            startActivity(moveIntentEmpat);
            break;
    }
    }
}