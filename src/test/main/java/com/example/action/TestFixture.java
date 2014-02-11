package com.example.action;

import net.sourceforge.stripes.controller.DispatcherServlet;
import net.sourceforge.stripes.controller.StripesFilter;
import net.sourceforge.stripes.mock.MockServletContext;
import org.testng.annotations.BeforeSuite;

import java.util.HashMap;
import java.util.Map;

public class TestFixture {

    private static MockServletContext ctx;

    @BeforeSuite
    public static void setupNonTrivialObjects() {
        TestFixture.ctx = new MockServletContext("test");
        Map<String, String> filterParams = new HashMap<>();
        filterParams.put("ActionResolver.Packages", "com.example.action");
        ctx.addFilter(StripesFilter.class, "StripesFilter", filterParams);

        ctx.setServlet(DispatcherServlet.class, "StripesDispatcher", null);
    }

    public static MockServletContext getServletContext() {
        TestFixture.setupNonTrivialObjects();
        return TestFixture.ctx;
    }

}
