package util.Iot;

import com.aliyun.iot20180120.models.RRpcResponse;
import com.aliyun.tea.*;
import org.springframework.beans.factory.annotation.Value;

import java.util.Base64;
import java.util.UUID;

public class IotUtil  {
    @Value("${Iot.accessKey}")
    private String accessKey="";
    @Value("${Iot.accessSecret}")
    private String accessSecret;
    @Value("${Iot.RegionId}")
    private String RegionId;

    // This file is auto-generated, don't edit it. Thanks.

        /**
         * 使用AK&SK初始化账号Client
         * @param accessKeyId
         * @param accessKeySecret
         * @return Client
         * @throws Exception
         */
        public static com.aliyun.iot20180120.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
            com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config()
                    // 必填，您的 AccessKey ID
                    .setAccessKeyId(accessKeyId)
                    // 必填，您的 AccessKey Secret
                    .setAccessKeySecret(accessKeySecret);
            // 访问的域名
            config.endpoint = "iot.cn-shanghai.aliyuncs.com";
            return new com.aliyun.iot20180120.Client(config);
        }

        public static void main(String[] args_) throws Exception {
            java.util.List<String> args = java.util.Arrays.asList(args_);
            // 工程代码泄露可能会导致AccessKey泄露，并威胁账号下所有资源的安全性。以下代码示例仅供参考，建议使用更安全的 STS 方式，更多鉴权访问方式请参见：https://help.aliyun.com/document_detail/378657.html
            com.aliyun.iot20180120.Client client = IotUtil.createClient("LTAI5tNqMJs5DMvFYSSJ7ESg", "EATwU5SyFuSbtnMk0IuYgJ49NUY3Y1");
            com.aliyun.iot20180120.models.RRpcRequest rRpcRequest = new com.aliyun.iot20180120.models.RRpcRequest();
            String id = UUID.randomUUID().toString();
            String payload="{\"id\": "+id+",\"version\": \"1.0\",\"sys\":{\"ack\":0},\"params\": {\"PowerSwitch\": {\"value\": 0}},\"method\": \"thing.event.property.post\"}";
//            String payload="{\"PowerSwitch\":0}";

            rRpcRequest
                    .setIotInstanceId("iot-06z00axixqbzs4e")
                    .setProductKey("idx6L96673l")
                    .setDeviceName("dht11")
                    .setRequestBase64Byte(Base64.getEncoder().encodeToString(payload.getBytes()))
                    .setTopic("/sys/idx6L96673l/dht11/thing/event/property/post")
                    .setTimeout(5000);
            com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
            try {
                // 复制代码运行请自行打印 API 的返回值
                RRpcResponse rRpcResponse = client.rRpcWithOptions(rRpcRequest, runtime);

                System.out.println(rRpcResponse.getBody().getErrorMessage());
//                client.rRpcWithOptions(RRpcRequest, runtime);
            } catch (TeaException error) {
                // 如有需要，请打印 error
                com.aliyun.teautil.Common.assertAsString(error.message);
            } catch (Exception _error) {
                TeaException error = new TeaException(_error.getMessage(), _error);
                // 如有需要，请打印 error
                _error.printStackTrace();
                com.aliyun.teautil.Common.assertAsString(error.message);
            }
        }

}
