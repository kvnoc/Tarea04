<?php

require_once __DIR__.'/bootstrap/app.php';

//Cambiar la clase
use App\Model\Zapato;

//Cambiar la clase
$zapato = new Zapato("Calimod -", " 300 Soles-", " Canela -", " Proteger el pie de las inclemencias del tiempo");

//Cambiar los metodos (operaciones)
echo $zapato->obtenerMarca();
echo $zapato->obtenerPrecio();
echo $zapato->obtenerColor();
echo $zapato->obtenerFuncion();