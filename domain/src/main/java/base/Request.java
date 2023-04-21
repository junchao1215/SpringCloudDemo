package base;

import lombok.Data;

@Data
public class Request<T> {
    public Header header;
    public ReqBody reqBody;
}
