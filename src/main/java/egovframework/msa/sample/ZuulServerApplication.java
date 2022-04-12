package egovframework.msa.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // End-Point를 이용한 라우팅을 허용 @EnableZuulServer + PreDecorationFilter + RibbonRoutingFilter + SimpleHostRoutingFilter 기능을 추가로 사용
@EnableDiscoveryClient // @EnableEurekaClient와 동일한 역할을 수행 다른 점은 Eureka뿐만 아니라 Consul, zookeeper도 지원
public class ZuulServerApplication {

	// zuul 서버는 API Gateway 역할만 담당
	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}

}
