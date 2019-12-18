package hnu.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Test for java-doc
 */
public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mTextView;
    private boolean toogle = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text1);

        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (toogle) {
                    mTextView.setText("");
                } else {
                    mTextView.setText("Hallo");
                }
                toogle = !toogle;

            }
        });
    }
}
