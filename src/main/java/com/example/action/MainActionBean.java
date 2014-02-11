package com.example.action;

import com.example.ext.MyActionBeanContext;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

public abstract class MainActionBean implements ActionBean {

    private MyActionBeanContext ctx;

    public MyActionBeanContext getContext() {
        return ctx;
    }

    public void setContext(ActionBeanContext ctx) {
        this.ctx = (MyActionBeanContext) ctx;
    }
}
