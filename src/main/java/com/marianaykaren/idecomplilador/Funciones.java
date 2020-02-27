
package com.marianaykaren.idecomplilador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Funciones {

    private JFileChooser accion = null;
    private File archivo = null;
    private IDE ide;
    public static String ruta = "";
    public static int cont_lineas = 1;

    public void LeerFichero(IDE ide) {
        this.ide = ide;
        accion = new JFileChooser();
        accion.setFileSelectionMode(0);
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("TXT", "txt");
        accion.setFileFilter(filtroImagen);
        accion.setDialogTitle("Abrir archivo");
        if (accion.showOpenDialog(ide) == JFileChooser.APPROVE_OPTION) {
            archivo = accion.getSelectedFile();
            ide.lbl_nombre.setText(archivo.getName());
            ruta = accion.getSelectedFile().toString();
            try {
                /*Si existe el fichero*/
                if (archivo.exists()) {
                    /*Abre un flujo de lectura a el fichero*/
                    BufferedReader leeArchivo = new BufferedReader(new FileReader(archivo));
                    String Slinea, datos = "";
                    /*Lee el fichero linea a linea hasta llegar a la ultima*/
                    while ((Slinea = leeArchivo.readLine()) != null) {
                        /*Imprime la linea leida*/
                        datos = datos + Slinea + "\n";
                        //ide.tfNumeros.setText(Integer.toString(cont_lineas) + "\n");
                        //cont_lineas ++;
                    }
                    
                    ide.epCodigo.setText(datos);
                    ide.epCodigo.setEditable(true);
                    ide.epCodigo.requestFocus();
                    /*Cierra el flujo*/
                    leeArchivo.close();
                    this.ide.abrioArchivo = true;
                    this.ide.creoNuevo = false;
                } else {
                    System.out.println("Fichero No Existe");
                }
            } catch (Exception ex) {
                /*Captura un posible error y le imprime en pantalla*/
                System.out.println(ex.getMessage());
            }
        }
    }

    public void CrearFicheroNuevo(IDE ide, String SCadena, String nombre) {
        this.ide = ide;

        accion = new JFileChooser();
        accion.setFileSelectionMode(0);
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("TXT", "txt");
        accion.setFileFilter(filtroImagen);
        accion.setDialogTitle("Guardar archivo " + nombre);
        accion.setSelectedFile(new File(nombre));
        if (accion.showSaveDialog(ide) == JFileChooser.APPROVE_OPTION) {
            ruta = accion.getSelectedFile().toString();
            archivo = new File(ruta);
            ide.lbl_nombre.setText(archivo.getName());
            try {
                //Si Existe el fichero lo borra
                if (archivo.exists()) {
                    archivo.delete();
                }
                BufferedWriter wr = new BufferedWriter(new FileWriter(archivo));
                FileWriter escribirArchivo = new FileWriter(archivo, true);
                BufferedWriter buffer = new BufferedWriter(escribirArchivo);
                buffer.write(SCadena);
                buffer.newLine();
                buffer.close();
                wr.close();
                escribirArchivo.close();

               this.ide.abrioArchivo = true;
               this.ide.creoNuevo = false;
            } catch (Exception ex) {
            }
        }
    }

    public void GuardarFichero(String SCadena, String nombre) {

        System.out.println(ruta);
        archivo = new File(ruta);
        try {
            //Si Existe el fichero lo borra
            if (archivo.exists()) {
                archivo.delete();
            }
            BufferedWriter wr = new BufferedWriter(new FileWriter(archivo));
            FileWriter escribirArchivo = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escribirArchivo);
            buffer.write(SCadena);
            buffer.newLine();
            buffer.close();
            wr.close();
            escribirArchivo.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla 
            System.out.println(ex.getMessage());
        }
    }


}

