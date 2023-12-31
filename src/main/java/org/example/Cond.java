package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Cond {

    public static void main(String[] args) throws IOException {

            Scanner scan = new Scanner(new File("INPUT.TXT"));
            int troom = scan.nextInt();
            int tcond = scan.nextInt();
            String mode = scan.next();
            modeCond(troom, tcond, mode);
    }

        public static int modeCond(int troom, int tcond, String mode) throws IOException {
                int t = troom;

                if ((mode.equals("fan"))){t= troom;}

                if ((troom <= tcond)&((mode.equals("auto"))|(mode.equals("heat")))){t = tcond;}

                if ((troom > tcond)&((mode.equals("auto"))|(mode.equals("freeze")))){t = tcond;}

                String outputFName = "OUTPUT.TXT";//запись в файл результата
                Files.writeString(Path.of(outputFName), String.valueOf(t));
            return t;
        }

}
