package phong.study.loginconstrainlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AfterRegister extends AppCompatActivity {
    TextView txv_Username;
    TextView txv_Password;
    Button btn_Back;
    TextView txv_Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_after_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn_Back = findViewById(R.id.btn_Back);
        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AfterRegister.this, RegisterActivity.class));
            }
        });
        txv_Username = findViewById(R.id.txv_Username);
        txv_Password = findViewById(R.id.txv_Password);
        txv_Email = findViewById(R.id.txv_Email);
        String Username =  RegisterActivity.edt_Username.getText().toString();
        String Password = RegisterActivity.edt_Password.getText().toString();
        String Email = RegisterActivity.edt_Email.getText().toString();
        txv_Username.setText("Username: "+Username);
        txv_Password.setText("Password: "+Password);
        txv_Email.setText("Email: "+Email);
    }

}