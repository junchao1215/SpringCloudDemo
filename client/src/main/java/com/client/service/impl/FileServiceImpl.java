package com.client.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.CannedAccessControlList;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.SetObjectAclRequest;
import com.client.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import util.FileOssUtil;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String upload(MultipartFile file) {

        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = FileOssUtil.ENDPOINT;
        String accessKeyId = FileOssUtil.ACCESS_KEY_ID;
        String accessKeySecret = FileOssUtil.SECRECT;
        String bucketName = FileOssUtil.BUCKET;

        try {
            // 创建OSSClient实例。
            OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
            // 上传文件流。
            InputStream inputStream = null;
            inputStream = file.getInputStream();
            String fileName = file.getOriginalFilename();

            //生成随机唯一值，使用uuid，添加到文件名称里面
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            fileName = uuid+fileName;

            //按照当前日期，创建文件夹，上传到创建文件夹里面
            //  2021/02/02/01.jpg
            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            String timeUrl = format.format(new Date());
            fileName = timeUrl+"/"+fileName;

            ossClient.putObject(bucketName,fileName,inputStream);
            // 关闭OSSClient。
            ossClient.shutdown();
            //上传之后文件路径
            // https://lewang-yygh.oss-cn-hangzhou.aliyuncs.com/01.jpg
            String url = "https://"+bucketName+"."+endpoint+"/"+fileName;//返回
            return url;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}