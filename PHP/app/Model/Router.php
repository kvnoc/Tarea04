<?php

namespace App\Model;

class Router
{
    public $color= "";

    public $marca = "";
  
    public $capacidad= "";

    public $funcion= "";

    public function __construct($mar, $cap, $col, $fun)
    {
        $this->establecerMarca($mar);
        $this->establecerCapacidad($cap);
        $this->establecerColor($col);
        $this->establecerFuncion($fun);
    }

    public function obtenerColor()
    {
        return $this->color;
    }

    public function establecerColor($col)
    {
        $this->color = $col;
    }

    public function obtenerCapacidad()
    {
        return $this->capacidad;
    }

    public function establecerCapacidad($cap)
    {
        $this->capacidad = $cap;
    }

    public function obtenerMarca()
    {
        return $this->marca;
    }

    public function establecerMarca($mar)
    {
        $this->marca = $mar;
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