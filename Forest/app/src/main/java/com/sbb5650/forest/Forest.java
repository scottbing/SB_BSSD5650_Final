package com.sbb5650.forest;

import android.graphics.Canvas;
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
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
