package jubair.riyadh.sleepapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SleepAdapter extends RecyclerView.Adapter<SleepAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<SleepModel> filearray;
    public static final String Image="i";
    public static final String Name="n";
    public static final String Details="d";
    public static final String FullDes="fd";
    public static final String Favorits="f";
    public static final String Lestening="l";
    public static final String Music="m";

    SleepAdapter(Context context, ArrayList<SleepModel> filearray)
    {
        this.context=context;
        this.filearray=filearray;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View v= layoutInflater.inflate(R.layout.recycle_cardview,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.ImageView.setImageResource(filearray.get(position).Image);
        holder.nameTv.setText(filearray.get(position).Name);
        holder.detailsTv.setText(filearray.get(position).details);
        holder.catLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,SleepDetailsActivity.class);
                intent.putExtra(Image,filearray.get(position).Image);
                intent.putExtra(Name,filearray.get(position).Name);
                intent.putExtra(Details,filearray.get(position).details);
                intent.putExtra(FullDes,filearray.get(position).fulldec);
                intent.putExtra(Favorits,filearray.get(position).favorits);
                intent.putExtra(Lestening,filearray.get(position).lestening);
                intent.putExtra(Music,filearray.get(position).music);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return filearray.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nameTv,detailsTv;
        ImageView ImageView;

        LinearLayout catLinearLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTv=itemView.findViewById(R.id.nameTv);
            detailsTv=itemView.findViewById(R.id.detailsTv);
            ImageView=itemView.findViewById(R.id.ImageView);

            catLinearLayout=itemView.findViewById(R.id.catLinearLayout);

        }
    }

}


