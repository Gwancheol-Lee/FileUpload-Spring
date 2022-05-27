package co.kr.bp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import co.kr.bp.utils.FileUploadProperties;

@SpringBootApplication
@EnableConfigurationProperties({ 
	FileUploadProperties.class
})
public class FileUploadApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(FileUploadApplication.class, args);
	}

}
