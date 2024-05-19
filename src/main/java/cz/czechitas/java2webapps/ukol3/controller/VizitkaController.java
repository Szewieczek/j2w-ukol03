package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
    private final VizitkyService service;

    public VizitkaController(VizitkyService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView model = new ModelAndView("seznam");
        model.addObject("vizitky", service.getAll());
        return model;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView model = new ModelAndView("detail");
        model.addObject("vizitky", service.getById(id));
        model.addObject("id", id);
        return model;
    }

    @PostMapping("/delete-card")
    public String delete(int id) {
        service.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/nova")
    public ModelAndView formular() {
        return new ModelAndView("formular");
    }

    @PostMapping("/nova")
    public String append(Vizitka vizitka) {
        service.append(vizitka);
        return "redirect:/";
    }
}
