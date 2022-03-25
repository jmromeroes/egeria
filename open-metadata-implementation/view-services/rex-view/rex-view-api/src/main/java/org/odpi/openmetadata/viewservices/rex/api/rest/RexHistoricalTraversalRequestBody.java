/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.viewservices.rex.api.rest;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;


@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)

public class RexHistoricalTraversalRequestBody extends RexTraversalRequestBody{


    /*
     * The RexTraversalRequestBody class provides a body for REST requests to perform a historical rex-traversal
     */
    private static final long    serialVersionUID = 1L;

    private Date asOfTime = null;


    public RexHistoricalTraversalRequestBody() {
        super();
    }



    /**
     * Return the point in time for the get.
     *
     * @return date object
     */
    public Date getAsOfTime()
    {
        return asOfTime;
    }


    /**
     * Set up the point in time for the get.
     *
     * @param asOfTime date object
     */
    public void setAsOfTime(Date asOfTime)
    {
        this.asOfTime = asOfTime;
    }


    /**
     * Standard toString method.
     *
     * @return print out of variables in a JSON-style
     */
    @Override
    public String toString()
    {
        return "RexHistoricalTraversalRequestBody{" +
                "asOfTime=" + asOfTime + "," +
                super.toString() +
                '}';
    }


    /**
     * Compare the values of the supplied object with those stored in the current object.
     *
     * @param objectToCompare supplied object
     * @return boolean result of comparison
     */
    @Override
    public boolean equals(Object objectToCompare)
    {
        if (this == objectToCompare)
        {
            return true;
        }
        if (!(objectToCompare instanceof RexHistoricalTraversalRequestBody))
        {
            return false;
        }
        if (!super.equals(objectToCompare))
        {
            return false;
        }
        RexHistoricalTraversalRequestBody
                that = (RexHistoricalTraversalRequestBody) objectToCompare;
        return Objects.equals(getAsOfTime(), that.getAsOfTime());
    }


    /**
     * Create a hash code for this element type.
     *
     * @return int hash code
     */
    @Override
    public int hashCode()
    {

        return Objects.hash(super.hashCode(), getAsOfTime());
    }
}