package com.xxx;

import com.xxx.model.DeviceList;
import com.xxx.model.DeviceListItem;
import com.xxx.model.DeviceReportWeekly;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * Created by christophedufour on 17/02/2014.
 */
public class WriteDeviceReportWeekly {

    public static void main(String[] args) throws Exception {

        InputStream in = WriteDeviceReportWeekly.class.getResourceAsStream("/device_report_weekly.docx");
        IXDocReport report = XDocReportRegistry.getRegistry().loadReport(in, TemplateEngineKind.Velocity);
        IContext context = report.createContext();

        DeviceReportWeekly i = new DeviceReportWeekly();

        context.put("i", i);


        OutputStream out = new FileOutputStream(new File("device_report_weekly.out.docx"));
        report.process(context, out);

    }


}
