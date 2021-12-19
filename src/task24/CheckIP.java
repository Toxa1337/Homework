package task24;

//Составьте регулярное выражение, определяющее, является ли заданная строка IPv4-адресом, записанным в десятичном виде.
// пример правильных выражений: 127.0.0.1, 255.255.255.0;
// пример неправильных выражений: 1300.6.7.8, abc.def.gha.bcd.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIP {
    public static void main(String[] args) {
        IPCheck ip = new IPCheck();
        System.out.println(ip.check("10.253.12.0"));
        System.out.println(ip.check("10.253.12.00"));
        System.out.println(ip.check("1337.253.12.0"));
    }
}

class IPCheck {

    private Pattern pattern;
    private Matcher matcher;

    private static final String IP_PATTERN =
            "^((0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))\\.){3}" +
                    "(0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))$";

    public IPCheck(){
        pattern = Pattern.compile(IP_PATTERN);
    }

    public boolean check(final String ip){
        matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
