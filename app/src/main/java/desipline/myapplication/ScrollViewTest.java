package desipline.myapplication;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class ScrollViewTest extends AppCompatActivity {

    ScrollView scrollView01;
    ImageView imageView01;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_test);

        scrollView01 = (ScrollView) findViewById(R.id.scrollView01);
        imageView01 = (ImageView) findViewById(R.id.imageView01);
        Button buton01 = (Button)findViewById(R.id.button01);

        scrollView01.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.seol_heyon);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView01.setImageDrawable(bitmap);
        imageView01.getLayoutParams().width=bitmapWidth;
        imageView01.getLayoutParams().height=bitmapHeight;

    }

    public void onButton01Clicked(View v){
        changeImage();
    }

    private void changeImage(){
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.seol_hyeon2);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView01.setImageDrawable(bitmap);
        imageView01.getLayoutParams().width = bitmapWidth;
        imageView01.getLayoutParams().height = bitmapHeight;
    }




}
