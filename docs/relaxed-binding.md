# "Relaxed Binding" in Spring Boot

**Question**: What is "relaxed binding" in Spring Boot?

**Google answer**: "In Spring Boot, "relaxed binding" refers to a feature that allows you to define your configuration properties in a more flexible and forgiving way."

___

**Question**: What ways does relaxed binding allow configuration properties to be more flexible / forgiving?

**Answer**: Relaxed binding allows alternate versions of configuration property keys to all be treated as the same key. For example:

For example, the following properties all result in the mapping `spring.jpa.databaseplatform=mysql`:
``` shell
spring.jpa.database-platform=mysql
spring.jpa.databasePlatform=mysql
spring.JPA.database_platform=mysql
```

You can use, `dashes`, or `underscores` or `camel-casing`. These alternate versions all get distilled into the same equivalent property. 

___

**Question**: What is a major reason for relaxed binding?

**Answer**: "The main reason behind relaxed binding is to offer flexibility, particularly when the property source does not support certain characters: OS environment variables must be upper case or could not contain a dot on certain [operating systems]." [source](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-Configuration-Binding)

___

[more information about relaxed binding](https://github.com/spring-projects/spring-boot/wiki/Relaxed-Binding-2.0)
