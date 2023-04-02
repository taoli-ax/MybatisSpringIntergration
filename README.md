# MybatisSpringIntergration
学习mybatis集成到spring解决之前绑定失败的问题


### 常见的报错 : no tests found
1. 删除.idea
2. 删除target编译文件
3. 重新生成
4. 如果不行，重复上述步骤后，重启idea

### better-mybatis-generator 注意事项
1. mysql8需要在连接时设置时区 `jdbc:mysql://localhost:3306/db0?serverTimezone=GMT`
2. dataGrip也可以使用

