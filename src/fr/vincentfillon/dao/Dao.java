package fr.vincentfillon.dao;

import fr.vincentfillon.connectivity.ConnectionClass;
import fr.vincentfillon.model.Film;

import java.sql.*;
import java.util.List;


public abstract class Dao<T> {
    protected Connection connect = null;

    public Dao(Connection conn){
        this.connect = conn;
    }

    /**
     * Méthode de création
     * @param obj
     * @return boolean
     */
    public abstract boolean create(T obj);

    /**
     * Méthode pour effacer
     * @param obj
     * @return boolean
     */
    public abstract boolean delete(T obj);

    /**
     * Méthode de mise à jour
     * @param obj
     * @return boolean
     */
    public abstract boolean update(T obj);

    /**
     * Méthode de recherche des informations
     * @param id
     * @return T
     */
    public abstract T find(int id);
}