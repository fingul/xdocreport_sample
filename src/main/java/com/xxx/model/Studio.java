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
        this.cast = String.format("cast %d", n);
        this.total = String.format("total %d", n);
        this.note = String.format("note %d", n);
        this.writer = String.format("writer %d", n);
    }

    String date;
    String nowork;
    String am1;
    String am2;
    String pm1;
    String pm2;

    String cast;
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

    public String getCast() {
        return cast;
    }
}
