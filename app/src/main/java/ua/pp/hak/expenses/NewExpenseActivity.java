package ua.pp.hak.expenses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewExpenseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_expense);
    }

    public void showMainActivity(View view){
        Intent  intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
