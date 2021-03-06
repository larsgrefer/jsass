package io.bit3.jsass.function.arguments.factory;

import io.bit3.jsass.function.arguments.converter.ArgumentConverter;
import io.bit3.jsass.function.arguments.converter.FloatArgumentConverter;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class FloatArgumentConverterFactory implements ArgumentConverterFactory {

  @Override
  public boolean canHandle(Class<?> targetType) {
    return Float.class.isAssignableFrom(targetType)
        || float.class.isAssignableFrom(targetType);
  }

  @Override
  public ArgumentConverter create(Object object, Method method, Parameter parameter) {
    return new FloatArgumentConverter();
  }
}
