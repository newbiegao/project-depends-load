package com.keron.projectdependsload.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DependsResolvTest {

    @Autowired
    private DependsResolv dependsResolv ;

    @Test
    public void resolvFileTest(){

        String warPath = "/Users/keron/Documents/project-depends-load/testfiles/project-depends-load-0.0.1-SNAPSHOT.war" ;
        String jarPath = "/Users/keron/Documents/project-depends-load/testfiles/project-depends-load-0.0.1-SNAPSHOT.jar" ; ;
        String filePath = "my-file.xml" ;

        dependsResolv.resolvFile(warPath);
        dependsResolv.resolvFile(jarPath);

    }

}
