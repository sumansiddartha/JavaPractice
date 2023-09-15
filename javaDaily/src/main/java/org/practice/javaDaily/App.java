package org.practice.javaDaily;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

import org.apache.commons.lang3.SystemUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Argument count: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }

        
        System.out.println("::currentDirectoryUsingSystemProperties::"+currentDirectoryUsingSystemProperties());
        System.out.println("::currentDirectoryUsingPaths::"+currentDirectoryUsingPaths());
        System.out.println("::currentDirectoryUsingFileSystems::"+currentDirectoryUsingFileSystems());
        System.out.println("::currentDirectoryUsingFile::"+currentDirectoryUsingFile());
        OperatingSystems();
        OperatingSystemSystemUtils();
    }
    public static String currentDirectoryUsingSystemProperties() {
    	return System.getProperty("user.dir");
    }
    
    public static String currentDirectoryUsingPaths() {
    	return Paths.get("").toAbsolutePath().toString();
    }
    public static String currentDirectoryUsingFileSystems() {
    	return FileSystems.getDefault().getPath("").toAbsolutePath().toString();
    }
    public static String currentDirectoryUsingFile() {
    	return new File("").getAbsolutePath();
    }
    
    //To Detect operating system
    public static String OperatingSystems() {
    	String os=System.getProperty("os.name");
    	 System.out.println("Using System Property: " + os);
    	 return os;
    }
    public static String OperatingSystemSystemUtils() {
    	String os=SystemUtils.OS_NAME;
    	System.out.println("using system utils:::"+os);
    	return os;
    }
}
