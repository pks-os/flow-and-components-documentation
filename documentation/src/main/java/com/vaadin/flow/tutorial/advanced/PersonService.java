package com.vaadin.flow.tutorial.advanced;

import com.vaadin.flow.tutorial.annotations.CodeFor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@CodeFor("advanced/tutorial-dynamic-content.asciidoc")
public class PersonService {
    public PersonService() {

    }

    public byte[] loadPhoto(Integer id) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("");
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);

            return bytes;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
