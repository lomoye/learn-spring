package com.lomoye.springlearn.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.*;


/**
 * Created by lomoye on 2017/8/7.
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Resource resource = new ClassPathResource("mobile-only.png");
        InputStream input = resource.getInputStream();

        FileOutputStream output = new FileOutputStream(new File("C:\\githubWorkspace\\learn-spring\\springlearn\\src\\main\\resources\\b.png"));
        byte[] buffer = new byte[4096];
        int n;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
        }

        output.flush();

        output.close();
    }
}
