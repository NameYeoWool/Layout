package desipline.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;

public class Mission1 extends AppCompatActivity {
    ImageView imageView01;
    ImageView imageView02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission1);

        imageView01 = (ImageView)findViewById(R.id.imageView01);
        imageView02 = (ImageView)findViewById(R.id.imageView02);

        ImageButton button01 = (ImageButton)findViewById(R.id.imageButton01);
        ImageButton button02 = (ImageButton)findViewById(R.id.imageButton02);


        button01.setImageDrawable(getResources().getDrawable(R.drawable.north_arrow));
        button02.setImageDrawable(getResources().getDrawable(R.drawable.south_arrow));

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageChange();
            }
        });
    }//end onCreate

    private void imageChange(){
        imageView01.setVisibility(View.VISIBLE);
        imageView02.setVisibility(View.INVISIBLE);
    }

    public void onButton01Clicked(View v ){
        imageChange2();
    }

    private void imageChange2(){
        imageView01.setVisibility(View.INVISIBLE);
        imageView02.setVisibility(View.VISIBLE);
    }
}
