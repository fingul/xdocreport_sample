package com.xxx;

import com.xxx.model.Broadcast;
import com.xxx.model.Studio;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;

import java.io.*;
import java.util.Arrays;

/**
 * Created by christophedufour on 17/02/2014.
 */
public class SampleVO {

    public static void main(String[] args) throws Exception {
        // 1) Load ODT file and set Velocity template engine and cache it to the registry
        InputStream in = SampleVO.class.getResourceAsStream("/0.docx");
        IXDocReport report = XDocReportRegistry.getRegistry().loadReport(in, TemplateEngineKind.Velocity);


        IContext context = report.createContext();
        context.put("studio", new Studio(1));
        context.put("broadcasts", Arrays.asList(new Broadcast[]{new Broadcast(1),new Broadcast(2),new Broadcast(3),new Broadcast(4)}));

        //반복되는 object는 addFieldAsList를 호출해 줘야한다.
        FieldsMetadata metadata = new FieldsMetadata();
        metadata.addFieldAsList("broadcasts.Kind");
        metadata.addFieldAsList("broadcasts.Am1");
        metadata.addFieldAsList("broadcasts.Am2");
        metadata.addFieldAsList("broadcasts.Pm1");
        metadata.addFieldAsList("broadcasts.Pm2");
        metadata.addFieldAsList("broadcasts.Total");
        report.setFieldsMetadata(metadata);


        // 3) Generate report by merging Java model with the ODT
        OutputStream out = new FileOutputStream(new File("out.vo.docx"));
        report.process(context, out);

    }





}
