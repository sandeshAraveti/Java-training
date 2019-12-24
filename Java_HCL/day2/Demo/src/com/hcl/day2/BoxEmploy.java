package com.hcl.day2;

public class BoxEmploy {
    public void show(Object ob) {
        String type = ob.getClass().getSimpleName();
        if (type.equals("Employ")) {
            Employ e = (Employ) ob;
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Employ employ = new Employ();
        employ.empno = 1;
        employ.name = "Sai";
        employ.basic = 88524;
        new BoxEmploy().show(employ);
    }
}
