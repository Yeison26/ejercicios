/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_secuencias;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

/**
 *
 * @author Administrador
 */
public class CreateFile {

    // Secuencias
    // EnteroAleatorio;EnteroAleatoriao(mayor),cadenaCaracteresAleatoria(ACGT)1000 lineas codigo
    public CreateFile() throws IOException {

    }

    public static void main(String[] args) {

        int start, length;

        String sequence;

        Random rd = new Random();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("secuencias.umd"));
            CreateFile cf = new CreateFile();
            System.out.println(cf.countReads("CTA"));

            for (int i = 0; i < 10; i++) {

                start = Math.abs(rd.nextInt());
                length = 5 + rd.nextInt(25);

                sequence = "";

                for (int j = 0; j < length; j++) {

                    switch (rd.nextInt(4)) {

                        case 0:
                            sequence += "A";
                            break;

                        case 1:
                            sequence += "C";
                            break;
                        case 2:
                            sequence += "G";
                            break;
                        case 3:
                            sequence += "T";
                            break;
                    }

                }
                System.out.println(start + ", " + (start + length + "," + sequence));
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int countReads(String motif) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader("secuencias.umd"));
        String read;
        int lines = 0;
        read = br.readLine();//primer linea
        while (read != null) {

            if (read.split(",")[2].contains(motif));
            {
                lines += 1;

            }
            read = br.readLine();
        }

        return lines;
    }

}
