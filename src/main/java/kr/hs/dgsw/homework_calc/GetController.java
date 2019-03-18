package kr.hs.dgsw.homework_calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    private CalcService cs;

    @GetMapping("/calc")
    public String result(@RequestParam String result) {
        return cs.result(result);
    }
}
