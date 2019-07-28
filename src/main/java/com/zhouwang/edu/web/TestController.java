package com.zhouwang.edu.web;

import com.zhouwang.edu.domain.MatchInfoVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author zgw
 * date 2019/7/13
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/match")
    public MatchInfoVO match() {
        MatchInfoVO vo = new MatchInfoVO();
        vo.setScore("90分");
        vo.setDesc("上上优");
        return vo;
    }
}
