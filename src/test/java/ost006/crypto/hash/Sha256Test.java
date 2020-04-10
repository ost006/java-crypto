package ost006.crypto.hash;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.Test;
import ost006.hex.Hex;

import java.util.HashMap;
import java.util.Map;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class Sha256Test {
    private static final Logger log = LoggerFactory.getLogger(Sha256Test.class);

    @Test
    public void DoubleSha256Test() throws Exception {
        byte[] message = Hex.hexStringToByteArray("feffffff");

        byte[] hash = Sha256.doubleSha256(message);
        String hexHash = Hex.byteArrayToHexString(hash);

        System.out.println(hexHash);
    }
}
