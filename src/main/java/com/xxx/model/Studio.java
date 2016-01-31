package com.xxx.model;

/**
 * Created by m on 1/23/16.
 */
public class Studio {

    public Studio(int n) {

        this.date = String.format("date %d", n);
        this.nowork = String.format("nowork %d", n);
        this.am1 = String.format("am1 %d", n);
        this.am2 = String.format("am2 %d", n);
        this.pm1 = String.format("pm1 %d", n);
        this.pm2 = String.format("pm2 %d", n);
        this.am_step = String.format("am_step %d", n);
        this.pm_step = String.format("pm_step %d", n);
        this.cast_dawn1="dawn1";
        this.cast_dawn2="dawn2";
        this.cast_morning1="morning1";
        this.cast_morning2="morning2";
        this.cast_default1="default1";
        this.cast_default2="default2";
        this.cast_midnight="midnight";
        this.cast_nowork="nowork";

        this.total = String.format("total %d", n);
        this.note = String.format("note %d", n);
        this.writer = String.format("writer %d", n);
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNowork(String nowork) {
        this.nowork = nowork;
    }

    public void setAm1(String am1) {
        this.am1 = am1;
    }

    public void setAm2(String am2) {
        this.am2 = am2;
    }

    public void setPm1(String pm1) {
        this.pm1 = pm1;
    }

    public void setPm2(String pm2) {
        this.pm2 = pm2;
    }

    public void setCast_dawn1(String cast_dawn1) {
        this.cast_dawn1 = cast_dawn1;
    }

    public void setCast_dawn2(String cast_dawn2) {
        this.cast_dawn2 = cast_dawn2;
    }

    public void setCast_morning1(String cast_morning1) {
        this.cast_morning1 = cast_morning1;
    }

    public void setCast_morning2(String cast_morning2) {
        this.cast_morning2 = cast_morning2;
    }

    public void setCast_default1(String cast_default1) {
        this.cast_default1 = cast_default1;
    }

    public void setCast_default2(String cast_default2) {
        this.cast_default2 = cast_default2;
    }

    public void setCast_midnight(String cast_midnight) {
        this.cast_midnight = cast_midnight;
    }

    public void setCast_nowork(String cast_nowork) {
        this.cast_nowork = cast_nowork;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setAm_step(String am_step) {
        this.am_step = am_step;
    }

    public void setPm_step(String pm_step) {
        this.pm_step = pm_step;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    String date;
    String nowork;
    String am1;
    String am2;
    String pm1;
    String pm2;

    String cast_dawn1;
    String cast_dawn2;
    String cast_morning1;
    String cast_morning2;
    String cast_default1;
    String cast_default2;
    String cast_midnight;
    String cast_nowork;

    String total;
    String am_step;
    String pm_step;
    String note;
    String writer;

    public String getDate() {
        return date;
    }

    public String getNowork() {
        return nowork;
    }

    public String getAm1() {
        return am1;
    }

    public String getAm2() {
        return am2;
    }

    public String getPm1() {
        return pm1;
    }

    public String getPm2() {
        return pm2;
    }

    public String getTotal() {
        return total;
    }

    public String getAm_step() {
        return am_step;
    }

    public String getPm_step() {
        return pm_step;
    }

    public String getNote() {
        return note;
    }

    public String getWriter() {
        return writer;
    }

    public String getCast_dawn1() {
        return cast_dawn1;
    }

    public String getCast_dawn2() {
        return cast_dawn2;
    }

    public String getCast_morning1() {
        return cast_morning1;
    }

    public String getCast_morning2() {
        return cast_morning2;
    }

    public String getCast_default1() {
        return cast_default1;
    }

    public String getCast_default2() {
        return cast_default2;
    }

    public String getCast_midnight() {
        return cast_midnight;
    }

    public String getCast_nowork() {
        return cast_nowork;
    }
}
