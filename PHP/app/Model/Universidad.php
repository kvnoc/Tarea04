<?php

namespace App\Model;

class Universidad
{
    public $nombre= "";

    public $tipo = "";
  
    public $capacidad= "";

    public $funcion= "";

    public function __construct($nom, $tip, $cap, $fun)
    {
        $this->establecerNombre($nom);
        $this->establecerCapacidad($cap);
        $this->establecerTipo($tip);
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

    public function obtenerCapacidad()
    {
        return $this->capacidad;
    }

    public function establecerCapacidad($cap)
    {
        $this->capacidad = $cap;
    }

    public function obtenerTipo()
    {
        return $this->tipo;
    }

    public function establecerTipo($tip)
    {
        $this->tipo = $tip;
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