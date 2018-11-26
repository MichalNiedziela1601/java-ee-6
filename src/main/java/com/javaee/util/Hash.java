package com.javaee.util;

import javax.servlet.ServletException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {

    public static String hashText(String text) throws ServletException {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes = text.getBytes();
            md.update(bytes,0,bytes.length);
            BigInteger hash = new BigInteger(1,md.digest());
            return String.format("%1$032X",hash);
        } catch(NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            throw new ServletException("Hash algorithm not services");
        }
    }

}
