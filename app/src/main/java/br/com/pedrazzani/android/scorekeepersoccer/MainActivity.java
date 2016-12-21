package br.com.pedrazzani.android.scorekeepersoccer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAGol = 0;
    private int teamBGol = 0;
    private int teamAFalta = 0;
    private int teamBFalta = 0;
    private int teamACA = 0;
    private int teamBCA = 0;
    private int teamACV = 0;
    private int teamBCV = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display();
    }

    public void buttonReset(View v) {
        teamAGol = 0;
        teamBGol = 0;
        teamAFalta = 0;
        teamBFalta = 0;
        teamACA = 0;
        teamBCA = 0;
        teamACV = 0;
        teamBCV = 0;

        display();
    }

    public void addGolTeamA(View view) {
        teamAGol++;
        display();
    }

    public void addFaltaTeamA(View view) {
        teamAFalta++;
        display();
    }

    public void addAmareloTeamA(View view) {
        teamACA++;
        display();
    }

    public void addVermelhoTeamA(View view) {
        teamACV++;
        display();
    }

    public void addGolTeamB(View view) {
        teamBGol++;
        display();
    }

    public void addFaltaTeamB(View view) {
        teamBFalta++;
        display();
    }

    public void addAmareloTeamB(View view) {
        teamBCA++;
        display();
    }

    public void addVermelhoTeamB(View view) {
        teamBCV++;
        display();
    }

    public void display() {
        TextView golA = (TextView) findViewById(R.id.teamA_gol);
        TextView faltaA = (TextView) findViewById(R.id.teamA_falta);
        TextView caA = (TextView) findViewById(R.id.teamA_ca);
        TextView cvA = (TextView) findViewById(R.id.teamA_cv);

        TextView golB = (TextView) findViewById(R.id.teamB_gol);
        TextView faltaB = (TextView) findViewById(R.id.teamB_falta);
        TextView caB = (TextView) findViewById(R.id.teamB_ca);
        TextView cvB = (TextView) findViewById(R.id.teamB_cv);

        golA.setText(String.valueOf(teamAGol));
        faltaA.setText(String.valueOf(teamAFalta));
        caA.setText(String.valueOf(teamACA));
        cvA.setText(String.valueOf(teamACV));

        golB.setText(String.valueOf(teamBGol));
        faltaB.setText(String.valueOf(teamBFalta));
        caB.setText(String.valueOf(teamBCA));
        cvB.setText(String.valueOf(teamBCV));
    }
}
