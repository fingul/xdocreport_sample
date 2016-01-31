package com.xxx;

import com.xxx.model.DeviceReportAnytime;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by christophedufour on 17/02/2014.
 */
public class WriteDeviceReportAnytime {

    public static void main(String[] args) throws Exception {

        InputStream in = WriteDeviceReportAnytime.class.getResourceAsStream("/device_report_anytime.docx");
        IXDocReport report = XDocReportRegistry.getRegistry().loadReport(in, TemplateEngineKind.Velocity);
        IContext context = report.createContext();

        DeviceReportAnytime i = new DeviceReportAnytime();

        context.put("i", i);


        OutputStream out = new FileOutputStream(new File("device_report_anytime.out.docx"));
        report.process(context, out);

    }


}
