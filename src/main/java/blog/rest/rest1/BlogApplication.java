package blog.rest.rest1;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
 
    @ApplicationPath("/")
    public class BlogApplication extends ResourceConfig {
        public BlogApplication() {
            packages("blog.rest.rest1");
        }
       
    }