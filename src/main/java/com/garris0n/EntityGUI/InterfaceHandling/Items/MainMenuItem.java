package com.garris0n.EntityGUI.InterfaceHandling.Items;

import com.garris0n.EntityGUI.InterfaceHandling.Page;
import com.garris0n.EntityGUI.InterfaceHandling.Types.PagePig;

public enum MainMenuItem{

    PIG(PagePig.class);



    private Class<? extends Page> clazz;

    MainMenuItem(Class<? extends Page> clazz){

        this.clazz = clazz;

    }

    public Page getPage(){

        try{

            return clazz.newInstance();

        }
        catch(InstantiationException e){
            e.printStackTrace();
        }
        catch(IllegalAccessException e){
            e.printStackTrace();
        }

        return null;

    }

}
