package pl.agaciak.trashroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.agaciak.trashroom.model.Towar;
import pl.agaciak.trashroom.service.TowarService;

import java.util.List;

@Controller
public class TowarConroller {

    private final TowarService towarService;

    public TowarConroller(TowarService towarService) {
        this.towarService = towarService;
    }


    @GetMapping("/")
    public ModelAndView showTowary() {

        List<Towar> towary = towarService.getTowarlist();

        ModelAndView modelAndView = new ModelAndView("towar");
        modelAndView.addObject("towary", towary);
        return modelAndView;
    }


}
