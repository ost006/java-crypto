import org.junit.Test;

import java.security.MessageDigest;

public class Sha256Test {
    @Test
    public void hexTest() throws Exception {

    }

    @Test
    public void doubleSha256Test() throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] message = hexStringToByteArray("feffffff");
        md.update(message);
        md.update(md.digest());

        System.out.println(byteArrayToHexString(md.digest()).toLowerCase());
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }

    public static String byteArrayToHexString(byte[] bytes){
        StringBuilder sb = new StringBuilder();
        for(byte b : bytes){
            sb.append(String.format("%02X", b&0xff));
        }
        return sb.toString();
    }
}
