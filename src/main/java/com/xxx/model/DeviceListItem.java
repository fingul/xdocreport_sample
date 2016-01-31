package com.xxx.model;

/**
 * Created by m on 2/1/16.
 */
public class DeviceListItem {

    public DeviceListItem(int n) {

        this.COUNT=String.format("COUNT %d",n);
        this.ACC_NM=String.format("ACC_NM %d",n);
        this.UP_ASSET_NM=String.format("UP_ASSET_NM %d",n);
        this.ASSET_NM=String.format("ASSET_NM %d",n);
        this.MAKER=String.format("MAKER %d",n);
        this.RECEIV_DATE=String.format("RECEIV_DATE %d",n);
        this.RECEIV_AMT=String.format("RECEIV_AMT %d",n);
        this.USE_YN=String.format("USE_YN %d",n);
        this.SPEC=String.format("SPEC %d",n);
        this.MODEL_NM=String.format("MODEL_NM %d",n);
        this.SUPPLIER=String.format("SUPPLIER %d",n);
        this.LOCATION=String.format("LOCATION %d",n);
        this.QTY=String.format("QTY %d",n);
        this.UNIT_NM=String.format("UNIT_NM %d",n);
        this.MAINT_YN=String.format("MAINT_YN %d",n);
        this.EQUIP_FUNCTION=String.format("EQUIP_FUNCTION %d",n);
        this.EQUIP_USE_DESC=String.format("EQUIP_USE_DESC %d",n);
        this.REMARKS=String.format("REMARKS %d",n);
        this.UP_ASSET_CD=String.format("UP_ASSET_CD %d",n);
        this.LIVED_YEAR_CNT=String.format("LIVED_YEAR_CNT %d",n);


    }

    String COUNT;
    String ACC_NM;
    String UP_ASSET_NM;
    String ASSET_NM;
    String MAKER;
    String RECEIV_DATE;
    String RECEIV_AMT;
    String USE_YN;
    String SPEC;
    String MODEL_NM;
    String SUPPLIER;
    String LOCATION;
    String QTY;
    String UNIT_NM;
    String MAINT_YN;
    String EQUIP_FUNCTION;
    String EQUIP_USE_DESC;
    String REMARKS;
    String UP_ASSET_CD;
    String LIVED_YEAR_CNT;

    public String getCOUNT() {
        return COUNT;
    }

    public void setCOUNT(String COUNT) {
        this.COUNT = COUNT;
    }

    public String getACC_NM() {
        return ACC_NM;
    }

    public void setACC_NM(String ACC_NM) {
        this.ACC_NM = ACC_NM;
    }

    public String getUP_ASSET_NM() {
        return UP_ASSET_NM;
    }

    public void setUP_ASSET_NM(String UP_ASSET_NM) {
        this.UP_ASSET_NM = UP_ASSET_NM;
    }

    public String getASSET_NM() {
        return ASSET_NM;
    }

    public void setASSET_NM(String ASSET_NM) {
        this.ASSET_NM = ASSET_NM;
    }

    public String getMAKER() {
        return MAKER;
    }

    public void setMAKER(String MAKER) {
        this.MAKER = MAKER;
    }

    public String getRECEIV_DATE() {
        return RECEIV_DATE;
    }

    public void setRECEIV_DATE(String RECEIV_DATE) {
        this.RECEIV_DATE = RECEIV_DATE;
    }

    public String getRECEIV_AMT() {
        return RECEIV_AMT;
    }

    public void setRECEIV_AMT(String RECEIV_AMT) {
        this.RECEIV_AMT = RECEIV_AMT;
    }

    public String getUSE_YN() {
        return USE_YN;
    }

    public void setUSE_YN(String USE_YN) {
        this.USE_YN = USE_YN;
    }

    public String getSPEC() {
        return SPEC;
    }

    public void setSPEC(String SPEC) {
        this.SPEC = SPEC;
    }

    public String getMODEL_NM() {
        return MODEL_NM;
    }

    public void setMODEL_NM(String MODEL_NM) {
        this.MODEL_NM = MODEL_NM;
    }

    public String getSUPPLIER() {
        return SUPPLIER;
    }

    public void setSUPPLIER(String SUPPLIER) {
        this.SUPPLIER = SUPPLIER;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }

    public String getQTY() {
        return QTY;
    }

    public void setQTY(String QTY) {
        this.QTY = QTY;
    }

    public String getUNIT_NM() {
        return UNIT_NM;
    }

    public void setUNIT_NM(String UNIT_NM) {
        this.UNIT_NM = UNIT_NM;
    }

    public String getMAINT_YN() {
        return MAINT_YN;
    }

    public void setMAINT_YN(String MAINT_YN) {
        this.MAINT_YN = MAINT_YN;
    }

    public String getEQUIP_FUNCTION() {
        return EQUIP_FUNCTION;
    }

    public void setEQUIP_FUNCTION(String EQUIP_FUNCTION) {
        this.EQUIP_FUNCTION = EQUIP_FUNCTION;
    }

    public String getEQUIP_USE_DESC() {
        return EQUIP_USE_DESC;
    }

    public void setEQUIP_USE_DESC(String EQUIP_USE_DESC) {
        this.EQUIP_USE_DESC = EQUIP_USE_DESC;
    }

    public String getREMARKS() {
        return REMARKS;
    }

    public void setREMARKS(String REMARKS) {
        this.REMARKS = REMARKS;
    }

    public String getUP_ASSET_CD() {
        return UP_ASSET_CD;
    }

    public void setUP_ASSET_CD(String UP_ASSET_CD) {
        this.UP_ASSET_CD = UP_ASSET_CD;
    }

    public String getLIVED_YEAR_CNT() {
        return LIVED_YEAR_CNT;
    }

    public void setLIVED_YEAR_CNT(String LIVED_YEAR_CNT) {
        this.LIVED_YEAR_CNT = LIVED_YEAR_CNT;
    }
}
