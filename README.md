# springdemo
<P>
  springdemo是学习spring框架的记录性项目,下面是学习的视频地址与笔记地址<br/>
  学习网址：https://www.bilibili.com/video/av21335209/?p=8<br/>
  学习笔记：https://blog.csdn.net/szt292069892/article/details/81481005
</p>

<p>
  项目总体使用Maven仓库来配置各项依赖，但暂时未用到单元测试的功能，目前项目
  springdemo,springautowire,springrelation,springscope,springproperties,每个包包含一个主函数用于在main里进行测试
</p>
<p>
  <h3>springdemo</h3>
  旨在完成关于XML文件对于springbean的手动装配，其中包括
  <ul>
  <li>两种注入方式：构造器注入和setter方法注入</li>
  <li>一个bean引用另一个bean</li>
  <li>集合属性(List,set,map)的xml编写和外部集合的书写方式</li>
  </ul>
</p>
<p>
  <h3>springautowire</h3>
  实现spring的自动装配
</p>
<p>
  <h3>springrelation</h3>
  实现bean的继承和依赖的功能
</p>
<p>
  <h3>springscope</h3>
  通过单例singleton和原型prototype实现bean的作用域的功能
</p>
<p>
  <h3>springproperties</h3>
  通过导入外部属性文件和${}用法，实现外部属性引用的功能</br>
  <text color="red">注意代码由于未配置mysql，无法运行，只是为了使不报错导入了c3p0的包</text>
</p>


