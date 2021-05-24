package kr.mjc.youngil.web.springmvc.v2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    /**
     * 다른 매핑이 안된 URI 요청이 왔을 경우에 이 메서드에 매핑된다.
     */
//    @GetMapping("/**")
    public void mapDefault() {

    }
}