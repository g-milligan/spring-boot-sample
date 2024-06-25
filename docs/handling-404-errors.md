# Handling 404 Errors in Spring Boot

<http://localhost:8080/does-not-exist>

By default, going to this page that does not exist will display the default "white label" error page. 

```
This application has no explicit mapping for /error, so you are seeing this as a fallback.
```

There are different ways to handle 404 error pages in Spring Boot, documented below:

## 404.html

Pros:
- Fastest / simplest way to handle errors

Cons:
- Does not provide dynamic handling (eg: logging)

Spring boot will automatically pick up .html error pages if they are named correctly and put into the correct folder. 

For example:

```
main\resources\public\error\404.html

main
|---resources
---|---public
------|---error
---------|---404.html
```

[Sample code](https://github.com/g-milligan/spring-boot-sample/blob/404htmlpage/src/main/resources/public/error/404.html)

## @ControllerAdvice

Pros:
- Catch all errors globally
- Can handle errors dynamically (eg: logging)

Cons:
- More than one different controller may be desired to handle errors

You can create a controller with the @ControllerAdvice annotation, to handle errors globally. 

All you have to do is create the controller .java file (sample code below).

Note: This @ControllerAdvice controller will override the HTML templates like the 404.html template. 

[Sample code](https://github.com/g-milligan/spring-boot-sample/blob/controlleradvice/src/main/java/com/example/javaproject/ControllerAdviceExceptionHandler.java)

## Custom Error Controller (implements ErrorController)

You can set up a custom error controller to handle different errors.

Define the error path in `application.properties`:

``` shell
# server.error.whitelabel.enabled=false
server.error.path=/error-test
```

note, `server.error.whitelabel.enabled` doesn't seem to be needed; the custom controller will overwrite the default whitelabel. 

[Sample --> application.properties](https://github.com/g-milligan/spring-boot-sample/blob/customerrorcontroller/src/main/resources/application.properties)

[Sample --> CustomErrorController.java](https://github.com/g-milligan/spring-boot-sample/blob/customerrorcontroller/src/main/java/com/example/javaproject/CustomErrorController.java)