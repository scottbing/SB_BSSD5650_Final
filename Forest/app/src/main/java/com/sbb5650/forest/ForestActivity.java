package com.sbb5650.forest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.Random;


public class ForestActivity extends AppCompatActivity {

    private DemoView demoview;
    //static int TREES_TO_DRAW = 1000000;
    static int TREES_TO_DRAW = 3510;
    static int TREE_TYPES = 4;
    private int width = 0;
    private int height = 0;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        demoview = new DemoView(this);
        setContentView(demoview);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
        Log.e("Width", "" + width);
        Log.e("height", "" + height);

    }

    public class DemoView extends View{
        public DemoView(Context context){
            super(context);
        }

        @Override protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            // create instance of Random class
            Random random = new Random();

            Forest forest = new Forest();
            for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
                forest.plantTree(random.nextInt(width), random.nextInt(height),
                        "Summer Oak", Color.GREEN, "Oak texture stub");
                forest.plantTree(random.nextInt(width), random.nextInt(height),
                        "Autumn Oak", Color.YELLOW, "Autumn Oak texture stub");
                forest.plantTree(random.nextInt(width), random.nextInt(height),
                        "Red Maple", Color.RED, "Autumn Oak texture stub");
                forest.plantTree(random.nextInt(width), random.nextInt(height),
                        "Oak", Color.BLACK, "Autumn Oak texture stub");
            }

            // custom drawing code here
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);

            // make the entire canvas white
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);

            // draw the trees
            forest.paint(canvas);

            //undo the rotate
            //canvas.restore();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
