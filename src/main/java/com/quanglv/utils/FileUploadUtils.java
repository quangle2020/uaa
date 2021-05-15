package com.quanglv.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;

@Component
public class FileUploadUtils {

    public static final String UPLOADED_FOLDER = "uploads/";
    public static final String ROOT_PATH = System.getProperty("user.dir") + "/src/main/";
    public static final String EXTENSION_IMAGE_DEFAULT = "jpg";

    /**
     * upload single File
     *
     * @return file path
     * @throws IOException
     */
    public String uploadFile(MultipartFile file) throws IOException {
        Long time = new Date().getTime();
        String saveFilePath = "file"+ "/" + "product" +  "/" + time.toString() +"/";
        String fileName = genNameFile(file.getOriginalFilename());
        Path rootPath = Paths.get(ROOT_PATH + saveFilePath);

        if (!Files.exists(rootPath)) {
            Files.createDirectories(rootPath);
        }

//        if(request.getRemovePath() != null && !request.getRemovePath().isEmpty()){
//            deleteFile(request.getRemovePath());
//        }

        try (InputStream inputStream = file.getInputStream()) {
            Files.copy(inputStream, rootPath.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
        }

        return "http://localhost:9999" + "/" + saveFilePath + fileName;
    }

//    /**
//     *
//     *
//     * @param request
//     * @return
//     * @throws IOException
//     */
//    public String uploadFileAsByte(CommonRequestUploadFileAsByteDTO request) throws IOException {
//        if (request == null ||
//            request.getFile() ==  null ||
//            request.getServiceName() == null ||
//            request.getFolderName() == null ||
//            request.getFileName() == null){
//
//            throw new IOException("Bad request");
//        }
//
//        Long userId = authenticationUtils.getUserIdFromAuthenticationInfo();
//        String saveFilePath = Constants.UPLOADED_FOLDER + request.getServiceName() + Constants.SLASH + request.getFolderName() + Constants.SLASH;
//        String fileName = genNameFile(request.getFileName(), userId);
//        Path rootPath = Paths.get(Constants.ROOT_PATH + saveFilePath);
//
//        if (!Files.exists(rootPath)) {
//            Files.createDirectories(rootPath);
//        }
//
//        if(request.getRemovePath() != null && !request.getRemovePath().isEmpty()){
//            deleteFile(request.getRemovePath());
//        }
//
//        File fileDestination = new File(rootPath + Constants.SLASH + fileName);
//        FileOutputStream fileOutputStream = new FileOutputStream(fileDestination);
//
//        try {
//            fileOutputStream.write(request.getFile());
//        }
//        finally {
//            fileOutputStream.close();
//        }
//
//        return saveFilePath + fileName;
//    }

//    /**
//     * uploadFileAsByteWithOriginalName
//     * @param request
//     * @return file path
//     * @throws IOException
//     */
//    public String uploadFileAsByteWithOriginalName(CommonRequestUploadFileAsByteDTO request) throws IOException {
//        if (request == null ||
//                request.getFile() ==  null ||
//                request.getServiceName() == null ||
//                request.getFolderName() == null ||
//                request.getFileName() == null){
//
//            throw new IOException("Bad request");
//        }
//
//        String saveFilePath = Constants.UPLOADED_FOLDER + request.getServiceName() + Constants.SLASH + request.getFolderName() + Constants.SLASH;
//        Path rootPath = Paths.get(Constants.ROOT_PATH + saveFilePath);
//
//        if (!Files.exists(rootPath)) {
//            Files.createDirectories(rootPath);
//        }
//
//        if(request.getRemovePath() != null && !request.getRemovePath().isEmpty()){
//            deleteFile(request.getRemovePath());
//        }
//
//        File fileDestination = new File(rootPath + Constants.SLASH + request.getFileName());
//        FileOutputStream fileOutputStream = new FileOutputStream(fileDestination);
//
//        try {
//            fileOutputStream.write(request.getFile());
//        }
//        finally {
//            fileOutputStream.close();
//        }
//
//        return saveFilePath + request.getFileName();
//    }

    /**
     * delete file
     *
     * @param filePath
     * @throws IOException
     */
    public void deleteFile(String filePath) throws IOException {
        if(filePath == null || filePath.isEmpty() || isURL(filePath)) return;

        Path path = Paths.get(ROOT_PATH + filePath);

        if (Files.exists(path)) {
            try{
                Files.delete(path);
            }
            catch (IOException e){
                throw new IOException("Can't delete file: " + filePath, e);
            }

        }
    }

    /**
     * check url
     *
     * @param url
     * @return
     */
    public boolean isURL(String url) {
        try {
            (new java.net.URL(url)).openStream().close();
            return true;
        } catch (Exception ex) { }
        return false;
    }

    /**
     * genNameAvatar
     * @return String
     */
    private String genPathFile(String nameAvatar){
        StringBuilder s = new StringBuilder();
        s.append(UPLOADED_FOLDER);
        s.append(nameAvatar);
        return s.toString();
    }

    /**
     * genNameAvatar
     * @param fileName
     * @param id
     * @return String
     */
    private String genNameFile(String fileName){
        StringBuilder s = new StringBuilder();
        s.append(new Date().getTime());
        s.append(getFileExtension(fileName));
        return s.toString();
    }

    /**
     * getFileExtension
     * @param fileName
     * @return
     */
    private String getFileExtension(String fileName) {
        if(fileName == null || fileName.isEmpty()) return EXTENSION_IMAGE_DEFAULT;
        int lastIndexOf = fileName.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return ""; // empty extension
        }
        return fileName.substring(lastIndexOf);
    }

    /**
     * gen path to save in database
     * @param folderName
     * @param fileName
     * @return String
     */
    private String genPathInDB(String folderName, String fileName){
        StringBuilder s = new StringBuilder();
        s.append(folderName);
        s.append("/");
        s.append(fileName);
        return s.toString();
    }
}
