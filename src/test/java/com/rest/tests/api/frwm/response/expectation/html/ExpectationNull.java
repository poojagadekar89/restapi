package com.rest.tests.api.frwm.response.expectation.html;

import com.rest.tests.api.frwm.response.expectation.IExpectation;
import com.rest.tests.api.frwm.response.looking.ILookingObject;
import com.rest.tests.api.frwm.response.looking.json.LookingForArray;
import net.minidev.json.JSONArray;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

/**
 * Created by msolosh on 3/30/2016.
 */
public class ExpectationNull implements IExpectation {

    @Override
    public void validate(ILookingObject detected) {
        if (detected instanceof LookingForArray)
        {
            Object[] arr = (Object[])detected.getDetected();
            assertEquals(0, arr.length, "Object is not empty");
        }
        else
        {
            assertNull(detected, "Expected object is not null.");
        }
    }
}
