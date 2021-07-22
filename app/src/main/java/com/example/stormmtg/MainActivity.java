package com.example.stormmtg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button increasePoisonButton = findViewById(R.id.poisonIncrease);
        Button decreasePoisonButton = findViewById(R.id.poisonDecrease);
        TextView poisonCounter = findViewById(R.id.poisonCounter);

        Button increaseOpponentPoisonButton = findViewById(R.id.opponentPoisonIncrease);
        Button decreaseOpponentPoisonButton = findViewById(R.id.opponentPoisonDecrease);
        TextView opponentPoisonCounter = findViewById(R.id.opponentPoisonCounter);

        Button increaseLifeButton = findViewById(R.id.lifeIncrease);
        Button decreaseLifeButton = findViewById(R.id.lifeDecrease);
        TextView lifeCounter = findViewById(R.id.lifeCounter);

        Button increaseOpponentLifeButton = findViewById(R.id.opponentLifeIncrease);
        Button decreaseOpponentLifeButton = findViewById(R.id.opponentLifeDecrease);
        TextView opponentLifeCounter = findViewById(R.id.opponentLifeCounter);

        Button increaseStormButton = findViewById(R.id.stormIncrease);
        Button decreaseStormButton = findViewById(R.id.stormDecrease);
        TextView stormCounter = findViewById(R.id.stormCounter);

        Button increaseBlueButton = findViewById(R.id.blueIncrease);
        Button decreaseBlueButton = findViewById(R.id.blueDecrease);
        TextView blueCounter = findViewById(R.id.blueCounter);

        Button increaseRedButton = findViewById(R.id.redIncrease);
        Button decreaseRedButton = findViewById(R.id.redDecrease);
        TextView redCounter = findViewById(R.id.redCounter);

        TextView stormGlow = findViewById(R.id.stormGlow);

        Button dumpCountersButton = findViewById(R.id.dumpButton);
        Button refreshAllButton = findViewById(R.id.refreshButton);

        poisonCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poisonCounter.setText(String.valueOf(Integer.parseInt((String) poisonCounter.getText()) + 1));
            }
        });

        increasePoisonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poisonCounter.setText(String.valueOf(Integer.parseInt((String) poisonCounter.getText()) + 1));
            }
        });

        decreasePoisonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poisonCounter.setText(String.valueOf(Integer.parseInt((String) poisonCounter.getText()) - 1));
            }
        });

        opponentPoisonCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opponentPoisonCounter.setText(String.valueOf(Integer.parseInt((String) opponentPoisonCounter.getText()) + 1));
            }
        });

        increaseOpponentPoisonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opponentPoisonCounter.setText(String.valueOf(Integer.parseInt((String) opponentPoisonCounter.getText()) + 1));
            }
        });

        decreaseOpponentPoisonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opponentPoisonCounter.setText(String.valueOf(Integer.parseInt((String) opponentPoisonCounter.getText()) - 1));
            }
        });

        lifeCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lifeCounter.setText(String.valueOf(Integer.parseInt((String) lifeCounter.getText()) + 1));
            }
        });

        increaseLifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lifeCounter.setText(String.valueOf(Integer.parseInt((String) lifeCounter.getText()) + 1));
            }
        });

        decreaseLifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lifeCounter.setText(String.valueOf(Integer.parseInt((String) lifeCounter.getText()) - 1));
            }
        });

        opponentLifeCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stormValue = Integer.parseInt((String) stormCounter.getText());
                int opponentLifeTotal = Integer.parseInt((String) opponentLifeCounter.getText());

                opponentLifeCounter.setText(String.valueOf(opponentLifeTotal + 1));
                opponentLifeTotal++;

                if (grapeshotCalculation(stormValue) >= opponentLifeTotal){
                    stormGlow.setVisibility(View.VISIBLE);
                }
                else{
                    stormGlow.setVisibility(View.INVISIBLE);
                }
            }


        });

        increaseOpponentLifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stormValue = Integer.parseInt((String) stormCounter.getText());
                int opponentLifeTotal = Integer.parseInt((String) opponentLifeCounter.getText());

                opponentLifeCounter.setText(String.valueOf(opponentLifeTotal + 1));
                opponentLifeTotal++;

                if (grapeshotCalculation(stormValue) >= opponentLifeTotal){
                    stormGlow.setVisibility(View.VISIBLE);
                }
                else{
                    stormGlow.setVisibility(View.INVISIBLE);
                }
            }


        });

        decreaseOpponentLifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stormValue = Integer.parseInt((String) stormCounter.getText());
                int opponentLifeTotal = Integer.parseInt((String) opponentLifeCounter.getText());

                opponentLifeCounter.setText(String.valueOf(opponentLifeTotal - 1));
                opponentLifeTotal--;

                if (grapeshotCalculation(stormValue) >= opponentLifeTotal){
                    stormGlow.setVisibility(View.VISIBLE);
                }
                else {
                    stormGlow.setVisibility(View.INVISIBLE);
                }
            }
        });

        stormCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stormValue = Integer.parseInt((String) stormCounter.getText());
                int opponentLifeTotal = Integer.parseInt((String) opponentLifeCounter.getText());
                stormCounter.setText(String.valueOf(stormValue + 1));
                stormValue++;

                if (grapeshotCalculation(stormValue) >= opponentLifeTotal){
                    stormGlow.setVisibility(View.VISIBLE);
                }
                else{
                    stormGlow.setVisibility(View.INVISIBLE);
                }
            }
        });

        increaseStormButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stormValue = Integer.parseInt((String) stormCounter.getText());
                int opponentLifeTotal = Integer.parseInt((String) opponentLifeCounter.getText());
                stormCounter.setText(String.valueOf(stormValue + 1));
                stormValue++;

                if (grapeshotCalculation(stormValue) >= opponentLifeTotal){
                    stormGlow.setVisibility(View.VISIBLE);
                }
                else{
                    stormGlow.setVisibility(View.INVISIBLE);
                }
            }
        });

        decreaseStormButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stormValue = Integer.parseInt((String) stormCounter.getText());
                int opponentLifeTotal = Integer.parseInt((String) opponentLifeCounter.getText());

                if (stormValue != 0){
                    stormCounter.setText(String.valueOf(stormValue - 1));
                    stormValue--;
                }



                if (grapeshotCalculation(stormValue) >= opponentLifeTotal){
                    stormGlow.setVisibility(View.VISIBLE);
                }
                else{
                    stormGlow.setVisibility(View.INVISIBLE);
                }
            }
        });

        blueCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueCounter.setText(String.valueOf(Integer.parseInt((String) blueCounter.getText()) + 1));
            }
        });

        increaseBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueCounter.setText(String.valueOf(Integer.parseInt((String) blueCounter.getText()) + 1));
            }
        });

        decreaseBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentStormValue = Integer.parseInt((String) blueCounter.getText());
                if (currentStormValue != 0){
                    blueCounter.setText(String.valueOf(currentStormValue - 1));
                }
            }
        });

        redCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redCounter.setText(String.valueOf(Integer.parseInt((String) redCounter.getText()) + 1));
            }
        });

        increaseRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redCounter.setText(String.valueOf(Integer.parseInt((String) redCounter.getText()) + 1));
            }
        });

        decreaseRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentStormValue = Integer.parseInt((String) redCounter.getText());
                if (currentStormValue != 0){
                    redCounter.setText(String.valueOf(currentStormValue - 1));
                }
            }
        });

        dumpCountersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stormGlow.setVisibility(View.INVISIBLE);
                stormCounter.setText("0");
                redCounter.setText("0");
                blueCounter.setText("0");
            }
        });

        refreshAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stormGlow.setVisibility(View.INVISIBLE);
                lifeCounter.setText(String.valueOf(20));
                opponentLifeCounter.setText(String.valueOf(20));
                stormCounter.setText(String.valueOf(0));
                redCounter.setText(String.valueOf(0));
                blueCounter.setText(String.valueOf(0));
            }
        });
    }

    public int grapeshotCalculation(int stormValue){
        // Cast Grapeshot
        int damage = stormValue + 1;
        stormValue++;
        // Remand Grapeshot
        damage--;
        stormValue++;
        // Cast Grapeshot again
        damage += stormValue + 1;

        return damage;
    }
}