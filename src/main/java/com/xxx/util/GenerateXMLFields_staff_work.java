package com.xxx.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.template.TemplateEngineKind;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;
import com.xxx.model.Broadcast;
import com.xxx.model.Studio;

public class GenerateXMLFields_staff_work {

    public static void main(String[] args) throws XDocReportException,IOException {

        // 1) Create FieldsMetadata by setting Velocity as template engine
        FieldsMetadata fieldsMetadata = new FieldsMetadata(TemplateEngineKind.Velocity.name());

        // 2) Load fields metadata from Java Class
        fieldsMetadata.load("studio", Studio.class);
        // Here load is called with true because model is a list of Developer.
        fieldsMetadata.load("broadcasts", Broadcast.class, true);

        // 3) Generate XML fields in the file "project.fields.xml".
        // Extension *.fields.xml is very important to use it with MS Macro XDocReport.dotm
        // FieldsMetadata#saveXML is called with true to indent the XML.
        File xmlFieldsFile = new File("staff.worksheet.fields.xml");
        fieldsMetadata.saveXML(new FileOutputStream(xmlFieldsFile), true);
    }
}