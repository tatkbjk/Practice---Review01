package com.example.review01;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.connectors.AccountConnector;
import com.thaianhthu.models.models.Account;

public class LoginActivity extends AppCompatActivity {
    EditText edtUsername, edtPassword;
    CheckBox chkSaveLoginInfo;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        addViews();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void addViews() {
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        chkSaveLoginInfo = findViewById(R.id.chkSaveLoginInfo);
    }

    public void do_login(View view) {
        String username = edtUsername.getText().toString();
        String password = edtPassword.getText().toString();

        AccountConnector ac = new AccountConnector();
        Account acc = ac.login(username, password);
        if (acc != null) {
            Intent intent = new Intent(this, ProductManagementActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Login failed, please try again!", Toast.LENGTH_SHORT).show();
        }
    }

    public void save_login_info() {
        SharedPreferences preferences = getSharedPreferences("LOGIN_INFORMATION", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        String usr = edtUsername.getText().toString();
        String pwd = edtPassword.getText().toString();
        editor.putString("USERNAME", usr);
        editor.putString("PASSWORD", pwd);
        editor.putBoolean("SAVE_LOGIN_INFO", chkSaveLoginInfo.isChecked());
        editor.commit();
    }

    @Override
    protected void onPause() {
        super.onPause();
        save_login_info();
    }

    public void restore_login_info() {
        SharedPreferences preferences = getSharedPreferences("LOGIN_INFORMATION", MODE_PRIVATE);
        String usr = preferences.getString("USERNAME", "");
        String pwd = preferences.getString("PASSWORD", "");
        boolean isSave = preferences.getBoolean("SAVED", true);
        if (isSave) {
            edtUsername.setText(usr);
            edtPassword.setText(pwd);
            chkSaveLoginInfo.setChecked(true);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        restore_login_info();
    }
}