package com.solvd;

import com.solvd.interfaces.Broken;

public abstract class  Infrastructure implements Broken {

    public Infrastructure(){


    }

    @Override
    public String broken() {
        return null;
    }
}
