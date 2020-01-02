package com.example.feign.controller;

import com.example.feign.rpc.RpcServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author jim clark
 * @version 1.0
 */
@RequestMapping("/feign")
@RestController
@Api(value = "数据源驱动管理", description = "数据源驱动管理")
public class FeignController {

    @Autowired
    RpcServer rpcServer;

    @RequestMapping("get")
    public String get(){
        return rpcServer.get();
    }

    @RequestMapping("get1")
    public String get1(){
        return rpcServer.get1();
    }

    @GetMapping("getFile")
    @ApiOperation(value="添加驱动", notes="添加驱动",response = HttpMessage.class)
    public void getFile(HttpServletResponse response)throws Exception{
        response.setContentType("application/x-download");
        try {
            response.setHeader("Content-disposition",
                    "attachment;filename=" + URLEncoder.encode("test.zip", "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        int len = 0;
        //5.创建数据缓冲区
        byte[] buffer = new byte[10000];
        //7.将FileInputStream流写入到buffer缓冲区

        ServletOutputStream out = response.getOutputStream();
        File file = new File("C:\\Users\\sky\\Desktop\\tes\\全数据源驱动yaml文件v1.0.zip");
        FileInputStream fileInputStream = new FileInputStream(file);
        while ((len = fileInputStream.read(buffer)) > 0){
            out.write(buffer, 0 ,len);
        }

    }
}
