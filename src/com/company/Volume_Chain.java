package com.company;

/*
 * Created by Garrett on 4/21/14.
 */

import java.util.ArrayList;
import java.util.List;

public class Volume_Chain implements Chain {

    private List<Volume> volumes = new ArrayList<Volume>();

    // constructor
    public Volume_Chain() {
        // initialize variables

    }

    @Override
    public void add_to_chain(Chainable obj)
    {
        volumes.add((Volume) obj);
    }

    @Override
    public void print_chain()
    {
        System.out.print("Volumes: [");
        for (Volume v : volumes)
        {
            System.out.print(" " + String.format("%1$,.2f", v.getVol()) + " ");
        }
        System.out.println("]");
    }

}