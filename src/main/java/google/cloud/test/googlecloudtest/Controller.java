package google.cloud.test.googlecloudtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

   @RequestMapping("/")
   public String home(){
       return ("<h1>hi all </h1>");
   }

   @RequestMapping("/admin")
    public String admin(){
       return ("<h1> Welcome to Admin</h1>");
   }

    @RequestMapping("/user")
    public String user(){
        return ("<h1> Welcome to user</h1>");
    }

    @RequestMapping("/index")
    public String index(){
        return ("<h1> Welcome to index</h1>");
    }

    @RequestMapping("/contact")
    public String contact(){
        return ("<h1> Welcome to contact</h1>");
    }
}
