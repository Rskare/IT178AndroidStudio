package android.example.snake;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LeaderboardActivity extends AppCompatActivity {

    EditText tv_score;
    int lastScore;
    int best1, best2, best3, best4, best5, best6, best7, best8, best9, best10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        tv_score = (EditText) findViewById(R.id.tv_score);
        SharedPreferences preferences = getSharedPreferences("PREF", 0);
        lastScore = preferences.getInt("lastScore", 0);
        best1 = preferences.getInt("best1", 0);
        best2 = preferences.getInt("best2", 0);
        best3 = preferences.getInt("best3", 0);
        best4 = preferences.getInt("best4", 0);
        best5 = preferences.getInt("best5", 0);
        best6 = preferences.getInt("best6", 0);
        best7 = preferences.getInt("best7", 0);
        best8 = preferences.getInt("best8", 0);
        best9 = preferences.getInt("best9", 0);
        best10 = preferences.getInt("best10", 0);

        if (lastScore >= best10) {
            best10 = lastScore;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best10", best10);
            editor.apply();
        }

        if (lastScore >= best9) {
            int temp = best9;
            best9 = lastScore;
            best10 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best10", best10);
            editor.putInt("best9", best9);
            editor.apply();
        }

        if (lastScore >= best8) {
            int temp = best8;
            best8 = lastScore;
            best9 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best9", best9);
            editor.putInt("best8", best8);
            editor.apply();
        }

        if (lastScore >= best7) {
            int temp = best7;
            best7 = lastScore;
            best8 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best8", best8);
            editor.putInt("best7", best7);
            editor.apply();
        }

        if (lastScore >= best6) {
            int temp = best6;
            best6 = lastScore;
            best7 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best7", best7);
            editor.putInt("best6", best6);
            editor.apply();
        }

        if (lastScore >= best5) {
            int temp = best5;
            best5 = lastScore;
            best6 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best6", best6);
            editor.putInt("best5", best5);
            editor.apply();
        }

        if (lastScore >= best4) {
            int temp = best4;
            best4 = lastScore;
            best5 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best5", best5);
            editor.putInt("best4", best4);
            editor.apply();
        }

        if (lastScore >= best3) {
            int temp = best3;
            best3 = lastScore;
            best4 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best4", best4);
            editor.putInt("best3", best3);
            editor.apply();
        }

        if (lastScore >= best2) {
            int temp = best2;
            best2 = lastScore;
            best3 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best3", best3);
            editor.putInt("best2", best2);
            editor.apply();
        }

        if (lastScore >= best1) {
            int temp = best1;
            best1 = lastScore;
            best2 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best2", best2);
            editor.putInt("best1", best1);
            editor.apply();
        }

        tv_score.setText("#1: " + best1 + "\n" +
                "#2: " + best2 + "\n" +
                "#3: " + best3 + "\n" +
                "#4: " + best4 + "\n" +
                "#5: " + best5 + "\n" +
                "#6: " + best6 + "\n" +
                "#7: " + best7 + "\n" +
                "#8: " + best8 + "\n" +
                "#9: " + best9 + "\n" +
                "#10: " + best10 + "  ");

        SharedPreferences pref = getSharedPreferences("PREF", 0);
        SharedPreferences.Editor edit = pref.edit();
        edit.putInt("bestScore", best1);
        edit.apply();
    }


    public void launchMain (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
