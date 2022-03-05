package com.keron.projectdependsload.services;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class LoadJarDepends {

    private static final Logger logger = getLogger(LoadJarDepends.class) ;

    public void resolv( File file ){

        JarFile jarFile = null ;
        try{
            jarFile = new JarFile( file ) ;
            Enumeration<JarEntry> entries = jarFile.entries() ;
            while (entries.hasMoreElements()){
                JarEntry entry = entries.nextElement();
                if(entry.getName().endsWith(".jar")){
                    logger.info(" war file name : {} " , entry.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
