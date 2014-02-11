package com.example.action;


import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

public class HomeActionBean extends MainActionBean {

    private static final String INDEX = "/pages/index.jsp";

    public Resolution index() {
        return new ForwardResolution(INDEX);
    }

}
