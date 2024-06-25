# Handling 404 Errors in Spring Boot

<http://localhost:8080/does-not-exist>

By default, going to this page that does not exist will display the default "white label" error page. 

```
This application has no explicit mapping for /error, so you are seeing this as a fallback.
```

There are different ways to handle 404 error pages in Spring Boot, documented below:

## 404.html

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

[Sample code](#)