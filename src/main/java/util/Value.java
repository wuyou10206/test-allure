package util;

import java.lang.annotation.*;

/**
 * @author zhaowei
 * @date 2021/1/11 4:22 PM
 */
// 元注解  Target 作用域  Retention  生命周期  Inherited 允许子类继承   Documented  生成Javadoc时会包含注解信息
@Target({ElementType.ANNOTATION_TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Value {
    // 属性 无参无异常的方式
    // 基本类型、String、Class、Annotation、Enumeratation
    // 如果注解只有一个成员，则成员名必须取名为value()，在使用时可以忽略成员名和赋值好(=)
    // 注解类可以没有成员，没有成员的注解称为标识注解
    String desc();
    int age() default 18;
}
