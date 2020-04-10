package ost006.crypto.hash;

import ost006.hex.Hex;

import java.security.MessageDigest;

public class Sha256 {
    public static byte[] doubleSha256(byte[] message) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(message);
        md.update(md.digest());

        return md.digest();
    }
}
