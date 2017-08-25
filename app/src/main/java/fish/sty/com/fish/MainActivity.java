package fish.sty.com.fish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE); //去掉标题栏
        getSupportActionBar().hide();
//        setContentView(R.layout.activity_main);
//        ImageView ivFish = (ImageView) findViewById(R.id.iv_fish);
//        ivFish.setImageDrawable(new FishDrawable());

        setContentView(R.layout.swimming_fish);
    }
}
