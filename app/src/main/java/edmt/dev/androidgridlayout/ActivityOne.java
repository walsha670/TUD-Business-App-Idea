package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityOne extends AppCompatActivity {
    GridLayout Grid2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Grid2 = (GridLayout) findViewById(R.id.Grid2);

        //Set Event
        setSingleEvent(Grid2);

        //setToggleEvent(mainGrid);

    }

    private void setToggleEvent(GridLayout Grid2) {
        //Loop all child item of Main Grid
        for (int i = 0; i < Grid2.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) Grid2.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(ActivityOne.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(ActivityOne.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
        private void setSingleEvent(GridLayout Grid2) {
            //Loop all child item of Main Grid
            for (int i = 0; i < Grid2.getChildCount(); i++) {
                //You can see , all child item is CardView , so we just cast object to CardView
                CardView cardView = (CardView) Grid2.getChildAt(i);
                final int finalI = i;
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        openActivity2();


                    }
                });

            }
        }
        public void openActivity2(){
            Intent intent = new Intent(this, Activity2.class);
            startActivity(intent);
        }
    }
