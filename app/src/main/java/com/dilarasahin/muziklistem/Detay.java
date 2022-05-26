package com.dilarasahin.muziklistem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.dilarasahin.muziklistem.databinding.ActivityDetayBinding;

import java.util.ArrayList;

public class Detay extends AppCompatActivity {
    private ActivityDetayBinding binding;
    MediaPlayer mediaPlayer;
    ImageButton imageButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetayBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        imageButton.setImageResource(R.drawable.ic_baseline);





        Intent intent = getIntent();
        Icerik selected = (Icerik) intent.getSerializableExtra("icerik");


        binding.kimeAit.setText(selected.kimeait);
        binding.sarkiIsim.setText(selected.sarkiisim);
        binding.imageView.setImageResource(selected.image);

        binding.buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.sarkiIsim.getText().toString().matches("Simple Math")){
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.ma_or_simplemath);
                    mediaPlayer.start();
                    binding.buttton.setImageResource(R.drawable.ic_baseline);



                }
                else if (binding.sarkiIsim.getText().toString().matches("The Silence")){
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.thesilence);
                    mediaPlayer.start();
                    binding.buttton.setImageResource(R.drawable.ic_baseline);

                }
                else if (binding.sarkiIsim.getText().toString().matches("Wrecked")){
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.imagine_wrecked);
                    mediaPlayer.start();
                    binding.buttton.setImageResource(R.drawable.ic_baseline);

                }
                else if (binding.sarkiIsim.getText().toString().matches("Renegades")){
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.renegades);
                    mediaPlayer.start();
                    binding.buttton.setImageResource(R.drawable.ic_baseline);

                }
            }
        });








    }



}