package com.example.demo.domain.fileTest.controller;

import com.example.demo.domain.fileTest.controller.request.RequestFileInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/file")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class FileController {

    @PostMapping(value = "/uploadImgsWithText",
            consumes = { MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_JSON_VALUE })
    public String requestFileUploadWithText(
            @RequestPart(value = "fileList") List<MultipartFile> fileList,
            @RequestPart(value = "info") RequestFileInfo info) {

        try {
            for (MultipartFile multipartFile: fileList) {
                log.info("requestFileUploadWithText() - filename: " + multipartFile.getOriginalFilename());

                FileOutputStream writer = new FileOutputStream(
                        "/Users/jeongmyeongjin/proj/KHGPM-Frontend/JeongMyeongjin/frontend/src/assets/uploadImgs/" +
                                multipartFile.getOriginalFilename()
                );

                writer.write(multipartFile.getBytes());
                writer.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Upload Success!!!";
    }
}