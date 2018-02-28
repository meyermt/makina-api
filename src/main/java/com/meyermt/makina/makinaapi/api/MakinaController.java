package com.meyermt.makina.makinaapi.api;

import com.meyermt.makina.makinaapi.beans.MakinaReply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/makinate")
public class MakinaController {

  @RequestMapping(method= RequestMethod.POST)
  public @ResponseBody MakinaReply makinate() {
    // do stuff here
    String first = "first thing";
    String second = "second thing";
    List<String> stuff = new ArrayList<>();
    stuff.add(first);
    stuff.add(second);
    return new MakinaReply(true, 90, stuff);
  }
}
