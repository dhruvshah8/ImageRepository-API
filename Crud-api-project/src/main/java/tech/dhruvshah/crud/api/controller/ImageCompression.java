package tech.dhruvshah.crud.api.controller;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class ImageCompression {

    public byte[] imageComp (String filepath) throws IOException {
        File fnew=new File(filepath);
        BufferedImage originalImage= ImageIO.read(fnew);
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        ImageIO.write(originalImage, "jpg", baos );
        byte[] imageInByte=baos.toByteArray();
        return imageInByte;
    }
}
