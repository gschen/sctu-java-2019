package edu.sctu.servlet;

import com.jspsmart.upload.File;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write("hello");
        SmartUpload smartUpload = new SmartUpload();

        ServletConfig config = this.getServletConfig();

        smartUpload.initialize(config,req,resp);



        try {
            smartUpload.upload();
            //这个File一定是smartFile下的类
            File smartFile =  smartUpload.getFiles().getFile(0);
            smartFile.saveAs("/upload/"+smartFile.getFileName(),smartUpload.SAVE_VIRTUAL);
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }

        req.setAttribute("msg","成功上传文件");
        req.getRequestDispatcher("/ch13/uploadForm.jsp").forward(req,resp);

    }
}
