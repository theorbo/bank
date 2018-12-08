package springBoot.bank;

import java.net.URISyntaxException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MainConfig {

	/*
	 * @Bean public BasicDataSource dataSource() throws URISyntaxException { String
	 * dbUrl =
	 * "jdbc:postgres://ec2-54-243-150-10.compute-1.amazonaws.com:5432/d12v2tai2ukbbs";
	 * String username = "lzsrfbnqqsyryc"; String password =
	 * "22aefdf49632558e2d27396c7a43b939d9601e5cf6b959473be2295462d510e0";
	 * BasicDataSource basicDataSource = new BasicDataSource();
	 * basicDataSource.setUrl(dbUrl); basicDataSource.setUsername(username);
	 * basicDataSource.setPassword(password);
	 * 
	 * return basicDataSource; }
	 */

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		//return DataSourceBuilder.create().build();
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("org.postgresql.Driver");
	   // dataSource.setUrl("jdbc:postgres://ec2-54-243-150-10.compute-1.amazonaws.com:5432/d12v2tai2ukbbs");
	    dataSource.setUrl("postgres://lzsrfbnqqsyryc:22aefdf49632558e2d27396c7a43b939d9601e5cf6b959473be2295462d510e0@ec2-54-243-150-10.compute-1.amazonaws.com:5432/d12v2tai2ukbbs");
	    dataSource.setUsername("lzsrfbnqqsyryc");
	    dataSource.setPassword("22aefdf49632558e2d27396c7a43b939d9601e5cf6b959473be2295462d510e0");

	    return dataSource;

	}
}
