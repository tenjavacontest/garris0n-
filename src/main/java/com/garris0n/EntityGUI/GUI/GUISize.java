package com.garris0n.EntityGUI.GUI;

public enum GUISize{

    TINY(9),
    SMALL(18),
    MEDIUM(27),
    LARGE(36),
    EXTRA_LARGE(45),
    GIGANTIC(56);

    private int size;

    GUISize(int size){

        this.size = size;

    }

    /**
     * Gets the number of inventory slots that correspond with this GUISize.
     *
     * @return the number of slots
     */
    public int getSize(){

        return size;

    }

}
