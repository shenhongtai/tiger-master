package cn.imtiger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.imtiger.master.*.dao")
@SpringBootApplication
public class TigerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TigerWebApplication.class, args);
	}

}
