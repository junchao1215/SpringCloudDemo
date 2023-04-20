package com.gateway.exception;

import com.alibaba.fastjson.JSON;
import common.Result;
import global.ExceptionDefine;
import org.springframework.boot.web.reactive.error.ErrorWebExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import reactor.netty.ByteBufMono;

@Configuration
public class GateExceptionHandle implements ErrorWebExceptionHandler {
    @Override
    public Mono<Void> handle(ServerWebExchange exchange, Throwable ex) {
        ServerHttpResponse response = exchange.getResponse();
        Result result = null;
        if(ex instanceof ExceptionDefine){
            int code = ((ExceptionDefine)ex).getCode();
            String message = ((ExceptionDefine)ex).getMessage();
            result = Result.fail(code,message);
        }
        else {
            result = Result.fail(500,ex.getMessage());
        }
        DataBuffer dataBuffer = response.bufferFactory().allocateBuffer()
                .write(JSON.toJSONString(result).getBytes());
        response.setStatusCode(HttpStatus.OK);
        response.getHeaders().setContentType(MediaType.APPLICATION_NDJSON);

        return response.writeAndFlushWith(Mono.just(ByteBufMono.just(dataBuffer)));
    }
}
