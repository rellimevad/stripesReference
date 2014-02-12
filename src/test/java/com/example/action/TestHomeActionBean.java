package com.example.action;

import net.sourceforge.stripes.mock.MockRoundtrip;
import net.sourceforge.stripes.mock.MockServletContext;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomeActionBean {

    @Test
    public void testIndex() throws Exception {
        // setup the servlet engine
        MockServletContext ctx = TestFixture.getServletContext();

        MockRoundtrip trip = new MockRoundtrip(ctx, HomeActionBean.class);
        trip.execute();

        Assert.assertEquals(trip.getDestination(), "/pages/index.jsp");
    }

}
