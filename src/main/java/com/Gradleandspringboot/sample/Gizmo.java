/**
 * *********************************************************************
 *  ** COPYRIGHT: FREQUENTIS AG/CNS Solution & Support GmbH
 *  ** Innovationsstrasse 1
 *  ** A-1100 Vienna
 *  ** AUSTRIA
 *  ** Tel. +43 1 81150-0
 *  ** LANGUAGE: Java, J2SE JDK 1.6
 *  **
 *  ** The copyright to the computer program(S) herein is the property of
 *  ** FREQUENTIS AG, Austria. The program(S) shall not be used and/or
 *  ** copied without the written permission of FREQUENTIS AG.
 *  ***********************************************************************
 */
package com.Gradleandspringboot.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DGabos
 * @version 20.05.2015.
 */

public class Gizmo {

    private String field1;
    private String field2;
    private List<GizmoChild> children;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public List<GizmoChild> getChildren() {
        if(children == null) {
            children = new ArrayList<GizmoChild>();
        }
        return children;
    }

    public void setChildren(List<GizmoChild> children) {
        this.children = children;
    }
}
