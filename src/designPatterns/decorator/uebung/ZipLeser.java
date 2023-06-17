package designPatterns.decorator.uebung;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipLeser {
    public static void main(String[] args) {
        String zipFilePath = "resources/weatherStationLiveImplementation.zip";

        try (FileInputStream fileInputStream = new FileInputStream(zipFilePath);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream)) {

            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                String fileName = zipEntry.getName();
                long fileSize = zipEntry.getSize();

                byte[] byteArray = new byte[(int) fileSize];
                int bytesRead = zipInputStream.read(byteArray);

                if (bytesRead != -1) {
                    System.out.println("File Name: " + fileName);
                    System.out.println("File Size: " + fileSize);

                    //System.out.println(new String(byteArray, Charset.forName("ISO-8859-1")));
                    //System.out.println("--------------------------------------");
                }

                zipInputStream.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
