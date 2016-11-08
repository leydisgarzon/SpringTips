# SpringTips. Practices with Spring Framework.

Projects:
* IoCSpringExample
  - Dependencies: org.springframework > spring-context > 4.3.3.RELEASE
  - Tips: Xml context configuration, load xml context configuration, constructor injection, setter injection, inject literal values, inject value from properties file in xml context, bean scope(singleton, prototype...), bean lifecycle methods (init and destroy).
  
* IoCSpringAnnotation
  - Dependencies: org.springframework > spring-context > 4.3.3.RELEASE
  - Tips: Annotation context configuration with XML context configuration, configure for scanning package from xml file, constructor injection, setter injection, use of properties file for inject value,  bean lifecycle methods (init and destroy). Use of @Component, @Value, @Autowired, @Qualifier, @PostConstruct, @PreDestroy.
  
* IoCSpringAnnotationMavenJar
  - Dependencies: org.springframework > spring-context > 4.3.3.RELEASE
  - Tips: The same project as the above project (IoCSpringAnnotation) including maven configuration for the creation of the jar. Pom elements "maven-jar-plugin" and "maven-dependency-plugin".
  
* SpringMVC-FisrtApp 
  - Dependencies: org.springframework > spring-context > 4.3.3.RELEASE
                  javax.servlet > servlet-api > 3.0-alpha-1
  - Tips: Xml definition of the DispatcherServlet (front controller) in the web.xml: name, mapping and xml file config of the dispatcher. XML configuration of the distpacher in the spring-servlet.xml: define component-scan package, annotation-driven, views resolver, etc. Get the params from the request in the returned view using ${param.get("userName")} or ${param.userName} when userName is the name of the element in the form. Use of @Controller, @RequestMapping, @RequestParam.  
