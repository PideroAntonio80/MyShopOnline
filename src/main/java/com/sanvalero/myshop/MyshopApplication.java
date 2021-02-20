package com.sanvalero.myshop;

/* En static meteré cosas estaticas, es decir, cosas sin código, que no requieren procesamiento: Fotos, iconos, javascript,
   Algún fichero HTML que no tenga que procesarse...

   En templates meteré las plantillas que van a confeccionar la parte de HTML que va a mezclarse con el código

   El application.properties es el fichero de configuración. Spring ya buscará directamente aquí cosas que yo le meta como
   por ejemplo el puerto de un servidor */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyshopApplication.class, args);

	}



}
