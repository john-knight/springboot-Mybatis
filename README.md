#  springboot-Mybatis
使用springboot整合mybatis的项目
#  2019-7-14：springmvc中@requestbody和@modelattribute的区别
使用@ModelAttribute注解的实体类接收前端发来的数据格式需要为"x-www-form-urlencoded"，@RequestBody注解的实体类接收前端的数据格式为JSON(application/json)格式。（若是使用@ModelAttribute接收application/json格式，虽然不会报错，但是值并不会自动填入）
#  2019-7-15：使项目结构更加符合规范，dao层负责基础数据操作，service负责业务逻辑处理
