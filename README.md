# springboot-Mybatis
使用springboot整合mybatis的项目
#mvc中@requestbody和@modelattribute的区别
使用@ModelAttribute注解的实体类接收前端发来的数据格式需要为"x-www-form-urlencoded"，
@RequestBody注解的实体类接收前端的数据格式为JSON(application/json)格式。
（若是使用@ModelAttribute接收application/json格式，虽然不会报错，但是值并不会自动填入）
