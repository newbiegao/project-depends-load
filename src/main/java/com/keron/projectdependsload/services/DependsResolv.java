package com.keron.projectdependsload.services;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

import static org.slf4j.LoggerFactory.getLogger;


@Service
public class DependsResolv {

    private static final Logger logger = getLogger(DependsResolv.class) ;

    @Autowired
    private LoadJarDepends loadJarDepends ;

    public void resolvFile( String filePath ){

        File file = new File(filePath) ;
        if(filePath.endsWith(".war")){
            loadJarDepends.resolv( file );
        } else if( filePath.endsWith(".jar") ){
            loadJarDepends.resolv( file );
        } else {
            logger.warn(" resolv is unsupport this file {} " , filePath ) ;
        }

    }


}
