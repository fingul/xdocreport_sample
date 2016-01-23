package com.xxx.model;

/**
 * Created by m on 1/23/16.
 */
public class Broadcast {

    public Broadcast(int n) {

        this.kind =     String.format("kind %d", n);
        this.am1 =      "홍길동\n김기수\n규식이";
        this.am2 =      String.format("am2 %d", n);;
        this.pm1 =      String.format("여러\n줄로\n출력 %d", n);;
        this.pm2 =      String.format("pm2 %d", n);;
        this.total =    String.format("total %d", n);;
    }

    String kind;
    String am1;
    String am2;
    String pm1;
    String pm2;
    String total;


    public String getKind() {
        return kind;
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
}
