1、创建一个普通的java项目

2、创建user Library

3、提供hibernate.cfg.xml文件，完成基本配置

4、建立实体类User

5、提供User.hbm.xml文件,完成实体类的映射

6、将User.hbm.xml文件加入到hibernate.cfg.xml文件中

7、编写工具类ExportDB.java,将hbm生成ddl

8、建立客户端类client，添加用户数据到MySQL

9、最好加入如下配置项，方便观察hibernate  SQL的生成
        <property name="hibernate.show_sql">true</property><!-- 将SQL语句打印到控制台 -->
		<property name="hibernate.format_sql">true</property><!-- 将SQL语句格式化后，打印到控制台 -->
       最好加入log4j配置文件，将该文件拷贝到src下，便于程序的调试	