# 내장 서버

- 스프링 부트는 Tool, 서버는 톰캣이 담당 


```java
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        Tomcat tomcat = new Tomcat(); // 톰캣 객체 생성
        tomcat.setPort(8080); // 포트 설정 
        Context context = tomcat.addContext("/","/"); // 컨텍스 추가

        HttpServlet servlet = new HttpServlet() { // 서블릿 생성
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                super.doGet(req, resp);
                PrintWriter writer = resp.getWriter();
                writer.println("<html><head<title>");
                writer.println("Hey, Tomcat");
                writer.println("</title><head>");
                writer.println("<body><h1>Hello Tomcat</h1><body>");
                writer.println("</html>");
            }
        };

        String servletName = "HelloServlet"; 
        tomcat.addServlet("/",servletName,servlet); // 서블링 추가
        context.addServletMappingDecoded("/hello",servletName); // 컨텍스트에 서블릿 맵핑
        try {
            tomcat.start();
        }catch (Exception e){

        }
        tomcat.getServer().await();

//        tomcat.start();
    }
}
```