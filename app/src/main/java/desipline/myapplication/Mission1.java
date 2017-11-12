package desipline.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Mission1 extends AppCompatActivity {
    ImageView imageView01;
    ImageView imageView02;

    boolean selected =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission1);

        imageView01 = (ImageView)findViewById(R.id.imageView01);
        imageView02 = (ImageView)findViewById(R.id.imageView02);
        ImageButton button01 = (ImageButton)findViewById(R.id.button01);
        ImageButton button02 = (ImageButton)findViewById(R.id.button02);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageChange();
            }
        });
    }//end onCreate

    private void imageChange(){
        if(selected){
            imageView01.setVisibility(View.INVISIBLE);
            imageView02.setVisibility(View.VISIBLE);
        }else{
            imageView01.setVisibility(View.VISIBLE);
            imageView02.setVisibility(View.INVISIBLE);
        }
        selected = !selected;
    }
}
