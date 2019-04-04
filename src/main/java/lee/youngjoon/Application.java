package lee.youngjoon;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        Context context = tomcat.addContext("/","/");

        HttpServlet servlet = new HttpServlet() {
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
        tomcat.addServlet("/",servletName,servlet);
        context.addServletMappingDecoded("/hello",servletName);
        try {
            tomcat.start();
        }catch (Exception e){

        }
        tomcat.getServer().await();

//        tomcat.start();
    }
}
