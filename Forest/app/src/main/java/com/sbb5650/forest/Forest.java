package com.sbb5650.forest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, int color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void paint(Canvas graphics) {
        Paint paint = new Paint();
        for (Tree tree : trees) {
            draw(graphics, tree.getX(), tree.getY(), tree.getType().getColor(), paint);
        }
    }

    public void draw(Canvas c, int x, int y, int color, Paint paint) {
        //Paint paint = new Paint();
        //paint.setColor(Color.BLACK);
        //c.drawRect(x, y, 15, 15, paint);
        paint.setColor(color);
        c.drawCircle(x, y, 15, paint);
    }
}
