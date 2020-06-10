package tech.zeping.mybatisenum.enums.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import tech.zeping.mybatisenum.enums.BaseCodeEnum;

import java.util.HashMap;
import java.util.Map;

public class IntegerCodeConverterFactory implements ConverterFactory<Integer, BaseCodeEnum> {
    private static final Map<Class, Converter> CONVERTERS = new HashMap<>();

    /**
     * 获取一个从 Integer 转化为 T 的转换器，T 是一个泛型，有多个实现
     *
     * @param targetType 转换后的类型
     * @return 返回一个转化器
     */
    @Override
    public <T extends BaseCodeEnum> Converter<Integer, T> getConverter(Class<T> targetType) {
        Converter<Integer, T> converter = CONVERTERS.get(targetType);
        if (converter == null) {
            converter = new IntegerToEnumConverter<>(targetType);
            CONVERTERS.put(targetType, converter);
        }
        return converter;
    }
}


