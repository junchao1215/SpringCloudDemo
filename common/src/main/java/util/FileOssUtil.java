package util;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class FileOssUtil implements InitializingBean {
    @Value("${oss.AccessKey_ID}")
    private String accessKey;
    @Value("${oss.AccessKey_Secret}")
    private String accessSecret;
    @Value("${oss.endpoint}")
    private String endpoint;
    @Value("${oss.bucket}")
    private String bucket;

    public static String ENDPOINT;
    public static String ACCESS_KEY_ID;
    public static String SECRECT;
    public static String BUCKET;
    @Override
    public void afterPropertiesSet() throws Exception {
        ENDPOINT = endpoint;
        ACCESS_KEY_ID = accessKey;
        SECRECT = accessSecret;
        BUCKET = bucket;
    }
}
