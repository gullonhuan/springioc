## 常用依赖
```xml
 <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
</dependency>
 ```

## 注解说明
- @Autowired : 自动装配通过类型、名字
  - Autowired不能唯一装配上属性，则需要通过@Qualifier(value="..")
- @Resource : 自动装配通过名字、类型
- @Nullable : 字段标记了这个注解，说明这个字段可以允许为null


- @Component : 将类托管到spring，实现简单类的自动成bean
- 