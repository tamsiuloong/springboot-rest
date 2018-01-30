package com.coachtam.sj.web;

import com.coachtam.sj.entity.ResultVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈〉
 *
 * @author coach tam
 * @create 2018/1/30
 * @since 1.0.0
 * 〈坚持灵活 灵活坚持〉
 */

@RestController
@RequestMapping("/common/")
public class CommonView {



    @RequestMapping(value = "/403")
    @ResponseBody
    public ResultVO unauthorized() {
        ResultVO resultVO = new ResultVO();
        resultVO.setStatus(false);
        resultVO.setMsg("未授权啊!");
        return resultVO;
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public ResultVO login() {
        ResultVO resultVO = new ResultVO();
        resultVO.setStatus(false);
        resultVO.setMsg("未登录啊!");
        return resultVO;
    }
}
