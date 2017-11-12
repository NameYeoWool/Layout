package desipline.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameLayoutTest extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    //int imageIndex  = 0 ;
    boolean selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_test);

        imageView1 = (ImageView)findViewById(R.id.imageView11);
        imageView2 = (ImageView)findViewById(R.id.imageView12);
        Button button = (Button)findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    imageView1.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.GONE);
                }else{
                    imageView1.setVisibility(View.GONE);
                    imageView2.setVisibility(View.VISIBLE);
                }
                selected = !selected;
            }
        });

    }

    /*
    public void onButton1Clicked(View v){
        changeImage();
    }

    private void changeImage(){
        if(imageIndex == 0 ){
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);

            imageIndex = 1;
        }else{
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);

            imageIndex = 0;
        }

    }*/
}
