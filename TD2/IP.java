public class IP {

    public static boolean checkIP(String ip) {
        String tmp = "";
        int nbPoint = 0;
        for(int i = 0; i < ip.length(); i++) {
            if(ip.charAt(i) != '.') {
                tmp+= ip.charAt(i);
            } else {
                if(!isInteger(tmp)) return false;
                int chiffre = Integer.parseInt(tmp);
                if(chiffre < 0 || chiffre > 255) return false;
                tmp = "";
                nbPoint++;
            }
        }
        if(ip.charAt(0) == '0') return false;
        if(nbPoint != 3) return false;
        if(ip.endsWith(".")) return false;
        return true;
    }

    public static boolean isInteger ( String s ) {
        try {
        Integer . parseInt ( s );
        return true ;
        } catch ( NumberFormatException nfe ) {
        return false ;
        }
    }

    public static void testCheckIP() {
        String[] validIp = {
            "127.0.0.1",
            "127.231.1.1",
            "1.2.3.4"
        };
        String[] invalidIp = {
            "12.2.3",
            "12.3.213.123.123",
            "1231.12.2.3",
            ".1.2.3",
            "1.2.3.",
            "1.2.3.4.",
            "1.2..3",
            "0.1.2.3"
        };

        for (String ip : validIp) {
            if (!checkIP(ip)) {
                System.out.println("erreur: " + ip);
            }
        }
        for (String ip : invalidIp) {
            if (checkIP(ip)) {
                System.out.println("erreur: " + ip);
            }
        }
    }

    public static void main(String[] args) {
        testCheckIP();
    }

}
