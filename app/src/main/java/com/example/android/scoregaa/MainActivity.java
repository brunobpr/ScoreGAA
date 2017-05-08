package com.example.android.scoregaa;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int goalA = 0;
    int scoreTeamA = 0;
    int pointA = 0;
    int yellowCardTeamA = 0;
    int redCardTeamA = 0;
    int blackCardTeamA = 0;
    int goalB = 0;
    int scoreTeamB = 0;
    int pointB = 0;
    int yellowCardTeamB = 0;
    int redCardTeamB = 0;
    int blackCardTeamB = 0;
    int changeTeamA = 0;
    int changeTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView button = (ImageView) findViewById(R.id.gaasite);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/delfinenglishschool/"));
                startActivity(intent);
            }
        });

    }


    /**
     * This method adds one goal and increases the score by 3
     */
    public void addOneGoalTeamA(View view) {
        goalA = goalA + 1;
        scoreTeamA = scoreTeamA + 3;
        displayGoalTeamA(goalA);
        displayScoreTeamA(scoreTeamA);
        /**
         * This method add a "S" to the string Goal when the score is equal 2
         */
        if (goalA == 2) {
            String pluralGoalA = "Goals";
            addSToTeamA(pluralGoalA);
        }

    }

    /**
     * This method displays the string Goals to the Team A
     */
    private void addSToTeamA(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.pluralGoalTeamA);
        priceTextView.setText(message);
    }

    /**
     * This display shows the goals made by the team A
     */
    public void displayGoalTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method adds one Point and increases the score by 1
     */
    public void addOnePointForTeamA(View v) {
        pointA = pointA + 1;
        displayPointTeamA(pointA);
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
        /**
         * This method add a "S" to the string Goal when the score is equal 2
         */
        if (pointA == 2) {
            String pluralPointA = "Points";
            pointsTeamA(pluralPointA);
        }
    }

    /**
     * This method displays the string Points to the Team A
     */
    private void pointsTeamA(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.pluralPointTeamA);
        priceTextView.setText(message);
    }


    /**
     * This display shows the points made by the team A
     */
    public void displayPointTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointTeamA);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * This display shows the score made by the team A
     */
    public void displayScoreTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.scoreForTeamA);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * This method add one yellow card to the Team A
     */
    public void addYellowA(View view) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowTeamA(yellowCardTeamA);
    }

    /**
     * This display shows the yellow card given to the team A
     */
    public void displayYellowTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowA);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * This method add one red card to the Team A
     */
    public void addRedA(View view) {
        redCardTeamA = redCardTeamA + 1;
        displayRedTeamA(redCardTeamA);
    }

    /**
     * This display shows the red card given to the team A
     */
    public void displayRedTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redA);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * This method add one black card to the Team A
     */
    public void addBlackA(View view) {
        blackCardTeamA = blackCardTeamA + 1;
        displayBlackTeamA(blackCardTeamA);
    }

    /**
     * This display shows the black card given to the team A
     */
    public void displayBlackTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blackA);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * This method adds one goal and increases the score by 3 for team B
     */
    public void addOneGoalTeamB(View view) {
        goalB = goalB + 1;
        scoreTeamB = scoreTeamB + 3;
        displayGoalTeamB(goalB);
        displayScoreTeamB(scoreTeamB);
        /**
         * This method add a "S" to the string Goal when the score is equal 2
         */
        if (goalB == 2) {
            String pluralGoalB = "Goals";
            addSToTeamB(pluralGoalB);
        }
    }

    /**
     * This method displays the string Goals to the Team B
     */
    private void addSToTeamB(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.pluralGoalTeamB);
        priceTextView.setText(message);
    }

    /**
     * This display shows the goals made by the team B
     */
    public void displayGoalTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method adds one Point and increases the score by 1 for team B
     */
    public void addOnePointForTeamB(View v) {
        pointB = pointB + 1;
        displayPointTeamB(pointB);
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
        /**
         * This method add a "S" to the string Goal when the score is equal 2
         */
        if (pointB == 2) {
            String pluralTeamB = "Points";
            pointsTeamB(pluralTeamB);
        }
    }

    /**
     * This method displays the string Points to the Team B
     */
    private void pointsTeamB(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.pluralPointTeamB);
        priceTextView.setText(message);
    }

    /**
     * This display shows the points made by the team B
     */
    public void displayPointTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointTeamB);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * This display shows the score made by the team B
     */
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreForTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method add one yellow card to the Team B
     */
    public void addYellowB(View view) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowTeamB(yellowCardTeamB);
    }

    /**
     * This display shows the yellow card given to the team A
     */
    public void displayYellowTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowB);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * This method add one red card to the Team B
     */
    public void addRedB(View view) {
        redCardTeamB = redCardTeamB + 1;
        displayRedTeamB(redCardTeamB);
    }

    /**
     * This display shows the red card given to the team B
     */
    public void displayRedTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redB);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * This method add one black card to the Team B
     */
    public void addBlackB(View view) {
        blackCardTeamB = blackCardTeamB + 1;
        displayBlackTeamB(blackCardTeamB);
    }

    /**
     * This display shows the black card given to the team A
     */
    public void displayBlackTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blackB);
        scoreView.setText(String.valueOf(score));

    }

    /*
     * It changes the logo and name of team on the left-hand side
     */
    public void changeTeamA(View view) {
        changeTeamA += 1;
        // The next  method will change the name and image button
        if (changeTeamA == 1) {
            //Mayo is the new team
            ImageButton teamAImageButton = (ImageButton) findViewById(R.id.imageTeamA);
            teamAImageButton.setImageResource(R.drawable.mayo);
            TextView teamATextView = (TextView) findViewById(R.id.textTeamA);
            teamATextView.setText("Mayo");
        } else if (changeTeamA == 2) {
            //Donegal is the new team
            ImageButton teamAImageButton = (ImageButton) findViewById(R.id.imageTeamA);
            teamAImageButton.setImageResource(R.drawable.donegal);
            TextView teamATextView = (TextView) findViewById(R.id.textTeamA);
            teamATextView.setText("Donegal");
        } else if (changeTeamA == 3) {
            //Kerry is the new team
            ImageButton teamAImageButton = (ImageButton) findViewById(R.id.imageTeamA);
            teamAImageButton.setImageResource(R.drawable.kerry);
            TextView teamATextView = (TextView) findViewById(R.id.textTeamA);
            teamATextView.setText("Kerry");
        } else if (changeTeamA == 4) {
            //Monaghan is the new team
            ImageButton teamAImageButton = (ImageButton) findViewById(R.id.imageTeamA);
            teamAImageButton.setImageResource(R.drawable.monaghan);
            TextView teamATextView = (TextView) findViewById(R.id.textTeamA);
            teamATextView.setText("Monaghan");
        } else if (changeTeamA == 5) {
            //Roscommon is the new team;
            ImageButton teamAImageButton = (ImageButton) findViewById(R.id.imageTeamA);
            teamAImageButton.setImageResource(R.drawable.roscommon);
            TextView teamATextView = (TextView) findViewById(R.id.textTeamA);
            teamATextView.setText("Roscommon");
        } else {
            //Dublin is the new team and restarts de list
            ImageButton teamAImageButton = (ImageButton) findViewById(R.id.imageTeamA);
            teamAImageButton.setImageResource(R.drawable.dublin);
            TextView teamATextView = (TextView) findViewById(R.id.textTeamA);
            teamATextView.setText("Dublin");
            changeTeamA = 0;
        }
    }

    /*
     * It changes the logo and name of team on the right-hand side
     */
    public void changeTeamB(View view) {
        changeTeamB += 1;
        if (changeTeamB == 1) {
            //Dublin is the new team
            ImageButton teamBImageButton = (ImageButton) findViewById(R.id.imageTeamB);
            teamBImageButton.setImageResource(R.drawable.dublin);
            TextView teamBTextView = (TextView) findViewById(R.id.textTeamB);
            teamBTextView.setText("Dublin");
        } else if (changeTeamB == 2) {
            //Donegal is the new team
            ImageButton teamBImageButton = (ImageButton) findViewById(R.id.imageTeamB);
            teamBImageButton.setImageResource(R.drawable.donegal);
            TextView teamBTextView = (TextView) findViewById(R.id.textTeamB);
            teamBTextView.setText("Donegal");
        } else if (changeTeamB == 3) {
            //Kerry is the new team
            ImageButton teamBImageButton = (ImageButton) findViewById(R.id.imageTeamB);
            teamBImageButton.setImageResource(R.drawable.kerry);
            TextView teamBTextView = (TextView) findViewById(R.id.textTeamB);
            teamBTextView.setText("Kerry");
        } else if (changeTeamB == 4) {
            //Monaghan is the new team
            ImageButton teamBImageButton = (ImageButton) findViewById(R.id.imageTeamB);
            teamBImageButton.setImageResource(R.drawable.monaghan);
            TextView teamBTextView = (TextView) findViewById(R.id.textTeamB);
            teamBTextView.setText("Monaghan");
        } else if (changeTeamB == 5) {
            //Roscommon is the new team
            ImageButton teamBImageButton = (ImageButton) findViewById(R.id.imageTeamB);
            teamBImageButton.setImageResource(R.drawable.roscommon);
            TextView teamBTextView = (TextView) findViewById(R.id.textTeamB);
            teamBTextView.setText("Roscommon");
        } else {
            //Mayo is the new team and the list is restarted
            ImageButton teamBImageButton = (ImageButton) findViewById(R.id.imageTeamB);
            teamBImageButton.setImageResource(R.drawable.mayo);
            TextView teamBTextView = (TextView) findViewById(R.id.textTeamB);
            teamBTextView.setText("Mayo");
            changeTeamB = 0;
        }
    }

    /*
    *Resets score, points, goals and cards of the team A
     */
    public void resetTeamA(View view) {
        scoreTeamA = 0;
        pointA = 0;
        goalA = 0;
        yellowCardTeamA = 0;
        redCardTeamA = 0;
        blackCardTeamA = 0;
        displayGoalTeamA(goalA);
        displayPointTeamA(pointA);
        displayScoreTeamA(scoreTeamA);
        String pluralPointA = "Point";
        pointsTeamA(pluralPointA);
        String pluralGoalA = "Goal";
        addSToTeamA(pluralGoalA);
        displayYellowTeamA(yellowCardTeamA);
        displayRedTeamA(redCardTeamA);
        displayBlackTeamA(blackCardTeamA);
    }

    /*
    *Resets score, points, goals and cards of the team B
     */
    public void resetTeamB(View view) {
        scoreTeamB = 0;
        pointB = 0;
        goalB = 0;
        yellowCardTeamB = 0;
        redCardTeamB = 0;
        blackCardTeamB = 0;
        String pluralGoalB = "Goal";
        addSToTeamB(pluralGoalB);
        String pluralPointB = "Point";
        pointsTeamB(pluralPointB);
        displayGoalTeamB(goalB);
        displayPointTeamB(pointB);
        displayScoreTeamB(scoreTeamB);
        displayYellowTeamB(yellowCardTeamB);
        displayRedTeamB(redCardTeamB);
        displayBlackTeamB(blackCardTeamB);
    }

    /*
     * Shows a Toast showing who won;
     */
    public void endGame(View view) {
        TextView endGameTeamAName = (TextView) findViewById(R.id.textTeamA);
        String nameOfTeamA = endGameTeamAName.getText().toString();
        TextView endGameTeamBName = (TextView) findViewById(R.id.textTeamB);
        String nameOfTeamB = endGameTeamBName.getText().toString();
        if (scoreTeamA > scoreTeamB) {
            //Team A won
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, nameOfTeamA + " won", duration).show();

        } else if (scoreTeamA == scoreTeamB) {
            //Tied
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, "No winner", duration).show();
        } else {
            //Team B won
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, nameOfTeamB + " won", duration).show();
        }

    }

    /*
     *Resets all values, both team A and B.
     */
    public void reset(View view) {
        goalA = 0;
        scoreTeamA = 0;
        pointA = 0;
        yellowCardTeamA = 0;
        redCardTeamA = 0;
        blackCardTeamA = 0;
        goalB = 0;
        scoreTeamB = 0;
        pointB = 0;
        yellowCardTeamB = 0;
        redCardTeamB = 0;
        blackCardTeamB = 0;
        String pluralGoalA = "Goal";
        addSToTeamA(pluralGoalA);
        String pluralGoalB = "Goal";
        addSToTeamB(pluralGoalB);
        String pluralPointA = "Point";
        pointsTeamA(pluralPointA);
        String pluralPointB = "Point";
        pointsTeamB(pluralPointB);
        displayGoalTeamA(goalA);
        displayPointTeamA(pointA);
        displayScoreTeamA(scoreTeamA);
        displayYellowTeamA(yellowCardTeamA);
        displayRedTeamA(redCardTeamA);
        displayBlackTeamA(blackCardTeamA);
        displayGoalTeamB(goalB);
        displayPointTeamB(pointB);
        displayScoreTeamB(scoreTeamB);
        displayYellowTeamB(yellowCardTeamB);
        displayRedTeamB(redCardTeamB);
        displayBlackTeamB(blackCardTeamB);

    }
}

