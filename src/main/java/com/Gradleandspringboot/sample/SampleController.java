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

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/")
    public String index(Model model) {
        Gizmo gizmo = new Gizmo();
        gizmo.getChildren().add(new GizmoChild());
        model.addAttribute("gizmo", gizmo);
        return "hello";
    }

    @RequestMapping("/save")
    public String save(Gizmo gizmo) {
        System.out.println(gizmo.getField1());
        System.out.println(gizmo.getField2());
        for (GizmoChild child : gizmo.getChildren()) {
            System.out.println(child.getChildField1());
            System.out.println(child.getChildField2());
        }
        return "redirect:/";
    }
}