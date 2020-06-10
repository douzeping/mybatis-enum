package tech.zeping.mybatisenum.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import tech.zeping.mybatisenum.enums.converter.IntegerCodeConverterFactory;
import tech.zeping.mybatisenum.enums.converter.StringCodeToEnumConverterFactory;


@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 枚举类的转换器工厂 addConverterFactory
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(new IntegerCodeConverterFactory());
        registry.addConverterFactory(new StringCodeToEnumConverterFactory());
    }
}
