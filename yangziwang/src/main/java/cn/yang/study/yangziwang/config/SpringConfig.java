package cn.yang.study.yangziwang.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangziwang
 * @date 2023/11/30 11:19
 */
@Slf4j
@Configuration
public class SpringConfig implements InitializingBean {

    @Value(value = "${yangziwang}")
    private String yangziwang;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(yangziwang);
    }
}
