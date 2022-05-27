package co.kr.bp.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;

// application.properties 파일과 POJO class를 연결해준다.
@ConfigurationProperties(prefix="file")
public class FileUploadProperties {
	private String uploadDir;
	 
    public String getUploadDir() {
        return uploadDir;
    }
 
    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
