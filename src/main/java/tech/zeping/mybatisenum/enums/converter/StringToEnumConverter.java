package tech.zeping.mybatisenum.enums.converter;


import org.springframework.core.convert.converter.Converter;
import tech.zeping.mybatisenum.enums.BaseCodeEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StringToEnumConverter<T extends BaseCodeEnum> implements Converter<String, T> {
    private Map<String, T> enumMap = new HashMap<>();

    public StringToEnumConverter(Class<T> enumType) {
        T[] enums = enumType.getEnumConstants();
        for (T e : enums) {
            enumMap.put(e.getCode().toString(), e);
        }
    }

    @Override
    public T convert(String source) {
        T t = enumMap.get(source);
        if (Objects.isNull(t)) {
            throw new IllegalArgumentException("无法匹配对应的枚举类型");
        }
        return t;
    }
}