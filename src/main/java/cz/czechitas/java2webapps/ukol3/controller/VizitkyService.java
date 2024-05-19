package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VizitkyService {
    private final List<Vizitka> vizitky = new ArrayList<>();

    public VizitkyService() {
        vizitky.add(new Vizitka(
                "Hana Nováková",
                "IT Solutions s.r.o.",
                "Náměstí Svobody 1",
                "Brno 602 00",
                "novakova.hana@firma.cz",
                "+420 777 123 456",
                "www.itsolutions.cz"
        ));
        vizitky.add(new Vizitka(
                "Barbora Dvořáková",
                "IT Consulting",
                "Hlavní třída 843/54",
                "Ostrava 708 00",
                "dvorakova.barbora@email.cz",
                null,
                null
        ));
        vizitky.add(new Vizitka(
                "Petra Svobodová",
                "Web Development",
                "Masarykova 326/36",
                "Plzeň 312 00",
                "svobodova.petra@seznam.cz",
                "+420 608 765 432",
                "www.petrasvobodova.cz"
        ));
    }

    public List<Vizitka> getAll() {
        return vizitky;
    }

    public Vizitka getById(int id) {
        return vizitky.get(id);
    }

    public void append(Vizitka vizitka) {
        vizitky.add(vizitka);
    }

    public void deleteById(int id) {
        vizitky.remove(id);
    }
}
