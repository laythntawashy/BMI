package com.laythntawashy.bmi_project1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fun {
    public static boolean isvValidEmail(String email){
        String emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.+[a-z]+";
        return email.matches(emailPattern);
    }
//    public static boolean isvValidPhone(String x){
//        Pattern pattern = Pattern.compile("^(009665|9665|\\+9665|05)(5|0|3|6|4|9|1|8|7)([0-9]{7})$");
//        Matcher matcher = Pattern.matches(x);
//        return matcher.matches();
//    }
}
