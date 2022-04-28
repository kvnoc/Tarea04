<?php

namespace App\Model;

class Plato
{
    public $material = "";

    public $capacidad = "";
  
    public $color = "";

    public $funcion= "";

    public function __construct($mat, $cap, $col, $fun)
    {
        $this->establecerMaterial($mat);
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

    public function obtenerMaterial()
    {
        return $this->material;
    }

    public function establecerMaterial($mat)
    {
        $this->material = $mat;
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