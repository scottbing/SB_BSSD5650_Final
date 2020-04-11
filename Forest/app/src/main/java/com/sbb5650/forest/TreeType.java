package com.sbb5650.forest;

import android.graphics.Color;

public class TreeType {

    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType() {
    }

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getOtherTreeData() {
        return otherTreeData;
    }

    public void setOtherTreeData(String otherTreeData) {
        this.otherTreeData = otherTreeData;
    }
}
