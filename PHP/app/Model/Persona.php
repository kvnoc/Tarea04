<?php

namespace App\Model;

class Persona
{
    public $nombre= "";
  
    public $edad = "";
  
    public $genero = "";

    public $funcion= "";

    public function __construct($nom, $ed, $gen, $fun)
    {
        $this->establecerNombre($nom);
        $this->establecerEdad($ed);
        $this->establecerGenero($gen);
        $this->establecerFuncion($fun);
    }

    public function obtenerNombre()
    {
        return $this->nombre;
    }

    public function establecerNombre($nom)
    {
        $this->nombre = $nom;
    }

    public function obtenerEdad()
    {
        return $this->edad;
    }

    public function establecerEdad($ed)
    {
        $this->edad = $ed;
    }

    public function obtenerGenero()
    {
        return $this->genero;
    }

    public function establecerGenero($gen)
    {
        $this->genero = $gen;
    }

    public function obtenerFuncion()
    {
        return $this->funcion;
    }

    public function establecerFuncion($fun)
    {
        $this->funcion = $fun;
    }
}