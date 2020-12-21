package android.example.snake;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GameOver extends AppCompatActivity {

    EditText last_score;
    int lastScore, bestScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        last_score = (EditText) findViewById(R.id.last_score);
        SharedPreferences preferences = getSharedPreferences("PREF", 0);
        lastScore = preferences.getInt("lastScore", 0);
        bestScore = preferences.getInt("bestScore", 0);

        if(lastScore < bestScore)
        last_score.setText("PREVIOUS SCORE: " + lastScore + "\n" +
                "BEST SCORE: " + bestScore);
        if(lastScore > bestScore)
            last_score.setText("PREVIOUS SCORE: " + lastScore + "\n" +
                    "BEST SCORE: " + lastScore);
    }

    public void launchMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void launchGame(View view) {
        Intent intent = new Intent(this, SnakeActivity.class);
        startActivity(intent);
    }

    public void launchScores(View view) {
        Intent intent = new Intent(this, LeaderboardActivity.class);
        startActivity(intent);
    }
}