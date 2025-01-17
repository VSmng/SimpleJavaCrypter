package Hash;

import GUI.AlertDialog;

import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class MD5 {

    private MessageDigest messageDigest;

    MD5() {
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    String getHashFromText(String text) {
        messageDigest.update(text.getBytes());
        byte[] digest = messageDigest.digest();

        BigInteger bigInt = new BigInteger(1, digest);
        StringBuilder md5Hex = new StringBuilder(bigInt.toString(16));

        while( md5Hex.length() < 32 ){
            md5Hex.insert(0, "0");
        }

        return md5Hex.toString();
    }

    String getHashFromFile(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int read = 0;
            while ((read = fis.read(buffer)) != -1) {
                messageDigest.update(buffer, 0, read);
            };
            fis.close();
            byte[] digest = messageDigest.digest();

            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            AlertDialog.showError("Error getting MD5 hash!", e.getMessage());
        }
        return null;
    }

}
