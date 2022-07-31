package com.example.cardstackview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.StackFrom;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CardStackView mCardStackView;
    private CardStackLayoutManager mCardStackLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mCardStackLayoutManager = new CardStackLayoutManager(this);
        mCardStackLayoutManager.setStackFrom(StackFrom.Top);
        mCardStackLayoutManager.setVisibleCount(3);

        mCardStackView = findViewById(R.id.myCardStackView);
        mCardStackView.setLayoutManager(mCardStackLayoutManager);


        ArrayList<String> laysNames = new ArrayList<>();
        laysNames.add("Honey Barbecue");
        laysNames.add("Cheddar & SourCream");
        laysNames.add("SourCream & Onion");
        laysNames.add("WAVY");
        laysNames.add("Salt & Vinegar");

        ArrayList<Integer> laysImgs = new ArrayList<>();
        laysImgs.add(R.drawable.lays1);
        laysImgs.add(R.drawable.lays2);
        laysImgs.add(R.drawable.lays3);
        laysImgs.add(R.drawable.lays4);
        laysImgs.add(R.drawable.lays5);

        mCardStackView.setAdapter(new LaysStackAdapter(this, laysNames, laysImgs));

    }
}