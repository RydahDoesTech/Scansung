package com.idm.core.syncml;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ItemCommand extends Command {
    protected ArrayList<Item> itemList = new ArrayList<>();

    public ArrayList<Item> getItemList() {
        return this.itemList;
    }

    public void setItemList(ArrayList<Item> arrayList) {
        this.itemList = arrayList;
    }
}
