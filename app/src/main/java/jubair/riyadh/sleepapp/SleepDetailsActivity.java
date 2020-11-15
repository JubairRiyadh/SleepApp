package jubair.riyadh.sleepapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SleepDetailsActivity extends AppCompatActivity {
    int image,music;
    String name,details,fulldes,favorits,lestening;
    ImageView imageViewdetails;
    TextView nameTVdetails,detailsTVdetails,fulldesTVdetails,favTVdetails,lesTVdetails;
    RecyclerView secondrecycler;
    ArrayList<SleepModel> filearray;
    public static final String Name="n";
    public static final String Details="d";
    public static final String Music="m";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_details);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        imageViewdetails=findViewById(R.id.imageViewdetails);
        nameTVdetails=findViewById(R.id.nameTVdetails);
        detailsTVdetails=findViewById(R.id.detailsTVdetails);
        fulldesTVdetails=findViewById(R.id.fulldesTVdetails);
        favTVdetails=findViewById(R.id.favTVdetails);
        lesTVdetails=findViewById(R.id.lesTVdetails);
        secondrecycler=findViewById(R.id.secondrecycler);

        filearray= Sleep.filearray;

        image=getIntent().getIntExtra(SleepAdapter.Image,0);
        name=getIntent().getStringExtra(SleepAdapter.Name);
        details=getIntent().getStringExtra(SleepAdapter.Details);
        fulldes=getIntent().getStringExtra(SleepAdapter.FullDes);
        favorits=getIntent().getStringExtra(SleepAdapter.Favorits);
        lestening=getIntent().getStringExtra(SleepAdapter.Lestening);
        music=getIntent().getIntExtra(SleepAdapter.Music,0);
        imageViewdetails.setImageResource(image);
        nameTVdetails.setText(name);
        detailsTVdetails.setText(details);
        fulldesTVdetails.setText(fulldes);
        favTVdetails.setText(favorits);
        lesTVdetails.setText(lestening);

        

        SleepAdapter smsAdapter=new SleepAdapter(SleepDetailsActivity.this,filearray);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(SleepDetailsActivity.this,2,GridLayoutManager.VERTICAL,false);
        secondrecycler.setLayoutManager(gridLayoutManager);

        secondrecycler.setAdapter(smsAdapter);
    }

    public void musicplayer(View view) {
        Intent intent=new Intent(SleepDetailsActivity.this,PlayerActivity.class);
        intent.putExtra(Name,name);
        intent.putExtra(Details,details);
        intent.putExtra(Music,music);
        startActivity(intent);
    }

    public void backsleepactivity(View view) {
        onBackPressed();
    }
}