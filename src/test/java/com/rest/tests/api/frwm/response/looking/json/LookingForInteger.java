package com.rest.tests.api.frwm.response.looking.json;

import com.jayway.jsonpath.JsonPath;
import com.rest.tests.api.frwm.response.looking.ILookingObject;

/**
 * Created by msolosh on 3/29/2016.
 */
public class LookingForInteger implements ILookingObject {

    private String type = "Integer";
    private int detected;

    public LookingForInteger(Object response, String xpath) {
        this.detected = JsonPath.read(response, xpath);
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public Object getDetected() {
        return this.detected;
    }
}
