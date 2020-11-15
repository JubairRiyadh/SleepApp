package jubair.riyadh.sleepapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Sleep extends AppCompatActivity {
    RecyclerView firstrecyclerview;
    public static ArrayList<SleepModel>filearray;
    private boolean isRecyclerViewScrolledToTop;
    ImageView upperback;
    TextView upTv;
    LinearLayout forhide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        firstrecyclerview=findViewById(R.id.firstrecyclerview);
        upperback=findViewById(R.id.upperback);
        forhide=findViewById(R.id.forhide);
        upTv=findViewById(R.id.upTv);

        filearray=new ArrayList<>();

       filearray.add(new SleepModel("Night Island","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
               "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre3,R.raw.sleepmusic));
       filearray.add(new SleepModel("Sweet Sleep","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
               "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre4,R.raw.sleepmusic1));
        filearray.add(new SleepModel("Night Island","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre3,R.raw.sleepmusic1));
        filearray.add(new SleepModel("Sweet Sleep","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre4,R.raw.sleepmusic));
        filearray.add(new SleepModel("Night Island","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre3,R.raw.sleepmusic));
        filearray.add(new SleepModel("Sweet Sleep","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre4,R.raw.sleepmusic1));
        filearray.add(new SleepModel("Night Island","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre3,R.raw.sleepmusic1));
        filearray.add(new SleepModel("Sweet Sleep","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre4,R.raw.sleepmusic));
        filearray.add(new SleepModel("Night Island","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre3,R.raw.sleepmusic));
        filearray.add(new SleepModel("Sweet Sleep","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre4,R.raw.sleepmusic1));
        filearray.add(new SleepModel("Night Island","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre3,R.raw.sleepmusic1));
        filearray.add(new SleepModel("Sweet Sleep","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre4,R.raw.sleepmusic));
        filearray.add(new SleepModel("Night Island","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre3,R.raw.sleepmusic));
        filearray.add(new SleepModel("Sweet Sleep","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre4,R.raw.sleepmusic1));
        filearray.add(new SleepModel("Night Island","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre3,R.raw.sleepmusic1));
        filearray.add(new SleepModel("Sweet Sleep","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre4,R.raw.sleepmusic));
        filearray.add(new SleepModel("Night Island","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre3,R.raw.sleepmusic));
        filearray.add(new SleepModel("Sweet Sleep","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre4,R.raw.sleepmusic1));
        filearray.add(new SleepModel("Night Island","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre3,R.raw.sleepmusic1));
        filearray.add(new SleepModel("Sweet Sleep","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre4,R.raw.sleepmusic));
        filearray.add(new SleepModel("Night Island","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre3,R.raw.sleepmusic));
        filearray.add(new SleepModel("Sweet Sleep","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre4,R.raw.sleepmusic1));
        filearray.add(new SleepModel("Night Island","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre3,R.raw.sleepmusic1));
        filearray.add(new SleepModel("Sweet Sleep","45 MIN . SLEEP MUSIC","Ease the mind into a restful night’s sleep  with\n" +
                "these deep, amblent tones.","24,234 Favorits","34,234 Lestening",R.drawable.firstre4,R.raw.sleepmusic));

        SleepAdapter smsAdapter=new SleepAdapter(Sleep.this,filearray);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(Sleep.this,2,GridLayoutManager.VERTICAL,false);
        firstrecyclerview.setLayoutManager(gridLayoutManager);

        firstrecyclerview.setAdapter(smsAdapter);

        firstrecyclerview.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                forhide.setVisibility(View.GONE);
                upperback.setVisibility(View.VISIBLE);
                upTv.setVisibility(View.VISIBLE);
            }
        });



       // LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
       // firstrecyclerview.setLayoutManager(linearLayoutManager);
       // firstrecyclerview.setAdapter(new SleepAdapter(this,filearray));
       // firstrecyclerview.addItemDecoration(new DividerItemDecoration(this,linearLayoutManager.getOrientation()));

      //  firstrecyclerview.addOnScrollListener(new RecyclerView.OnScrollListener() {
         //   @Override
         //   public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
               // boolean isRecyclerViewScrolledToTop=GridLayoutManager.findFirstVisibleItemPosition()==0
                   //     &&GridLayoutManager.findViewByPosition(0).getTop()==0;
              //  if (isRecyclerViewScrolledToTop)
              //  {
                //    forhide.setVisibility(View.VISIBLE);
               //     upperback.setVisibility(View.GONE);
               // }
               // else {
                 //   forhide.setVisibility(View.GONE);
                //    upperback.setVisibility(View.VISIBLE);
               // }
         //   }
      //  });
    }


    public void backrecyclerview(View view) {
        Intent intent=new Intent(this,Sleep.class);
        startActivity(intent);
    }
}