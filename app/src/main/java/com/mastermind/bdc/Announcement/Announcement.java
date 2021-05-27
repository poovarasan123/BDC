package com.mastermind.bdc.Announcement;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

import com.mastermind.bdc.R;

import java.util.ArrayList;

public class Announcement extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.app_theme));
        }
        setContentView(R.layout.activity_announcement);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Announcement");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.app_theme)));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setElevation(0);

        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<announcementModel> announcelist = new ArrayList<>();

        announcelist.add(new announcementModel("21/02/2021","Holiday","Get the latest Company stocks/share market announcements, reports, corporate announcements notices & news on Economic Times."));
        announcelist.add(new announcementModel("22/02/2021","Holiday","LIVE NEWS and UPDATES. Feb 26, 2021 - 15:35 (IST). Assembly Election Dates Announcement LATEST Updates"));
        announcelist.add(new announcementModel("23/02/2021","Holiday","Get the latest Company stocks/share market announcements, reports, corporate announcements notices & news on Economic Times."));
        announcelist.add(new announcementModel("24/02/2021","Holiday","Find Announcement Latest News, Videos & Pictures on Announcement and see latest updates, news, information from NDTV.COM. Explore more on"));
        announcelist.add(new announcementModel("25/02/2021","Holiday","GFind Modi Announcement Latest News, Videos & Pictures on Modi Announcement and see latest updates, news, information from NDTV.COM. Explore more on"));
        announcelist.add(new announcementModel("26/02/2021","Holiday","Major development in terms of Covid-19 vaccination drive! Get more India News and Business News on Zee Business."));
        announcelist.add(new announcementModel("27/02/2021","Holiday","The latest breaking news, comment and features from The Independent."));
        announcelist.add(new announcementModel("28/02/2021","Holiday","Ontario's education minister is expected to make an announcement Friday ... Miriam Katawazi Multi-Platform Writer, CTV News Toronto."));
        announcelist.add(new announcementModel("29/02/2021","Holiday","Get the latest Company stocks/share market announcements, reports, corporate announcements notices & news on Economic Times."));
        announcelist.add(new announcementModel("11/02/2021","Holiday","LIVE NEWS and UPDATES. Feb 26, 2021 - 15:35 (IST). Assembly Election Dates Announcement LATEST Updates"));
        announcelist.add(new announcementModel("21/02/2021","Holiday","Get the latest Company stocks/share market announcements, reports, corporate announcements notices & news on Economic Times."));
        announcelist.add(new announcementModel("12/02/2021","Holiday","Find Announcement Latest News, Videos & Pictures on Announcement and see latest updates, news, information from NDTV.COM. Explore more on"));
        announcelist.add(new announcementModel("13/02/2021","Holiday","GFind Modi Announcement Latest News, Videos & Pictures on Modi Announcement and see latest updates, news, information from NDTV.COM. Explore more on"));
        announcelist.add(new announcementModel("14/02/2021","Holiday","Major development in terms of Covid-19 vaccination drive! Get more India News and Business News on Zee Business."));
        announcelist.add(new announcementModel("15/02/2021","Holiday","The latest breaking news, comment and features from The Independent."));
        announcelist.add(new announcementModel("16/02/2021","Holiday","Ontario's education minister is expected to make an announcement Friday ... Miriam Katawazi Multi-Platform Writer, CTV News Toronto."));

        announcementAdapter adapter = new announcementAdapter(this, announcelist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}