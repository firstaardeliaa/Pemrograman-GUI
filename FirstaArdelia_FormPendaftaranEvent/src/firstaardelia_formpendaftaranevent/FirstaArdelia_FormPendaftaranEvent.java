/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstaardelia_formpendaftaranevent;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene; 
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage; 

/**
 *
 * @author Firsta Ardelia (19201016)
 */

public class FirstaArdelia_FormPendaftaranEvent extends Application {
    
    
    @Override
    public void start(Stage window) {
    
        // === Membuat Label === //
        
        //Membuat Label Nama
        Text text_nama = new Text("Nama");
        Text text_titikdua_nama = new Text (":");
        TextField field_nama = new TextField();
    
        //Membuat Label Telepon
        Text text_telepon = new Text("Telepon");
        Text text_titikdua_telepon = new Text (":");
        TextField field_telepon = new TextField();
    
        //Membuat Label Alamat
        Text text_alamat = new Text("Alamat");
        Text text_titikdua_alamat = new Text (":");
        TextArea area_alamat = new TextArea();
       
        //Membuat Button
        TilePane tpane = new TilePane();
        Button button_kirim = new Button("Kirim");
        Button button_hapus = new Button("Hapus");
        tpane.setOrientation(Orientation.HORIZONTAL);
        tpane.setAlignment(Pos.CENTER);
        tpane.getChildren().addAll(button_kirim, button_hapus);
    
        // === GridPane === //
        
        GridPane index = new GridPane();
        index.setMinSize(500, 300);
        index.setPadding(new Insets(20,20,20,20));
        index.setVgap(5);
        index.setHgap(5);
        index.setAlignment(Pos.CENTER);
    
        //Baris Nama  
        index.add(text_nama,2,2);
        index.add(text_titikdua_nama,3,2);
        index.add(field_nama,4,2);
 
        //Baris Telepon  
        index.add(text_telepon,2,3);
        index.add(text_titikdua_telepon,3,3);
        index.add(field_telepon,4,3);
 
        //Baris Alamat  
        index.add(text_alamat,2,4);
        index.add(text_titikdua_alamat,3,4);
        index.add(area_alamat,4,4);
 
        //Baris Button
        index.add(tpane,4,5);
        
        // === Mengatur Tampilan === //
    
        // Mengatur Judul Window
        window.setTitle("Haluu World");
   
        // Memanggil Window
        Scene scene_dasar = new Scene(index);
        window.setScene(scene_dasar);
    
        // Menampilkan Window
        window.show();    
    }
    
    public static void main(String[] args){
        Application.launch(args);
    }
} 
