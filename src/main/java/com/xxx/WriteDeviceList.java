package com.xxx;

import com.xxx.model.Broadcast;
import com.xxx.model.DeviceList;
import com.xxx.model.DeviceListItem;
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
import java.util.HashMap;
import java.util.Map;

/**
 * Created by christophedufour on 17/02/2014.
 */
public class WriteDeviceList {

    public static void main(String[] args) throws Exception {
        InputStream in = WriteDeviceList.class.getResourceAsStream("/device_list.docx");
        IXDocReport report = XDocReportRegistry.getRegistry().loadReport(in, TemplateEngineKind.Velocity);
        IContext context = report.createContext();

        DeviceList devicelist = new DeviceList("1234-56-78 12:34:56");

        context.put("devicelist", devicelist);

        context.put("devicelistitem", Arrays.asList(new DeviceListItem[]{new DeviceListItem(1), new DeviceListItem(2), new DeviceListItem(3)}));


        // merged cell 사용을 위해 , 아래 내용되아래 내용대로 수정
        // https://github.com/opensagres/xdocreport/wiki/DocxReportingJavaMainListFieldAdvancedTable#solution-use-before-row-after-row

        //반복되는 object는 addFieldAsList를 호출해 줘야한다.
        FieldsMetadata metadata = new FieldsMetadata();
        metadata.addFieldAsList("devicelistitem.COUNT");
        metadata.addFieldAsList("devicelistitem.ACC_NM");
        metadata.addFieldAsList("devicelistitem.UP_ASSET_NM");
        metadata.addFieldAsList("devicelistitem.ASSET_NM");
        metadata.addFieldAsList("devicelistitem.MAKER");
        metadata.addFieldAsList("devicelistitem.RECEIV_DATE");
        metadata.addFieldAsList("devicelistitem.RECEIV_AMT");
        metadata.addFieldAsList("devicelistitem.USE_YN");
        metadata.addFieldAsList("devicelistitem.SPEC");
        metadata.addFieldAsList("devicelistitem.MODEL_NM");
        metadata.addFieldAsList("devicelistitem.SUPPLIER");
        metadata.addFieldAsList("devicelistitem.LOCATION");
        metadata.addFieldAsList("devicelistitem.QTY");
        metadata.addFieldAsList("devicelistitem.UNIT_NM");
        metadata.addFieldAsList("devicelistitem.MAINT_YN");
        metadata.addFieldAsList("devicelistitem.EQUIP_FUNCTION");
        metadata.addFieldAsList("devicelistitem.EQUIP_USE_DESC");
        metadata.addFieldAsList("devicelistitem.REMARKS");
        metadata.addFieldAsList("devicelistitem.UP_ASSET_CD");
        metadata.addFieldAsList("devicelistitem.LIVED_YEAR_CNT");

        report.setFieldsMetadata(metadata);

        OutputStream out = new FileOutputStream(new File("device_list.out.docx"));
        report.process(context, out);

    }


}
