/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Parcial1.service;

import com.Parcial1.entity.Film;
import com.Parcial1.repository.FilmRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class FilmService implements IFilmService {

    @Autowired
    private FilmRepository FilmRepository;
    
    
    @Override
    public List<Film> getAllFilms() {
        return (List<Film>)FilmRepository.findAll();
    }

    @Override
    public Film getPersonaById(long id) {
        return FilmRepository.findById(id).orElse(null);
     }

    @Override
    public void saveFilm(Film film) {
        FilmRepository.save(film);
    }

    @Override
    public void delete(long id) {
        FilmRepository.deleteById(id);

    }

    @Override
    public List<Film> getAllFilm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
