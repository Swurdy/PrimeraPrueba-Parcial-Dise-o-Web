/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Parcial1.service;
import com.Parcial1.entity.Film;
import java.util.List;


public interface IFilmService {
    public List<Film> getAllFilm();
    public Film getFilmById(long id);
    public void saveFilm (Film film);
    public void delete (long id);
    
    
    
}
