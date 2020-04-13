package com.sbb5650.forest;

//TreeIterator.java
public class TreeIterator implements Iterator<Tree> {

    private Tree[] trees;
    private int position;

    public TreeIterator(Tree[] trees)
    {
        this.trees = trees;
        position = 0;
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public Tree next() {
        return trees[position++];
    }

    @Override
    public Tree currentItem() {
        return trees[position];
    }

    @Override
    public boolean hasNext() {
        if(position >= trees.length)
            return false;
        return true;
    }
}