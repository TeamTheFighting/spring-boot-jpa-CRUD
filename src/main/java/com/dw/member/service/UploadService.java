package com.dw.member.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadService {
    
    @Autowired
    private AwsService awsService;

    public boolean uploadImageToAwsS3(MultipartFile[] locationFile){
        String today = new SimpleDateFormat("yyMMdd").format(new Date());
        String imageBasePath = "https://hyunsangwon.pro.s3.ap-northeast-2.amazonaws.com";//디비에 저장할 때 사용
        String imagePath = "/upload/"+today; //이미지를 저장할 폴더
        String imageName = locationFile[0].getName()+today+".jpg";
        try{
            awsService.uploadObject(locationFile[0],imagePath,imageName);
        }catch(Exception e){
            return false;
        }

        return true;
    }
}
