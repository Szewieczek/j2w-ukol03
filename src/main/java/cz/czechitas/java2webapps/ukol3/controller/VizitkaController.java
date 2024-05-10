package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
    private final List<Vizitka> vizitky = List.of(
            new Vizitka(
                    "Hana Nováková",
                    "IT Solutions s.r.o.",
                    "Náměstí Svobody 1",
                    "Brno 602 00",
                    "novakova.hana@firma.cz",
                    "+420 777 123 456",
                    "www.itsolutions.cz"
            ),
            new Vizitka(
                    "Barbora Dvořáková",
                    "IT Consulting",
                    "Hlavní třída 843/54",
                    "Ostrava 708 00",
                    "dvorakova.barbora@email.cz",
                    null,
                    null
            ),
            new Vizitka(
                    "Petra Svobodová",
                    "Web Development",
                    "Masarykova 326/36",
                    "Plzeň 312 00",
                    "svobodova.petra@seznam.cz",
                    "+420 608 765 432",
                    "www.petrasvobodova.cz"
            )
    );

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView model = new ModelAndView("seznam");
        model.addObject("vizitky", vizitky);
        return model;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView model = new ModelAndView("detail");
        model.addObject("vizitky", vizitky.get(id));
        return model;
    }
}
