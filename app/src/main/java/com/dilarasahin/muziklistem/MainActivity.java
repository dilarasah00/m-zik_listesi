package com.dilarasahin.muziklistem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.dilarasahin.muziklistem.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Icerik> Icerikarraylist;

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        Icerikarraylist = new ArrayList<>();


        Icerik simplemath = new Icerik(R.drawable.rr1,"Manchester Orchestra","Simple Math");
        Icerik silence = new Icerik(R.drawable.rr22,"Manchester Orchestra","The Silence");
        Icerik wrecked = new Icerik(R.drawable.rr3,"Imagine Dragons"," Wrecked");
        Icerik renegades = new Icerik(R.drawable.rr4," X Ambassadors"," Renegades");

        Icerikarraylist.add(simplemath);
        Icerikarraylist.add(silence);
        Icerikarraylist.add(wrecked);
        Icerikarraylist.add(renegades);



        binding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
        IcerikAdaptor icerikAdaptor = new IcerikAdaptor(Icerikarraylist);
        binding.recyclerview.setAdapter(icerikAdaptor);


    }
}