package per.zn.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/send")
public class SendToBaiduController {
    @RequestMapping(value="/view",method = RequestMethod.GET)
    public String index(){
        System.out.println("进来了");
        return "index";
    }

}
