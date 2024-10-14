package com.example.speakeasy_app;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RedButton extends AppCompatActivity {

    private EditText editTextText;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_button);

        // Find the EditText and TextView by their IDs
        editTextText = findViewById(R.id.editTextText);
        textView2 = findViewById(R.id.textView2);

        // Optional: Adjust system bars handling
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Method called when the button is clicked
    public void updateTextView(View view) {
        // Get the input text from the EditText
        String inputText = editTextText.getText().toString();

        // Set the input text as the new text for the TextView
        textView2.setText(inputText);
    }
}
