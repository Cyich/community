package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Yuqi Xi on 2020/2/22.
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){ return "index"; }
}
