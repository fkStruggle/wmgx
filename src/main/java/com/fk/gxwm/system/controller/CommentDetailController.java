package com.fk.gxwm.system.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fk.gxwm.common.pojo.WgAnonymousComment;
import com.fk.gxwm.common.util.Page;

@Controller
@RequestMapping("/commentDetail")
public class CommentDetailController {
    @RequestMapping("/findAnoDynamics")
    public List<WgAnonymousComment> getComentDetails(Long dynamicid,Page page){
        
    }

}
