/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Stiven
 */
public class Test {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter(new File("test.txt"));
    }
    
}
