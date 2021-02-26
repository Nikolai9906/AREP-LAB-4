package edu.escuelaing.arep.spring;

import edu.escuelaing.arep.httpserver.HttpServer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MicroSpringBoot {


    public static void main(String[] args) {

        args=new String[1];
        args[0] = "edu.escuelaing.arep.spring.HelloController";
        try {
            MicroSpring iocServer = new MicroSpring();
            iocServer.start(args);
            HttpServer server = new HttpServer(iocServer);
            server.start();
        } catch (Exception ex) {
            Logger.getLogger(MicroSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}