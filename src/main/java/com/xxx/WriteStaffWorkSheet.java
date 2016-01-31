package com.xxx;

import com.xxx.model.Broadcast;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by christophedufour on 17/02/2014.
 */
public class WriteStaffWorkSheet {

    public static void main(String[] args) throws Exception {
        InputStream in = WriteStaffWorkSheet.class.getResourceAsStream("/staffWorkSheetInfo.docx");
        IXDocReport report = XDocReportRegistry.getRegistry().loadReport(in, TemplateEngineKind.Velocity);
        IContext context = report.createContext();

        Map<String, String> studio = new HashMap<String, String>();

        studio.put("Date", "date");
        studio.put("Nowork", "nowork");
        studio.put("Am1", "am1");
        studio.put("Am2", "am2");
        studio.put("Pm1", "pm1");
        studio.put("Pm2", "pm2");
        studio.put("Am_step", "am_step");
        studio.put("Pm_step", "pm_step");
        studio.put("Cast_dawn1", "새벽1");
        studio.put("Cast_dawn2", "새벽2");
        studio.put("Cast_morning1", "아침1");
        studio.put("Cast_morning2", "아침2");
        studio.put("Cast_default1", "통상1");
        studio.put("Cast_default2", "통상2");
        studio.put("Cast_midnight", "저녁");
        studio.put("Total", "total");
        studio.put("Note", "note");
        studio.put("Writer", "writer");

        context.put("studio", studio);

        context.put("broadcasts", Arrays.asList(new Broadcast[]{new Broadcast(1), new Broadcast(2), new Broadcast(3), new Broadcast(4)}));

        //반복되는 object는 addFieldAsList를 호출해 줘야한다.
        FieldsMetadata metadata = new FieldsMetadata();
        metadata.addFieldAsList("broadcasts.Kind");
        metadata.addFieldAsList("broadcasts.Am1");
        metadata.addFieldAsList("broadcasts.Am2");
        metadata.addFieldAsList("broadcasts.Pm1");
        metadata.addFieldAsList("broadcasts.Pm2");
        metadata.addFieldAsList("broadcasts.Total");
        report.setFieldsMetadata(metadata);

        OutputStream out = new FileOutputStream(new File("staffWorkSheetInfo.out.docx"));
        report.process(context, out);

    }


}
