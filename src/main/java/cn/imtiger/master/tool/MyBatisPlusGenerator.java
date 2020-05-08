package cn.imtiger.master.tool;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.sql.SQLException;

public class MyBatisPlusGenerator {
	 
	public static void main(String[] args) throws SQLException {
		String[] access = {"ts_app", "ts_app_group", "ts_app_resource", "ts_app_role", "ts_app_role_resource", "ts_login_log", "ts_password_log", "ts_user", "ts_user_resource", "ts_user_role"};
//		String[] data = {"ts_dict", "ts_org", "ts_profile", "ts_region"};
//		String[] flow = {"ts_flow", "ts_flow_approver", "ts_flow_audit_log", "ts_flow_instance", "ts_flow_node", "ts_flow_node_instance"};
		doGenerator(access);
	}
		
	private static void doGenerator(String[] tableName){
		//1. 全局配置
		GlobalConfig config = new GlobalConfig();
		config.setActiveRecord(true) // 是否支持AR模式
			.setAuthor("Tiger Shen") // 作者
			.setOutputDir("D:\\workspace\\imtiger\\tiger-master\\src\\main\\java") // 生成路径
			.setFileOverride(false)  // 文件覆盖
			.setServiceName("%sService")  // 设置生成的service接口的名字
			.setMapperName("%sDao")
			.setEnableCache(false)// XML 二级缓存
			.setBaseResultMap(true)//生成基本的resultMap
			.setBaseColumnList(true);//生成基本的SQL片段
		
		//2. 数据源配置
		DataSourceConfig  dsConfig  = new DataSourceConfig();
		dsConfig.setDbType(DbType.MYSQL)  // 设置数据库类型
				.setDriverName("com.mysql.jdbc.Driver")
				.setUrl("jdbc:mysql://121.36.163.66:3306/tiger_master?useSSL=false")
				.setUsername("root")
				.setPassword("!QAZ2wsx");
		 
		//3. 策略配置globalConfiguration中
		StrategyConfig stConfig = new StrategyConfig();
		stConfig.setCapitalMode(false) //全局大写命名
//				.setDbColumnUnderline(true)  // 指定表名 字段名是否使用下划线
				.setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
				.setTablePrefix("ts_")
				.setInclude(tableName);  // 生成的表
		
		//4. 包名策略配置 
		PackageConfig pkConfig = new PackageConfig();
		pkConfig.setParent("cn.imtiger.master.access")
				.setMapper("dao")//dao
				.setService("service")//servcie
				.setController("controller")//controller
				.setEntity("entity")
				.setXml("mapper");//mapper.xml

		//5. 模板配置，不配置的话就走默认的模板
		TemplateConfig tpConfig = new TemplateConfig();
//		tpConfig.setEntity("/conf/mp_templates/entity.java.vm");
		tpConfig.setController(null);
//		tpConfig.setService("/conf/mp_templates/service.java.vm");
//		tpConfig.setServiceImpl("/conf/mp_templates/serviceImpl.java.vm");
//		tpConfig.setMapper("/conf/mp_templates/mapper.java.vm");
//		tpConfig.setXml("/conf/mp_templates/mapper.xml.vm");

		//6. 整合配置
		AutoGenerator  ag = new AutoGenerator();
		ag.setGlobalConfig(config)
		  .setDataSource(dsConfig)
		  .setStrategy(stConfig)
		  .setPackageInfo(pkConfig)
		  .setTemplate(tpConfig);
		
		//7. 执行
		ag.execute();
	}


}
