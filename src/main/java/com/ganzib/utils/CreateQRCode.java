package com.ganzib.utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;


import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

/**
 * 生成二维码
 * Created by GanZiB on 17/1/10.
 */
public class CreateQRCode {

    public static void main(String[] args) {
        int width = 300;
        int height = 300;
        String format = "png";
        String content = "www.imooc.com";
        //定义二维码参数
        HashMap hints = new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET,"UTF-8");
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        hints.put(EncodeHintType.MARGIN,2);

        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE,width,height);

            Path file = new File("/Users/ganjianwei/Desktop/img.png").toPath();

            MatrixToImageWriter.writeToPath(bitMatrix,format,file);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
