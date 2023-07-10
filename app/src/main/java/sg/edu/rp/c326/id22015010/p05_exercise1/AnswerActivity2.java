package sg.edu.rp.c326.id22015010.p05_exercise1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import sg.edu.rp.c326.id22015010.p05_exercise1.databinding.ActivityAnswer2Binding;

public class AnswerActivity2 extends AppCompatActivity {
TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        tvAnswer2=findViewById(R.id.textView2);
        //tvAnswer.setText("In Second Activity");
        Intent intentReceived=getIntent();
        String questionsSelected=intentReceived.getStringExtra("Question");
        tvAnswer2.setText(questionsSelected+ "answer is: Gone");

    }
    }

