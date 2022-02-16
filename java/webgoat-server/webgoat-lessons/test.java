public static String getPrivateKeyInPEM(KeyPair keyPair) {
        String encodedString = "-----BEGIN PRIVATE KEY-----\n";
        encodedString = encodedString+new String(Base64.getEncoder().encode(keyPair.getPrivate().getEncoded()),Charset.forName("UTF-8"))+"\n";
        encodedString = encodedString+"-----END PRIVATE KEY-----\n";
        return encodedString;
    }
