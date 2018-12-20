/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.central;

import br.edu.iff.central.usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author aluno
 */
public class SessaoHibernate {
    
    private static SessionFactory sf;
    
    static {
        Configuration cfg = new AnnotationConfiguration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(usuario.class);
        sf = cfg.buildSessionFactory(); 
    }
    
    public static Session nova () {
        Session session = sf.openSession(); 
        return session;
    }
    
}
