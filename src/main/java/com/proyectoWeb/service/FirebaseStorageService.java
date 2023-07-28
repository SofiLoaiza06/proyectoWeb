package com.proyectoWeb.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com#
    final String BucketName = "Galatec-e59f0.appspot.com";

    //Esta es la ruta básica de este proyecto Galatec
    final String rutaSuperiorStorage = "Galatec";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "Galatec-e59f0-firebase-adminsdk-xd2j3-9c53f354fe.json";
}
